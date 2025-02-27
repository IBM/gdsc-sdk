# .NotificationsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationsServiceCreateTicket**](NotificationsServiceApi.md#notificationsServiceCreateTicket) | **POST** /api/v3/integrations/ticket | Summary: Create ticket Description: Create ticket based on information passed in.
[**notificationsServiceGetFolders**](NotificationsServiceApi.md#notificationsServiceGetFolders) | **POST** /api/v3/integrations/folders | Summary: Get folders Description: Get folder for the integration connection provided.
[**notificationsServiceGetNotificationFilename**](NotificationsServiceApi.md#notificationsServiceGetNotificationFilename) | **GET** /api/v3/notifications/filename | Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
[**notificationsServiceGetNotificationRecord**](NotificationsServiceApi.md#notificationsServiceGetNotificationRecord) | **GET** /api/v3/notifications/details/{notification_id} | Summary: Get notification record Description: Return notifications record with the specified ID.
[**notificationsServiceGetNotificationRecords**](NotificationsServiceApi.md#notificationsServiceGetNotificationRecords) | **GET** /api/v3/notifications | Summary: Get notification records Description: Return notifications records that match the specified filter.
[**notificationsServiceGetTicketStatus**](NotificationsServiceApi.md#notificationsServiceGetTicketStatus) | **GET** /api/v3/integrations/ticket/status | Summary: Get ticket status Description: Get the status of the given ticket
[**notificationsServicePostNotificationRecord**](NotificationsServiceApi.md#notificationsServicePostNotificationRecord) | **POST** /api/v3/notifications | Summary: For PostNotificationRecord notification only Description: Sends notification with recipients and returns a status
[**notificationsServiceSearchNotificationRecords**](NotificationsServiceApi.md#notificationsServiceSearchNotificationRecords) | **POST** /api/v3/notifications/search | Summary: Search notification records Description: Return notification records using pipeline of filters
[**notificationsServiceTestIntegration**](NotificationsServiceApi.md#notificationsServiceTestIntegration) | **POST** /api/v3/integrations/test | Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
[**notificationsServiceUpdateNotificationRecord**](NotificationsServiceApi.md#notificationsServiceUpdateNotificationRecord) | **PUT** /api/v3/notifications | Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.


# **notificationsServiceCreateTicket**
> Notificationsv3CreateTicketResponse notificationsServiceCreateTicket(notificationsv3CreateTicketRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceCreateTicketRequest = {
  // Notificationsv3CreateTicketRequest
  notificationsv3CreateTicketRequest: {
    additionalData: {
      "key": "key_example",
    },
    contents: "contents_example",
    integrationId: "integrationId_example",
    severity: "UNDEFINED",
    title: "title_example",
  },
};

apiInstance.notificationsServiceCreateTicket(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3CreateTicketRequest** | **Notificationsv3CreateTicketRequest**|  |


### Return type

**Notificationsv3CreateTicketResponse**

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

# **notificationsServiceGetFolders**
> Notificationsv3GetFoldersResponse notificationsServiceGetFolders(notificationsv3GetFoldersRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceGetFoldersRequest = {
  // Notificationsv3GetFoldersRequest
  notificationsv3GetFoldersRequest: {
    folderName: "folderName_example",
    integrationId: "integrationId_example",
  },
};

apiInstance.notificationsServiceGetFolders(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3GetFoldersRequest** | **Notificationsv3GetFoldersRequest**|  |


### Return type

**Notificationsv3GetFoldersResponse**

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

# **notificationsServiceGetNotificationFilename**
> Notificationsv3GetNotificationFilenameResponse notificationsServiceGetNotificationFilename()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceGetNotificationFilenameRequest = {
  // string | Params are located in the requests context (tenant id, user email, notification id). (optional)
  notificationId: "notification_id_example",
};

apiInstance.notificationsServiceGetNotificationFilename(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | [**string**] | Params are located in the requests context (tenant id, user email, notification id). | (optional) defaults to undefined


### Return type

**Notificationsv3GetNotificationFilenameResponse**

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

# **notificationsServiceGetNotificationRecord**
> Notificationsv3GetNotificationRecordResponse notificationsServiceGetNotificationRecord()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceGetNotificationRecordRequest = {
  // string | ID for the record to return.
  notificationId: "notification_id_example",
};

apiInstance.notificationsServiceGetNotificationRecord(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | [**string**] | ID for the record to return. | defaults to undefined


### Return type

**Notificationsv3GetNotificationRecordResponse**

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

# **notificationsServiceGetNotificationRecords**
> Notificationsv3GetNotificationRecordsResponse notificationsServiceGetNotificationRecords()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceGetNotificationRecordsRequest = {
  // Date | Return records created at this time or later (>=). (optional)
  filterStartTime: new Date('1970-01-01T00:00:00.00Z'),
  // Date | Return records created before this time (<). (optional)
  filterEndTime: new Date('1970-01-01T00:00:00.00Z'),
  // 'INCLUDE_ALL' | 'UNREAD_ONLY' | 'READ_ONLY' | 'COMPLETE_ONLY' | 'NOT_COMPLETE' | Only return record that include the specified state. (optional)
  filterState: "INCLUDE_ALL",
  // Array<string> | Only return record that includes the specified origins. (optional)
  filterOrigins: [
    "filter.origins_example",
  ],
  // string | Only return record that with the specified origin_data. (optional)
  filterOriginData: "filter.origin_data_example",
  // number | The max amount of rows to return for this single query. (optional)
  filterLimit: 1,
  // number | The amount to offset the rows by for pagination. (optional)
  offset: 1,
  // number | The max amount of rows to return for pagination. (optional)
  limit: 1,
  // boolean | Computing the filter counts is relatively expensive, only compute when needed. (optional)
  includeFilterCounts: true,
};

apiInstance.notificationsServiceGetNotificationRecords(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterStartTime** | [**Date**] | Return records created at this time or later (&gt;&#x3D;). | (optional) defaults to undefined
 **filterEndTime** | [**Date**] | Return records created before this time (&lt;). | (optional) defaults to undefined
 **filterState** | [**&#39;INCLUDE_ALL&#39; | &#39;UNREAD_ONLY&#39; | &#39;READ_ONLY&#39; | &#39;COMPLETE_ONLY&#39; | &#39;NOT_COMPLETE&#39;**]**Array<&#39;INCLUDE_ALL&#39; &#124; &#39;UNREAD_ONLY&#39; &#124; &#39;READ_ONLY&#39; &#124; &#39;COMPLETE_ONLY&#39; &#124; &#39;NOT_COMPLETE&#39;>** | Only return record that include the specified state. | (optional) defaults to 'INCLUDE_ALL'
 **filterOrigins** | **Array&lt;string&gt;** | Only return record that includes the specified origins. | (optional) defaults to undefined
 **filterOriginData** | [**string**] | Only return record that with the specified origin_data. | (optional) defaults to undefined
 **filterLimit** | [**number**] | The max amount of rows to return for this single query. | (optional) defaults to undefined
 **offset** | [**number**] | The amount to offset the rows by for pagination. | (optional) defaults to undefined
 **limit** | [**number**] | The max amount of rows to return for pagination. | (optional) defaults to undefined
 **includeFilterCounts** | [**boolean**] | Computing the filter counts is relatively expensive, only compute when needed. | (optional) defaults to undefined


### Return type

**Notificationsv3GetNotificationRecordsResponse**

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

# **notificationsServiceGetTicketStatus**
> Notificationsv3GetTicketStatusResponse notificationsServiceGetTicketStatus()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceGetTicketStatusRequest = {
  // string | The ID of the ticket to fetch. (optional)
  ticketId: "ticket_id_example",
  // string | The ID of the ticketing integration. (optional)
  integrationId: "integration_id_example",
};

apiInstance.notificationsServiceGetTicketStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketId** | [**string**] | The ID of the ticket to fetch. | (optional) defaults to undefined
 **integrationId** | [**string**] | The ID of the ticketing integration. | (optional) defaults to undefined


### Return type

**Notificationsv3GetTicketStatusResponse**

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

# **notificationsServicePostNotificationRecord**
> Notificationsv3PostNotificationRecordResponse notificationsServicePostNotificationRecord(notificationsv3PostNotificationRecordRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServicePostNotificationRecordRequest = {
  // Notificationsv3PostNotificationRecordRequest
  notificationsv3PostNotificationRecordRequest: {
    origin: "UNDEFINED_ORIGIN",
    originData: "originData_example",
    targetReceivers: [
      {
        integrationId: "integrationId_example",
        label: "label_example",
        templateId: "templateId_example",
        type: "UNDEFINED_RECTYPE",
        value: "value_example",
      },
    ],
    templateData: {
      "key": "key_example",
    },
    title: "title_example",
  },
};

apiInstance.notificationsServicePostNotificationRecord(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3PostNotificationRecordRequest** | **Notificationsv3PostNotificationRecordRequest**|  |


### Return type

**Notificationsv3PostNotificationRecordResponse**

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

# **notificationsServiceSearchNotificationRecords**
> Notificationsv3SearchNotificationRecordsResponse notificationsServiceSearchNotificationRecords(notificationsv3SearchNotificationRecordsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceSearchNotificationRecordsRequest = {
  // Notificationsv3SearchNotificationRecordsRequest
  notificationsv3SearchNotificationRecordsRequest: {
    filters: [
      {
        endTime: new Date('1970-01-01T00:00:00.00Z'),
        limit: 1,
        originData: "originData_example",
        origins: [
          "origins_example",
        ],
        startTime: new Date('1970-01-01T00:00:00.00Z'),
        state: "INCLUDE_ALL",
      },
    ],
    operator: "OPERATOR_AND",
  },
};

apiInstance.notificationsServiceSearchNotificationRecords(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3SearchNotificationRecordsRequest** | **Notificationsv3SearchNotificationRecordsRequest**|  |


### Return type

**Notificationsv3SearchNotificationRecordsResponse**

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

# **notificationsServiceTestIntegration**
> Notificationsv3TestIntegrationResponse notificationsServiceTestIntegration(notificationsv3TestIntegrationRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceTestIntegrationRequest = {
  // Notificationsv3TestIntegrationRequest
  notificationsv3TestIntegrationRequest: {
    integrationType: "integrationType_example",
    options: {
      "key": "key_example",
    },
  },
};

apiInstance.notificationsServiceTestIntegration(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3TestIntegrationRequest** | **Notificationsv3TestIntegrationRequest**|  |


### Return type

**Notificationsv3TestIntegrationResponse**

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

# **notificationsServiceUpdateNotificationRecord**
> Notificationsv3UpdateNotificationRecordResponse notificationsServiceUpdateNotificationRecord(notificationsv3UpdateNotificationRecordRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceUpdateNotificationRecordRequest = {
  // Notificationsv3UpdateNotificationRecordRequest
  notificationsv3UpdateNotificationRecordRequest: {
    notificationId: [
      "notificationId_example",
    ],
    severity: "UNDEFINED",
    state: "UNREAD",
    templateData: [
      {
        name: "name_example",
        value: "value_example",
      },
    ],
  },
};

apiInstance.notificationsServiceUpdateNotificationRecord(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3UpdateNotificationRecordRequest** | **Notificationsv3UpdateNotificationRecordRequest**|  |


### Return type

**Notificationsv3UpdateNotificationRecordResponse**

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


