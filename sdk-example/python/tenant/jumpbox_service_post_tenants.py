import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.jumpboxv3_post_tenants_request import Jumpboxv3PostTenantsRequest
from ibm_gdsc_sdk_software.models.jumpboxv3_post_tenants_response import Jumpboxv3PostTenantsResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint
import os
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
# configuration = ibm_gdsc_sdk_software.Configuration(
#     host = "https://localhost"
# )

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    host = os.environ['URL'],
    username = "cpadmin",
    password = os.environ['CPADMIN_PASSWORD']
)

# Configure API key authorization: ApiKeyAuth
#configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#configuration.api_key_prefix['ApiKeyAuth'] = 'Basic ...'
configuration.verify_ssl = False
# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    jumpboxv3_post_tenants_request = ibm_gdsc_sdk_software.Jumpboxv3PostTenantsRequest() # Jumpboxv3PostTenantsRequest | 

    # TODO update the JSON string below
    json = '{"name": "Test01","uid": "minhui_yang@us.ibm.com"}'
    # create an instance of Jumpboxv3PostTenantsRequest from a JSON string
    jumpboxv3_post_tenants_request_instance = Jumpboxv3PostTenantsRequest.from_json(json)
    # print the JSON string representation of the object

    # convert the object into a dict
    jumpboxv3_post_tenants_request_dict = jumpboxv3_post_tenants_request_instance.to_dict()
    # create an instance of Jumpboxv3PostTenantsRequest from a dict
    jumpboxv3_post_tenants_request_from_dict = Jumpboxv3PostTenantsRequest.from_dict(jumpboxv3_post_tenants_request_dict)

    try:
        # Summary: Post tenants Description: Create a tenant.
        api_response = api_instance.jumpbox_service_post_tenants(jumpboxv3_post_tenants_request_from_dict)
        print("The response of JumpboxServiceApi->jumpbox_service_post_tenants:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_post_tenants: %s\n" % e)