# Workflowv3TaskCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AltId** | **string** |  | [optional] [default to null]
**Assignments** | [**[]Workflowv3Entity**](workflowv3Entity.md) | Optional: Entities that the task is assigned to. | [optional] [default to null]
**Comment** | **string** | Optional: Comment - this text will be added to the comments history. | [optional] [default to null]
**DateDue** | [**time.Time**](time.Time.md) | Optional: Date due. | [optional] [default to null]
**DependsOn** | **[]string** | Optional: Task ID dependencies if sequential processing is needed. | [optional] [default to null]
**Description** | **string** | Optional: Multiline description of the task. | [optional] [default to null]
**InvestigationLinks** | [**[]Schedulerv3ConfigurationItem**](schedulerv3ConfigurationItem.md) |  | [optional] [default to null]
**Origin** | [***Workflowv3Origin**](workflowv3Origin.md) |  | [optional] [default to null]
**Priority** | [***Workflowv3Priority**](workflowv3Priority.md) |  | [optional] [default to null]
**ReportResult** | [***Workflowv3ReportResult**](workflowv3ReportResult.md) |  | [optional] [default to null]
**ResponseTemplate** | [***Schedulerv3ConfigurationItem**](schedulerv3ConfigurationItem.md) |  | [optional] [default to null]
**Status** | [***Workflowv3Status**](workflowv3Status.md) |  | [optional] [default to null]
**Tags** | **[]string** |  | [optional] [default to null]
**Title** | **string** | Task title (subject). | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

