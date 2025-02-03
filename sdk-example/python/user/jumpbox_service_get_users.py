import time
import os
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.tenantuserv3_get_users_response import Tenantuserv3GetUsersResponse
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
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#configuration.api_key_prefix['ApiKeyAuth'] = "Basic NDcwMzBhMGUtNmRjMi00OTNiLTkzNGMtOTgxOWQxNTE0NzA3OmVlYjBhNDE2LTA0YWYtNDJiOS1iNjBkLTdlNjViNjE5MjQ3MQ=="
# Enter a context with an instance of the API client

with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    uid = '' # str | Email. (optional)

    try:
        # Summary: Get users Description: Get all users base on a tenantID.
        api_response = api_instance.jumpbox_service_get_users(uid=uid)
        print("The response of JumpboxServiceApi->jumpbox_service_get_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_get_users: %s\n" % e)
