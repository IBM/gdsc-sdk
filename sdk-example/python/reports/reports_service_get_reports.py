import time
import os
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.reportsv3_get_reports_response import Reportsv3GetReportsResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

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


# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.ReportsServiceApi(api_client)
    category_id = '000000000000000000000005' # str | Optional Category ID parameter. (optional)
    table_name = '' # str | Optional table name parameter. (optional)

    try:
        # Summary: Get reports Description: Get reports list.
        api_response = api_instance.reports_service_get_reports(category_id=category_id, table_name=table_name)
        print("The response of ReportsServiceApi->reports_service_get_reports:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_reports: %s\n" % e)