import time
import os
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.jumpboxv3_post_users_bulk_request import Jumpboxv3PostUsersBulkRequest
from ibm_gdsc_sdk_software.models.jumpboxv3_post_users_bulk_response import Jumpboxv3PostUsersBulkResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint
from ibm_gdsc_sdk_software.models.jumpboxv3_user import Jumpboxv3User
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
    api_instance = ibm_gdsc_sdk_software.JumpboxServiceApi(api_client)
    # create an instance of Jumpboxv3User from a JSON string
    json = '{"users":[{"distinguished_name":"uid=2J9097897,c=us,ou=bluepages,o=ibm.com","roles":["admin","default"]}]}'
    # create an instance of Jumpboxv3PostUsersBulkRequest from a JSON string
    jumpboxv3_post_users_bulk_request_instance = Jumpboxv3PostUsersBulkRequest.from_json(json)
 
    try:
        # Summary: Post users Description: Create users.
        api_response = api_instance.jumpbox_service_post_users(jumpboxv3_post_users_bulk_request_instance)
        print("The response of JumpboxServiceApi->jumpbox_service_post_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_post_users: %s\n" % e)