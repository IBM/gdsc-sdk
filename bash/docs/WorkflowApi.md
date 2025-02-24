# WorkflowApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**workflowCreateCase**](WorkflowApi.md#workflowCreateCase) | **POST** /api/v3/cases | Summary: Create case
Description: Create single case.
[**workflowCreateProductEntity**](WorkflowApi.md#workflowCreateProductEntity) | **POST** /api/v3/workflow/productentities | Summary: Create product entity
Description: Create single product entity.
[**workflowCreateTask**](WorkflowApi.md#workflowCreateTask) | **POST** /api/v3/cases/{case_id}/tasks | Summary: Create task
Description: Create single task within a parent case.
[**workflowCreateWorkflowEvent**](WorkflowApi.md#workflowCreateWorkflowEvent) | **POST** /api/v3/workflow/event | Summary: Post event for processing by workflow rules
Description: Find matching workflow rule and run it
[**workflowDeleteProductEntity**](WorkflowApi.md#workflowDeleteProductEntity) | **DELETE** /api/v3/workflow/productentities/{entity_id} | Summary: Delete a product entity
Description: Delete a single product entity.
[**workflowGetCases**](WorkflowApi.md#workflowGetCases) | **GET** /api/v3/cases | Summary: Get cases
Description: Return all cases requested.
[**workflowGetCasesCount**](WorkflowApi.md#workflowGetCasesCount) | **POST** /api/v3/cases/count | Summary: Get cases count
Description: Get case count.
[**workflowGetFilename**](WorkflowApi.md#workflowGetFilename) | **GET** /api/v3/cases/{case_id}/tasks/{task_id}/filename | Summary: Get filename
Description: Return filename associated with the task referenced in the associated context record.
[**workflowGetJobsCount**](WorkflowApi.md#workflowGetJobsCount) | **POST** /api/v3/cases/{case_id}/jobs/count | Summary: Get jobs count
Description: Get jobs count.
[**workflowGetProductEntities**](WorkflowApi.md#workflowGetProductEntities) | **GET** /api/v3/workflow/productentities | Summary: Get products and their associated event entities
Description: Return a list of integrated products and their associated event entities
[**workflowGetProductEntity**](WorkflowApi.md#workflowGetProductEntity) | **GET** /api/v3/workflow/productentities/{entity_id} | Summary: Get event entity field names, field labels, and field data types
Description: Return a list of fields similar to report headers
[**workflowGetReportResult**](WorkflowApi.md#workflowGetReportResult) | **GET** /api/v3/cases/{case_id}/tasks/{task_id}/result | Summary: Get report result
Description: Return a page of results.
[**workflowGetTasks**](WorkflowApi.md#workflowGetTasks) | **GET** /api/v3/cases/{case_id}/tasks | Summary: Get tasks
Description: Return all tasks requested.
[**workflowGetTasksCount**](WorkflowApi.md#workflowGetTasksCount) | **POST** /api/v3/cases/{case_id}/tasks/count | Summary: Get cases count
Description: Get case count.
[**workflowSearchCases**](WorkflowApi.md#workflowSearchCases) | **POST** /api/v3/cases/search | Summary: Search cases
Description: Return a subset of cases.
[**workflowSearchReports**](WorkflowApi.md#workflowSearchReports) | **POST** /api/v3/cases/reports | Summary: Get a list of report IDs
Description: Returns a list of report IDs referenced in all cases and tasks
[**workflowSearchTasks**](WorkflowApi.md#workflowSearchTasks) | **POST** /api/v3/cases/{case_id}/tasks/search | Summary: Search cases
Description: Return a subset of cases.
[**workflowUpdateCases**](WorkflowApi.md#workflowUpdateCases) | **PUT** /api/v3/cases | Summary: Update cases
Description: Update multiple cases in one request.
[**workflowUpdateProductEntity**](WorkflowApi.md#workflowUpdateProductEntity) | **PUT** /api/v3/workflow/productentities/{entity_id} | Summary: Update a product entity
Description: Update a single product entity.
[**workflowUpdateTasks**](WorkflowApi.md#workflowUpdateTasks) | **PUT** /api/v3/cases/{case_id}/tasks | Summary: Update tasks
Description: Update multiple tasks for the same parent in one request.



## workflowCreateCase

Summary: Create case
Description: Create single case.

### Example

```bash
 workflowCreateCase
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3CreateCaseRequest** | [**Workflowv3CreateCaseRequest**](Workflowv3CreateCaseRequest.md) |  |

### Return type

[**Workflowv3CreateCaseResponse**](Workflowv3CreateCaseResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowCreateProductEntity

Summary: Create product entity
Description: Create single product entity.

### Example

```bash
 workflowCreateProductEntity
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3ProductEntity** | [**Workflowv3ProductEntity**](Workflowv3ProductEntity.md) |  |

### Return type

[**Workflowv3CreateProductEntityResponse**](Workflowv3CreateProductEntityResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowCreateTask

Summary: Create task
Description: Create single task within a parent case.

### Example

```bash
 workflowCreateTask case_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **string** | Create tasks with common parent. | [default to null]
 **workflowv3CreateTaskRequest** | [**Workflowv3CreateTaskRequest**](Workflowv3CreateTaskRequest.md) |  |

### Return type

[**Workflowv3CreateTaskResponse**](Workflowv3CreateTaskResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowCreateWorkflowEvent

Summary: Post event for processing by workflow rules
Description: Find matching workflow rule and run it

### Example

```bash
 workflowCreateWorkflowEvent
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3WorkflowEvent** | [**Workflowv3WorkflowEvent**](Workflowv3WorkflowEvent.md) |  |

### Return type

[**Workflowv3WorkflowEventResponse**](Workflowv3WorkflowEventResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowDeleteProductEntity

Summary: Delete a product entity
Description: Delete a single product entity.

### Example

```bash
 workflowDeleteProductEntity entity_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **string** | Unique id for the product entity | [default to null]

### Return type

[**Workflowv3DeleteProductEntityResponse**](Workflowv3DeleteProductEntityResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowGetCases

Summary: Get cases
Description: Return all cases requested.

### Example

```bash
 workflowGetCases  case_id=value  sort_by=value  offset=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **string** | Optional case_id to get a response of an array of one member. | [optional] [default to null]
 **sortBy** | **string** | Optional field to sort by | first character determines ascending (>) or descending (<). | [optional] [default to null]
 **offset** | **integer** | Optional starting point for the page of data. | [optional] [default to null]
 **limit** | **integer** | Optional page size. | [optional] [default to null]

### Return type

[**Workflowv3CaseListResponse**](Workflowv3CaseListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowGetCasesCount

Summary: Get cases count
Description: Get case count.

### Example

```bash
 workflowGetCasesCount
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3GetCasesCountRequest** | [**Workflowv3GetCasesCountRequest**](Workflowv3GetCasesCountRequest.md) |  |

### Return type

[**Workflowv3GetCasesCountResponse**](Workflowv3GetCasesCountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowGetFilename

Summary: Get filename
Description: Return filename associated with the task referenced in the associated context record.

### Example

```bash
 workflowGetFilename case_id=value task_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **string** | Can be \"*\" if JWT token contains the case_id. | [default to null]
 **taskId** | **string** | Can be \"*\" if JWT token contains the task_id. | [default to null]

### Return type

[**Workflowv3GetFilenameResponse**](Workflowv3GetFilenameResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowGetJobsCount

Summary: Get jobs count
Description: Get jobs count.

### Example

```bash
 workflowGetJobsCount case_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **string** | Case ID - can be * for all | [default to null]
 **workflowv3GetJobsCountRequest** | [**Workflowv3GetJobsCountRequest**](Workflowv3GetJobsCountRequest.md) |  |

### Return type

[**Workflowv3GetJobsCountResponse**](Workflowv3GetJobsCountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowGetProductEntities

Summary: Get products and their associated event entities
Description: Return a list of integrated products and their associated event entities

### Example

```bash
 workflowGetProductEntities  offset=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **integer** | Optional starting point for the page of data. | [optional] [default to null]
 **limit** | **integer** | Optional page size. | [optional] [default to null]

### Return type

[**Workflowv3GetProductEntitiesResponse**](Workflowv3GetProductEntitiesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowGetProductEntity

Summary: Get event entity field names, field labels, and field data types
Description: Return a list of fields similar to report headers

### Example

```bash
 workflowGetProductEntity entity_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **string** | Unique id for the product entity | [default to null]

### Return type

[**Workflowv3ProductEntity**](Workflowv3ProductEntity.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowGetReportResult

Summary: Get report result
Description: Return a page of results.

### Example

```bash
 workflowGetReportResult case_id=value task_id=value  offset=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **string** | ID to get the case  (read-only). | [default to null]
 **taskId** | **string** | ID to get the task for case(read-only). | [default to null]
 **offset** | **integer** | Optional starting point for the page of data. | [optional] [default to null]
 **limit** | **integer** | Optional page size. | [optional] [default to null]

### Return type

[**Workflowv3GetReportResultResponse**](Workflowv3GetReportResultResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowGetTasks

Summary: Get tasks
Description: Return all tasks requested.

### Example

```bash
 workflowGetTasks case_id=value  task_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **string** | Mandaroty: The parent case which contains the tasks. | [default to null]
 **taskId** | **string** | Optional: task_id to return an array of one. | [optional] [default to null]

### Return type

[**Workflowv3TaskListResponse**](Workflowv3TaskListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowGetTasksCount

Summary: Get cases count
Description: Get case count.

### Example

```bash
 workflowGetTasksCount case_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **string** | Case ID - can be * for all | [default to null]
 **workflowv3GetTasksCountRequest** | [**Workflowv3GetTasksCountRequest**](Workflowv3GetTasksCountRequest.md) |  |

### Return type

[**Workflowv3GetTasksCountResponse**](Workflowv3GetTasksCountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowSearchCases

Summary: Search cases
Description: Return a subset of cases.

### Example

```bash
 workflowSearchCases
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3SearchCasesRequest** | [**Workflowv3SearchCasesRequest**](Workflowv3SearchCasesRequest.md) |  |

### Return type

[**Workflowv3CaseListResponse**](Workflowv3CaseListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowSearchReports

Summary: Get a list of report IDs
Description: Returns a list of report IDs referenced in all cases and tasks

### Example

```bash
 workflowSearchReports
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3SearchCasesRequest** | [**Workflowv3SearchCasesRequest**](Workflowv3SearchCasesRequest.md) |  |

### Return type

[**Workflowv3SearchReportsResponse**](Workflowv3SearchReportsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowSearchTasks

Summary: Search cases
Description: Return a subset of cases.

### Example

```bash
 workflowSearchTasks case_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **string** | Case ID - can be * for all | [default to null]
 **workflowv3SearchTasksRequest** | [**Workflowv3SearchTasksRequest**](Workflowv3SearchTasksRequest.md) |  |

### Return type

[**Workflowv3TaskListResponse**](Workflowv3TaskListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowUpdateCases

Summary: Update cases
Description: Update multiple cases in one request.

### Example

```bash
 workflowUpdateCases
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3UpdateCasesRequest** | [**Workflowv3UpdateCasesRequest**](Workflowv3UpdateCasesRequest.md) |  |

### Return type

[**Workflowv3UpdateCasesResponse**](Workflowv3UpdateCasesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowUpdateProductEntity

Summary: Update a product entity
Description: Update a single product entity.

### Example

```bash
 workflowUpdateProductEntity entity_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **string** | Unique Entity id, required for update. | [default to null]
 **workflowv3UpdateProductEntityRequest** | [**Workflowv3UpdateProductEntityRequest**](Workflowv3UpdateProductEntityRequest.md) |  |

### Return type

[**Workflowv3UpdateProductEntityResponse**](Workflowv3UpdateProductEntityResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## workflowUpdateTasks

Summary: Update tasks
Description: Update multiple tasks for the same parent in one request.

### Example

```bash
 workflowUpdateTasks case_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **string** | Update tasks belonging to common parent. | [default to null]
 **workflowv3UpdateTasksRequest** | [**Workflowv3UpdateTasksRequest**](Workflowv3UpdateTasksRequest.md) |  |

### Return type

[**Workflowv3UpdateTasksResponse**](Workflowv3UpdateTasksResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

