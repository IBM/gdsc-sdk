# .AuditServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auditServiceGetActivityRecords**](AuditServiceApi.md#auditServiceGetActivityRecords) | **GET** /api/v3/activity | Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \&quot;op1, op2, op3\&quot;.
[**auditServicePutDownloadActivityRecord**](AuditServiceApi.md#auditServicePutDownloadActivityRecord) | **POST** /api/v3/activity | Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.


# **auditServiceGetActivityRecords**
> Auditv3GetActivityRecordsResponse auditServiceGetActivityRecords()


### Example


```typescript
import { createConfiguration, AuditServiceApi } from '';
import type { AuditServiceApiAuditServiceGetActivityRecordsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AuditServiceApi(configuration);

const request: AuditServiceApiAuditServiceGetActivityRecordsRequest = {
    // Return records starting at this time (>=). (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
    // Return records ending before this time (<). (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
    // Return records with this service/collection id. (optional)
  uid: "uid_example",
    // Return records matching this operation (CRUD or other action). (optional)
  actionTaken: "action_taken_example",
    // Return records for this service/collection. (optional)
  context: "context_example",
    // Return records created only for this reason. (optional)
  changesMade: "changes_made_example",
    // Return records originating with the specified user id. (optional)
  performedBy: "performed_by_example",
    // Return records with this label. (optional)
  contextDescription: "context_description_example",
    // Return records based on the query. (optional)
  query: "query_example",
    // The amount to offset the rows by for pagination. (optional)
  offset: 1,
    // The max amount of rows to return for pagination. (optional)
  limit: 1,
    // Return eligable filters if this is true. (optional)
  filter: true,
};

const data = await apiInstance.auditServiceGetActivityRecords(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | [**Date**] | Return records starting at this time (&gt;&#x3D;). | (optional) defaults to undefined
 **endTime** | [**Date**] | Return records ending before this time (&lt;). | (optional) defaults to undefined
 **uid** | [**string**] | Return records with this service/collection id. | (optional) defaults to undefined
 **actionTaken** | [**string**] | Return records matching this operation (CRUD or other action). | (optional) defaults to undefined
 **context** | [**string**] | Return records for this service/collection. | (optional) defaults to undefined
 **changesMade** | [**string**] | Return records created only for this reason. | (optional) defaults to undefined
 **performedBy** | [**string**] | Return records originating with the specified user id. | (optional) defaults to undefined
 **contextDescription** | [**string**] | Return records with this label. | (optional) defaults to undefined
 **query** | [**string**] | Return records based on the query. | (optional) defaults to undefined
 **offset** | [**number**] | The amount to offset the rows by for pagination. | (optional) defaults to undefined
 **limit** | [**number**] | The max amount of rows to return for pagination. | (optional) defaults to undefined
 **filter** | [**boolean**] | Return eligable filters if this is true. | (optional) defaults to undefined


### Return type

**Auditv3GetActivityRecordsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **auditServicePutDownloadActivityRecord**
> Auditv3PutActivityRecordResponse auditServicePutDownloadActivityRecord(auditv3PutActivityRecordRequest)


### Example


```typescript
import { createConfiguration, AuditServiceApi } from '';
import type { AuditServiceApiAuditServicePutDownloadActivityRecordRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AuditServiceApi(configuration);

const request: AuditServiceApiAuditServicePutDownloadActivityRecordRequest = {
  
  auditv3PutActivityRecordRequest: {
    actionTaken: "actionTaken_example",
    changesMade: "changesMade_example",
    context: "context_example",
    contextDescription: "contextDescription_example",
    performedBy: "performedBy_example",
    uid: "uid_example",
  },
};

const data = await apiInstance.auditServicePutDownloadActivityRecord(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditv3PutActivityRecordRequest** | **Auditv3PutActivityRecordRequest**|  |


### Return type

**Auditv3PutActivityRecordResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


