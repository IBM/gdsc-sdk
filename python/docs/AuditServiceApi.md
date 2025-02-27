# ibm_gdsc_sdk_saas.AuditServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audit_service_get_activity_records**](AuditServiceApi.md#audit_service_get_activity_records) | **GET** /api/v3/activity | Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \&quot;op1, op2, op3\&quot;.
[**audit_service_put_download_activity_record**](AuditServiceApi.md#audit_service_put_download_activity_record) | **POST** /api/v3/activity | Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.


# **audit_service_get_activity_records**
> Auditv3GetActivityRecordsResponse audit_service_get_activity_records(start_time=start_time, end_time=end_time, uid=uid, action_taken=action_taken, context=context, changes_made=changes_made, performed_by=performed_by, context_description=context_description, query=query, offset=offset, limit=limit, filter=filter)

Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \"op1, op2, op3\".

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.auditv3_get_activity_records_response import Auditv3GetActivityRecordsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.AuditServiceApi(api_client)
    start_time = '2013-10-20T19:20:30+01:00' # datetime | Return records starting at this time (>=). (optional)
    end_time = '2013-10-20T19:20:30+01:00' # datetime | Return records ending before this time (<). (optional)
    uid = 'uid_example' # str | Return records with this service/collection id. (optional)
    action_taken = 'action_taken_example' # str | Return records matching this operation (CRUD or other action). (optional)
    context = 'context_example' # str | Return records for this service/collection. (optional)
    changes_made = 'changes_made_example' # str | Return records created only for this reason. (optional)
    performed_by = 'performed_by_example' # str | Return records originating with the specified user id. (optional)
    context_description = 'context_description_example' # str | Return records with this label. (optional)
    query = 'query_example' # str | Return records based on the query. (optional)
    offset = 56 # int | The amount to offset the rows by for pagination. (optional)
    limit = 56 # int | The max amount of rows to return for pagination. (optional)
    filter = True # bool | Return eligable filters if this is true. (optional)

    try:
        # Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \"op1, op2, op3\".
        api_response = api_instance.audit_service_get_activity_records(start_time=start_time, end_time=end_time, uid=uid, action_taken=action_taken, context=context, changes_made=changes_made, performed_by=performed_by, context_description=context_description, query=query, offset=offset, limit=limit, filter=filter)
        print("The response of AuditServiceApi->audit_service_get_activity_records:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuditServiceApi->audit_service_get_activity_records: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **datetime**| Return records starting at this time (&gt;&#x3D;). | [optional] 
 **end_time** | **datetime**| Return records ending before this time (&lt;). | [optional] 
 **uid** | **str**| Return records with this service/collection id. | [optional] 
 **action_taken** | **str**| Return records matching this operation (CRUD or other action). | [optional] 
 **context** | **str**| Return records for this service/collection. | [optional] 
 **changes_made** | **str**| Return records created only for this reason. | [optional] 
 **performed_by** | **str**| Return records originating with the specified user id. | [optional] 
 **context_description** | **str**| Return records with this label. | [optional] 
 **query** | **str**| Return records based on the query. | [optional] 
 **offset** | **int**| The amount to offset the rows by for pagination. | [optional] 
 **limit** | **int**| The max amount of rows to return for pagination. | [optional] 
 **filter** | **bool**| Return eligable filters if this is true. | [optional] 

### Return type

[**Auditv3GetActivityRecordsResponse**](Auditv3GetActivityRecordsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audit_service_put_download_activity_record**
> Auditv3PutActivityRecordResponse audit_service_put_download_activity_record(auditv3_put_activity_record_request)

Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.auditv3_put_activity_record_request import Auditv3PutActivityRecordRequest
from ibm_gdsc_sdk_saas.models.auditv3_put_activity_record_response import Auditv3PutActivityRecordResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.AuditServiceApi(api_client)
    auditv3_put_activity_record_request = ibm_gdsc_sdk_saas.Auditv3PutActivityRecordRequest() # Auditv3PutActivityRecordRequest | 

    try:
        # Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.
        api_response = api_instance.audit_service_put_download_activity_record(auditv3_put_activity_record_request)
        print("The response of AuditServiceApi->audit_service_put_download_activity_record:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuditServiceApi->audit_service_put_download_activity_record: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditv3_put_activity_record_request** | [**Auditv3PutActivityRecordRequest**](Auditv3PutActivityRecordRequest.md)|  | 

### Return type

[**Auditv3PutActivityRecordResponse**](Auditv3PutActivityRecordResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

