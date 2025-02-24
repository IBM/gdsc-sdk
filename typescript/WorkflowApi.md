# .WorkflowApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workflowCreateCase**](WorkflowApi.md#workflowCreateCase) | **POST** /api/v3/cases | Summary: Create case Description: Create single case.
[**workflowCreateProductEntity**](WorkflowApi.md#workflowCreateProductEntity) | **POST** /api/v3/workflow/productentities | Summary: Create product entity Description: Create single product entity.
[**workflowCreateTask**](WorkflowApi.md#workflowCreateTask) | **POST** /api/v3/cases/{case_id}/tasks | Summary: Create task Description: Create single task within a parent case.
[**workflowCreateWorkflowEvent**](WorkflowApi.md#workflowCreateWorkflowEvent) | **POST** /api/v3/workflow/event | Summary: Post event for processing by workflow rules Description: Find matching workflow rule and run it
[**workflowDeleteProductEntity**](WorkflowApi.md#workflowDeleteProductEntity) | **DELETE** /api/v3/workflow/productentities/{entity_id} | Summary: Delete a product entity Description: Delete a single product entity.
[**workflowGetCases**](WorkflowApi.md#workflowGetCases) | **GET** /api/v3/cases | Summary: Get cases Description: Return all cases requested.
[**workflowGetCasesCount**](WorkflowApi.md#workflowGetCasesCount) | **POST** /api/v3/cases/count | Summary: Get cases count Description: Get case count.
[**workflowGetFilename**](WorkflowApi.md#workflowGetFilename) | **GET** /api/v3/cases/{case_id}/tasks/{task_id}/filename | Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
[**workflowGetJobsCount**](WorkflowApi.md#workflowGetJobsCount) | **POST** /api/v3/cases/{case_id}/jobs/count | Summary: Get jobs count Description: Get jobs count.
[**workflowGetProductEntities**](WorkflowApi.md#workflowGetProductEntities) | **GET** /api/v3/workflow/productentities | Summary: Get products and their associated event entities Description: Return a list of integrated products and their associated event entities
[**workflowGetProductEntity**](WorkflowApi.md#workflowGetProductEntity) | **GET** /api/v3/workflow/productentities/{entity_id} | Summary: Get event entity field names, field labels, and field data types Description: Return a list of fields similar to report headers
[**workflowGetReportResult**](WorkflowApi.md#workflowGetReportResult) | **GET** /api/v3/cases/{case_id}/tasks/{task_id}/result | Summary: Get report result Description: Return a page of results.
[**workflowGetTasks**](WorkflowApi.md#workflowGetTasks) | **GET** /api/v3/cases/{case_id}/tasks | Summary: Get tasks Description: Return all tasks requested.
[**workflowGetTasksCount**](WorkflowApi.md#workflowGetTasksCount) | **POST** /api/v3/cases/{case_id}/tasks/count | Summary: Get cases count Description: Get case count.
[**workflowSearchCases**](WorkflowApi.md#workflowSearchCases) | **POST** /api/v3/cases/search | Summary: Search cases Description: Return a subset of cases.
[**workflowSearchReports**](WorkflowApi.md#workflowSearchReports) | **POST** /api/v3/cases/reports | Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
[**workflowSearchTasks**](WorkflowApi.md#workflowSearchTasks) | **POST** /api/v3/cases/{case_id}/tasks/search | Summary: Search cases Description: Return a subset of cases.
[**workflowUpdateCases**](WorkflowApi.md#workflowUpdateCases) | **PUT** /api/v3/cases | Summary: Update cases Description: Update multiple cases in one request.
[**workflowUpdateProductEntity**](WorkflowApi.md#workflowUpdateProductEntity) | **PUT** /api/v3/workflow/productentities/{entity_id} | Summary: Update a product entity Description: Update a single product entity.
[**workflowUpdateTasks**](WorkflowApi.md#workflowUpdateTasks) | **PUT** /api/v3/cases/{case_id}/tasks | Summary: Update tasks Description: Update multiple tasks for the same parent in one request.


# **workflowCreateCase**
> Workflowv3CreateCaseResponse workflowCreateCase(workflowv3CreateCaseRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowCreateCaseRequest = {
  // Workflowv3CreateCaseRequest
  workflowv3CreateCaseRequest: {
    _case: {
      artifacts: [
        "artifacts_example",
      ],
      assignments: [
        {
          label: "label_example",
          templateId: "templateId_example",
          type: "UNDEFINED_ENTITY_TYPE",
          value: "value_example",
        },
      ],
      caseId: "caseId_example",
      comment: "comment_example",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      description: "description_example",
      priority: "UNDEFINED_PRIORITY",
      status: "UNDEFINED_STATUS",
      title: "title_example",
    },
  },
};

apiInstance.workflowCreateCase(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3CreateCaseRequest** | **Workflowv3CreateCaseRequest**|  |


### Return type

**Workflowv3CreateCaseResponse**

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

# **workflowCreateProductEntity**
> Workflowv3CreateProductEntityResponse workflowCreateProductEntity(workflowv3ProductEntity)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowCreateProductEntityRequest = {
  // Workflowv3ProductEntity
  workflowv3ProductEntity: {
    entity: {
      disabled: true,
      entityId: "entityId_example",
      entityLabel: "entityLabel_example",
      featureFlag: "featureFlag_example",
      preventDelete: true,
      privilegeId: "privilegeId_example",
      privilegeType: "privilegeType_example",
      productId: "productId_example",
      productLabel: "productLabel_example",
      templateOrigin: "templateOrigin_example",
      workflow: {
        auditType: "UNDEFINED_TYPE",
        configTypes: [
          "configTypes_example",
        ],
        workflowInvestigationLinks: [
          {
            display: "display_example",
            id: "id_example",
            type: "type_example",
          },
        ],
        workflowResponseTemplate: {
          display: "display_example",
          id: "id_example",
          type: "type_example",
        },
        workflowUniqueFields: [
          "workflowUniqueFields_example",
        ],
      },
    },
    headers: [
      {
        choices: [
          {
            disabled: true,
            label: "label_example",
            name: "name_example",
          },
        ],
        groupTypeId: 1,
        hideFromView: true,
        key: "key_example",
        type: "STRING",
        value: "value_example",
      },
    ],
  },
};

apiInstance.workflowCreateProductEntity(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3ProductEntity** | **Workflowv3ProductEntity**|  |


### Return type

**Workflowv3CreateProductEntityResponse**

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

# **workflowCreateTask**
> Workflowv3CreateTaskResponse workflowCreateTask(workflowv3CreateTaskRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowCreateTaskRequest = {
  // string | Create tasks with common parent.
  caseId: "case_id_example",
  // Workflowv3CreateTaskRequest
  workflowv3CreateTaskRequest: {
    caseId: "caseId_example",
    task: {
      altId: "altId_example",
      assignments: [
        {
          label: "label_example",
          templateId: "templateId_example",
          type: "UNDEFINED_ENTITY_TYPE",
          value: "value_example",
        },
      ],
      comment: "comment_example",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dependsOn: [
        "dependsOn_example",
      ],
      description: "description_example",
      investigationLinks: [
        {
          display: "display_example",
          id: "id_example",
          type: "type_example",
        },
      ],
      origin: {
        dateNext: new Date('1970-01-01T00:00:00.00Z'),
        dateStart: new Date('1970-01-01T00:00:00.00Z'),
        description: "description_example",
        frequency: "frequency_example",
        name: "name_example",
        scheduledJobId: "scheduledJobId_example",
      },
      priority: "UNDEFINED_PRIORITY",
      reportResult: {
        headers: [
          {
            header: "header_example",
            key: "key_example",
          },
        ],
        rows: [
          {
            row: {
              "key": "key_example",
            },
          },
        ],
      },
      responseTemplate: {
        display: "display_example",
        id: "id_example",
        type: "type_example",
      },
      status: "UNDEFINED_STATUS",
      tags: [
        "tags_example",
      ],
      title: "title_example",
    },
  },
};

apiInstance.workflowCreateTask(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3CreateTaskRequest** | **Workflowv3CreateTaskRequest**|  |
 **caseId** | [**string**] | Create tasks with common parent. | defaults to undefined


### Return type

**Workflowv3CreateTaskResponse**

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

# **workflowCreateWorkflowEvent**
> Workflowv3WorkflowEventResponse workflowCreateWorkflowEvent(workflowv3WorkflowEvent)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowCreateWorkflowEventRequest = {
  // Workflowv3WorkflowEvent
  workflowv3WorkflowEvent: {
    data: {
      "key": "key_example",
    },
    entityId: "entityId_example",
    href: "href_example",
    severity: "UNDEFINED_PRIORITY",
    tenantId: "tenantId_example",
    title: "title_example",
  },
};

apiInstance.workflowCreateWorkflowEvent(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3WorkflowEvent** | **Workflowv3WorkflowEvent**|  |


### Return type

**Workflowv3WorkflowEventResponse**

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

# **workflowDeleteProductEntity**
> Workflowv3DeleteProductEntityResponse workflowDeleteProductEntity()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowDeleteProductEntityRequest = {
  // string | Unique id for the product entity
  entityId: "entity_id_example",
};

apiInstance.workflowDeleteProductEntity(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | [**string**] | Unique id for the product entity | defaults to undefined


### Return type

**Workflowv3DeleteProductEntityResponse**

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

# **workflowGetCases**
> Workflowv3CaseListResponse workflowGetCases()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetCasesRequest = {
  // string | Optional case_id to get a response of an array of one member. (optional)
  caseId: "case_id_example",
  // string | Optional field to sort by | first character determines ascending (>) or descending (<). (optional)
  sortBy: "sort_by_example",
  // number | Optional starting point for the page of data. (optional)
  offset: 1,
  // number | Optional page size. (optional)
  limit: 1,
};

apiInstance.workflowGetCases(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | [**string**] | Optional case_id to get a response of an array of one member. | (optional) defaults to undefined
 **sortBy** | [**string**] | Optional field to sort by | first character determines ascending (&gt;) or descending (&lt;). | (optional) defaults to undefined
 **offset** | [**number**] | Optional starting point for the page of data. | (optional) defaults to undefined
 **limit** | [**number**] | Optional page size. | (optional) defaults to undefined


### Return type

**Workflowv3CaseListResponse**

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

# **workflowGetCasesCount**
> Workflowv3GetCasesCountResponse workflowGetCasesCount(workflowv3GetCasesCountRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetCasesCountRequest = {
  // Workflowv3GetCasesCountRequest
  workflowv3GetCasesCountRequest: {
    filter: {
      assignedToMe: true,
      assignedToMyRoles: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateCreatedOperator: "IGNORE",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dateDueOperator: "IGNORE",
      filterColumns: [
        {
          headerName: "headerName_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          values: [
            "values_example",
          ],
        },
      ],
      priority: "UNDEFINED_PRIORITY",
      priorityOperator: "IGNORE",
      reportId: "reportId_example",
      scheduledJobId: [
        "scheduledJobId_example",
      ],
      scheduledTaskId: [
        "scheduledTaskId_example",
      ],
      status: "UNDEFINED_STATUS",
      statusOperator: "IGNORE",
      tags: [
        "tags_example",
      ],
    },
  },
};

apiInstance.workflowGetCasesCount(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3GetCasesCountRequest** | **Workflowv3GetCasesCountRequest**|  |


### Return type

**Workflowv3GetCasesCountResponse**

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

# **workflowGetFilename**
> Workflowv3GetFilenameResponse workflowGetFilename()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetFilenameRequest = {
  // string | Can be \"*\" if JWT token contains the case_id.
  caseId: "case_id_example",
  // string | Can be \"*\" if JWT token contains the task_id.
  taskId: "task_id_example",
};

apiInstance.workflowGetFilename(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | [**string**] | Can be \&quot;*\&quot; if JWT token contains the case_id. | defaults to undefined
 **taskId** | [**string**] | Can be \&quot;*\&quot; if JWT token contains the task_id. | defaults to undefined


### Return type

**Workflowv3GetFilenameResponse**

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

# **workflowGetJobsCount**
> Workflowv3GetJobsCountResponse workflowGetJobsCount(workflowv3GetJobsCountRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetJobsCountRequest = {
  // string | Case ID - can be * for all
  caseId: "case_id_example",
  // Workflowv3GetJobsCountRequest
  workflowv3GetJobsCountRequest: {
    caseId: "caseId_example",
    filter: {
      assignedToMe: true,
      assignedToMyRoles: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateCreatedOperator: "IGNORE",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dateDueOperator: "IGNORE",
      filterColumns: [
        {
          headerName: "headerName_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          values: [
            "values_example",
          ],
        },
      ],
      priority: "UNDEFINED_PRIORITY",
      priorityOperator: "IGNORE",
      reportId: "reportId_example",
      scheduledJobId: [
        "scheduledJobId_example",
      ],
      scheduledTaskId: [
        "scheduledTaskId_example",
      ],
      status: "UNDEFINED_STATUS",
      statusOperator: "IGNORE",
      tags: [
        "tags_example",
      ],
    },
  },
};

apiInstance.workflowGetJobsCount(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3GetJobsCountRequest** | **Workflowv3GetJobsCountRequest**|  |
 **caseId** | [**string**] | Case ID - can be * for all | defaults to undefined


### Return type

**Workflowv3GetJobsCountResponse**

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

# **workflowGetProductEntities**
> Workflowv3GetProductEntitiesResponse workflowGetProductEntities()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetProductEntitiesRequest = {
  // number | Optional starting point for the page of data. (optional)
  offset: 1,
  // number | Optional page size. (optional)
  limit: 1,
};

apiInstance.workflowGetProductEntities(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | [**number**] | Optional starting point for the page of data. | (optional) defaults to undefined
 **limit** | [**number**] | Optional page size. | (optional) defaults to undefined


### Return type

**Workflowv3GetProductEntitiesResponse**

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

# **workflowGetProductEntity**
> Workflowv3ProductEntity workflowGetProductEntity()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetProductEntityRequest = {
  // string | Unique id for the product entity
  entityId: "entity_id_example",
};

apiInstance.workflowGetProductEntity(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | [**string**] | Unique id for the product entity | defaults to undefined


### Return type

**Workflowv3ProductEntity**

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

# **workflowGetReportResult**
> Workflowv3GetReportResultResponse workflowGetReportResult()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetReportResultRequest = {
  // string | ID to get the case  (read-only).
  caseId: "case_id_example",
  // string | ID to get the task for case(read-only).
  taskId: "task_id_example",
  // number | Optional starting point for the page of data. (optional)
  offset: 1,
  // number | Optional page size. (optional)
  limit: 1,
};

apiInstance.workflowGetReportResult(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | [**string**] | ID to get the case  (read-only). | defaults to undefined
 **taskId** | [**string**] | ID to get the task for case(read-only). | defaults to undefined
 **offset** | [**number**] | Optional starting point for the page of data. | (optional) defaults to undefined
 **limit** | [**number**] | Optional page size. | (optional) defaults to undefined


### Return type

**Workflowv3GetReportResultResponse**

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

# **workflowGetTasks**
> Workflowv3TaskListResponse workflowGetTasks()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetTasksRequest = {
  // string | Mandaroty: The parent case which contains the tasks.
  caseId: "case_id_example",
  // string | Optional: task_id to return an array of one. (optional)
  taskId: "task_id_example",
};

apiInstance.workflowGetTasks(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | [**string**] | Mandaroty: The parent case which contains the tasks. | defaults to undefined
 **taskId** | [**string**] | Optional: task_id to return an array of one. | (optional) defaults to undefined


### Return type

**Workflowv3TaskListResponse**

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

# **workflowGetTasksCount**
> Workflowv3GetTasksCountResponse workflowGetTasksCount(workflowv3GetTasksCountRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetTasksCountRequest = {
  // string | Case ID - can be * for all
  caseId: "case_id_example",
  // Workflowv3GetTasksCountRequest
  workflowv3GetTasksCountRequest: {
    caseId: "caseId_example",
    filter: {
      assignedToMe: true,
      assignedToMyRoles: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateCreatedOperator: "IGNORE",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dateDueOperator: "IGNORE",
      filterColumns: [
        {
          headerName: "headerName_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          values: [
            "values_example",
          ],
        },
      ],
      priority: "UNDEFINED_PRIORITY",
      priorityOperator: "IGNORE",
      reportId: "reportId_example",
      scheduledJobId: [
        "scheduledJobId_example",
      ],
      scheduledTaskId: [
        "scheduledTaskId_example",
      ],
      status: "UNDEFINED_STATUS",
      statusOperator: "IGNORE",
      tags: [
        "tags_example",
      ],
    },
  },
};

apiInstance.workflowGetTasksCount(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3GetTasksCountRequest** | **Workflowv3GetTasksCountRequest**|  |
 **caseId** | [**string**] | Case ID - can be * for all | defaults to undefined


### Return type

**Workflowv3GetTasksCountResponse**

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

# **workflowSearchCases**
> Workflowv3CaseListResponse workflowSearchCases(workflowv3SearchCasesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowSearchCasesRequest = {
  // Workflowv3SearchCasesRequest
  workflowv3SearchCasesRequest: {
    filter: {
      assignedToMe: true,
      assignedToMyRoles: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateCreatedOperator: "IGNORE",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dateDueOperator: "IGNORE",
      filterColumns: [
        {
          headerName: "headerName_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          values: [
            "values_example",
          ],
        },
      ],
      priority: "UNDEFINED_PRIORITY",
      priorityOperator: "IGNORE",
      reportId: "reportId_example",
      scheduledJobId: [
        "scheduledJobId_example",
      ],
      scheduledTaskId: [
        "scheduledTaskId_example",
      ],
      status: "UNDEFINED_STATUS",
      statusOperator: "IGNORE",
      tags: [
        "tags_example",
      ],
    },
    limit: 1,
    offset: 1,
    withLatest: true,
  },
};

apiInstance.workflowSearchCases(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3SearchCasesRequest** | **Workflowv3SearchCasesRequest**|  |


### Return type

**Workflowv3CaseListResponse**

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

# **workflowSearchReports**
> Workflowv3SearchReportsResponse workflowSearchReports(workflowv3SearchCasesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowSearchReportsRequest = {
  // Workflowv3SearchCasesRequest
  workflowv3SearchCasesRequest: {
    filter: {
      assignedToMe: true,
      assignedToMyRoles: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateCreatedOperator: "IGNORE",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dateDueOperator: "IGNORE",
      filterColumns: [
        {
          headerName: "headerName_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          values: [
            "values_example",
          ],
        },
      ],
      priority: "UNDEFINED_PRIORITY",
      priorityOperator: "IGNORE",
      reportId: "reportId_example",
      scheduledJobId: [
        "scheduledJobId_example",
      ],
      scheduledTaskId: [
        "scheduledTaskId_example",
      ],
      status: "UNDEFINED_STATUS",
      statusOperator: "IGNORE",
      tags: [
        "tags_example",
      ],
    },
    limit: 1,
    offset: 1,
    withLatest: true,
  },
};

apiInstance.workflowSearchReports(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3SearchCasesRequest** | **Workflowv3SearchCasesRequest**|  |


### Return type

**Workflowv3SearchReportsResponse**

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

# **workflowSearchTasks**
> Workflowv3TaskListResponse workflowSearchTasks(workflowv3SearchTasksRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowSearchTasksRequest = {
  // string | Case ID - can be * for all
  caseId: "case_id_example",
  // Workflowv3SearchTasksRequest
  workflowv3SearchTasksRequest: {
    caseId: "caseId_example",
    filter: {
      assignedToMe: true,
      assignedToMyRoles: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateCreatedOperator: "IGNORE",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dateDueOperator: "IGNORE",
      filterColumns: [
        {
          headerName: "headerName_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          values: [
            "values_example",
          ],
        },
      ],
      priority: "UNDEFINED_PRIORITY",
      priorityOperator: "IGNORE",
      reportId: "reportId_example",
      scheduledJobId: [
        "scheduledJobId_example",
      ],
      scheduledTaskId: [
        "scheduledTaskId_example",
      ],
      status: "UNDEFINED_STATUS",
      statusOperator: "IGNORE",
      tags: [
        "tags_example",
      ],
    },
    limit: 1,
    offset: 1,
    sortField: "sortField_example",
    sortOrder: "UNDEFINED_ORDER_BY",
    taskId: "taskId_example",
  },
};

apiInstance.workflowSearchTasks(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3SearchTasksRequest** | **Workflowv3SearchTasksRequest**|  |
 **caseId** | [**string**] | Case ID - can be * for all | defaults to undefined


### Return type

**Workflowv3TaskListResponse**

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

# **workflowUpdateCases**
> Workflowv3UpdateCasesResponse workflowUpdateCases(workflowv3UpdateCasesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowUpdateCasesRequest = {
  // Workflowv3UpdateCasesRequest
  workflowv3UpdateCasesRequest: {
    cases: [
      {
        artifacts: [
          "artifacts_example",
        ],
        assignments: [
          {
            label: "label_example",
            templateId: "templateId_example",
            type: "UNDEFINED_ENTITY_TYPE",
            value: "value_example",
          },
        ],
        caseId: "caseId_example",
        comment: "comment_example",
        dateDue: new Date('1970-01-01T00:00:00.00Z'),
        description: "description_example",
        priority: "UNDEFINED_PRIORITY",
        status: "UNDEFINED_STATUS",
        title: "title_example",
      },
    ],
    updateFields: [
      "updateFields_example",
    ],
  },
};

apiInstance.workflowUpdateCases(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3UpdateCasesRequest** | **Workflowv3UpdateCasesRequest**|  |


### Return type

**Workflowv3UpdateCasesResponse**

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

# **workflowUpdateProductEntity**
> Workflowv3UpdateProductEntityResponse workflowUpdateProductEntity(workflowv3UpdateProductEntityRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowUpdateProductEntityRequest = {
  // string | Unique Entity id, required for update.
  entityId: "entity_id_example",
  // Workflowv3UpdateProductEntityRequest
  workflowv3UpdateProductEntityRequest: {
    entityId: "entityId_example",
    productEntity: {
      entity: {
        disabled: true,
        entityId: "entityId_example",
        entityLabel: "entityLabel_example",
        featureFlag: "featureFlag_example",
        preventDelete: true,
        privilegeId: "privilegeId_example",
        privilegeType: "privilegeType_example",
        productId: "productId_example",
        productLabel: "productLabel_example",
        templateOrigin: "templateOrigin_example",
        workflow: {
          auditType: "UNDEFINED_TYPE",
          configTypes: [
            "configTypes_example",
          ],
          workflowInvestigationLinks: [
            {
              display: "display_example",
              id: "id_example",
              type: "type_example",
            },
          ],
          workflowResponseTemplate: {
            display: "display_example",
            id: "id_example",
            type: "type_example",
          },
          workflowUniqueFields: [
            "workflowUniqueFields_example",
          ],
        },
      },
      headers: [
        {
          choices: [
            {
              disabled: true,
              label: "label_example",
              name: "name_example",
            },
          ],
          groupTypeId: 1,
          hideFromView: true,
          key: "key_example",
          type: "STRING",
          value: "value_example",
        },
      ],
    },
  },
};

apiInstance.workflowUpdateProductEntity(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3UpdateProductEntityRequest** | **Workflowv3UpdateProductEntityRequest**|  |
 **entityId** | [**string**] | Unique Entity id, required for update. | defaults to undefined


### Return type

**Workflowv3UpdateProductEntityResponse**

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

# **workflowUpdateTasks**
> Workflowv3UpdateTasksResponse workflowUpdateTasks(workflowv3UpdateTasksRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowUpdateTasksRequest = {
  // string | Update tasks belonging to common parent.
  caseId: "case_id_example",
  // Workflowv3UpdateTasksRequest
  workflowv3UpdateTasksRequest: {
    caseId: "caseId_example",
    tasks: [
      {
        assignments: [
          {
            label: "label_example",
            templateId: "templateId_example",
            type: "UNDEFINED_ENTITY_TYPE",
            value: "value_example",
          },
        ],
        comment: "comment_example",
        dateDue: new Date('1970-01-01T00:00:00.00Z'),
        dependsOn: [
          "dependsOn_example",
        ],
        description: "description_example",
        investigationLinks: [
          {
            display: "display_example",
            id: "id_example",
            type: "type_example",
          },
        ],
        justification: "justification_example",
        priority: "UNDEFINED_PRIORITY",
        responseTemplate: {
          display: "display_example",
          id: "id_example",
          type: "type_example",
        },
        reviewAction: "reviewAction_example",
        status: "UNDEFINED_STATUS",
        tags: [
          "tags_example",
        ],
        taskId: "taskId_example",
        title: "title_example",
      },
    ],
    updateFields: [
      "updateFields_example",
    ],
    workflowId: "workflowId_example",
  },
};

apiInstance.workflowUpdateTasks(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3UpdateTasksRequest** | **Workflowv3UpdateTasksRequest**|  |
 **caseId** | [**string**] | Update tasks belonging to common parent. | defaults to undefined


### Return type

**Workflowv3UpdateTasksResponse**

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


