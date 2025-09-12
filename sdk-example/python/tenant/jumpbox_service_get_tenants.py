import ibm_gdsc_sdk_saas
from ibm_gdsc_sdk_saas.models.jumpboxv3_post_tenants_request import Jumpboxv3PostTenantsRequest
from ibm_gdsc_sdk_saas.models.jumpboxv3_post_tenants_response import Jumpboxv3PostTenantsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint
import os
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
# configuration = ibm_gdsc_sdk_saas.Configuration(
#     host = "https://localhost"
# )

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
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
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.JumpboxServiceApi(api_client)
    uid = '' # str | Email. (optional)
    external_id = '' # str | External id. (optional)
    include_inactive = True # bool | Include inactive. (optional)
    include_not_ready = True # bool | Include tenants that are not ready(are in state of being created or deleted). (optional)

    try:
        # Summary: Get tenants Description: Get all tenant base on UID.
        api_response = api_instance.jumpbox_service_get_tenants(uid=uid, external_id=external_id, include_inactive=include_inactive, include_not_ready=include_not_ready)
        print("The response of JumpboxServiceApi->jumpbox_service_get_tenants:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_get_tenants: %s\n" % e)