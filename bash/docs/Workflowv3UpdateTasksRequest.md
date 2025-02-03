# workflowv3UpdateTasksRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caseUnderscoreid** | **string** |  | [optional] [default to null]
**tasks** | [**array[Workflowv3TaskEdit]**](Workflowv3TaskEdit.md) |  | [optional] [default to null]
**updateUnderscorefields** | **array[string]** |  | [optional] [default to null]
**workflowUnderscoreid** | **string** | Optional: use first TaskEdit as a pattern to update all tasks associated with workflow_id &#x3D; &quot;${scheduled_job_id}:${report_id}&quot; | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


