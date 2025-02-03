import time
import os
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.reportsrunnerv3_run_report_request import Reportsrunnerv3RunReportRequest
from ibm_gdsc_sdk_software.models.stream_result_of_reportsrunnerv3_run_report_response import StreamResultOfReportsrunnerv3RunReportResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint
import json
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
# configuration = ibm_gdsc_sdk_software.Configuration(
#     host = ""
# )

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.
# APIKEY=os.environ['APIKEY']
# SECRET=os.environ['SECRET']
# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    host = os.environ['URL'],
    username = os.environ['API_USERNAME'],
    password = os.environ['API_PASSWORD']
)


# Configure API key authorization: ApiKeyAuth
#configuration.api_key['ApiKeyAuth'] = os.environ['API_KEY']
configuration.verify_ssl = False
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#configuration.api_key_prefix['ApiKeyAuth'] = 'Basic'
# Enter a context with an instance of the API client

with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.ReportsRunnerApi(api_client)
    # TODO update the JSON string below
    FETCH_SIZE = 10
    OFFSET=0
    reports = []
    while True:
        # full SQL report
        # Run report by report ID or by specifying report definition
        # create an instance of Reportsrunnerv3RunReportRequest from a JSON string
        request = Reportsrunnerv3RunReportRequest.from_json(json.dumps({'report_id':'000000000000000000000905','fetch_size':FETCH_SIZE,'offset': OFFSET}))
        try:
            api_response = api_instance.reports_runner_run_report(request)
            if api_response.result.data != None:
                reports.extend(api_response.result.data)
            if api_response.result.final_result != None:
                #reach the end of pagination!
                break
            #increase offset, and fetch next page.
            OFFSET += FETCH_SIZE
        except Exception as e:
            print("Exception when calling ReportsRunnerApi->reports_runner_run_report: %s\n" % e)
    pprint(reports)
