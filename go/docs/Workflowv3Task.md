# Workflowv3Task

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AltId** | **string** | Alternate Unique ID. | [optional] [default to null]
**Assignments** | [**[]Workflowv3Entity**](workflowv3Entity.md) | Entities that the task is assigned to. | [optional] [default to null]
**CaseId** | **string** | Parent case. | [optional] [default to null]
**Comments** | [**[]Workflowv3Comment**](workflowv3Comment.md) | Comments - who, when, what. | [optional] [default to null]
**DateCreated** | [**time.Time**](time.Time.md) | Date created. | [optional] [default to null]
**DateDue** | [**time.Time**](time.Time.md) | Date due. | [optional] [default to null]
**DateModified** | [**time.Time**](time.Time.md) | Date of last update. | [optional] [default to null]
**DependsOn** | **[]string** | Task ID dependencies if sequential processing is needed. | [optional] [default to null]
**Description** | **string** | Multiline description of the task. | [optional] [default to null]
**InvestigationLinks** | [**[]Schedulerv3ConfigurationItem**](schedulerv3ConfigurationItem.md) |  | [optional] [default to null]
**Justification** | **string** |  | [optional] [default to null]
**Number** | **string** |  | [optional] [default to null]
**Priority** | [***Workflowv3Priority**](workflowv3Priority.md) |  | [optional] [default to null]
**ReportResult** | [***Workflowv3ReportResult**](workflowv3ReportResult.md) |  | [optional] [default to null]
**ResponseTemplate** | [***Schedulerv3ConfigurationItem**](schedulerv3ConfigurationItem.md) |  | [optional] [default to null]
**ReviewAction** | **string** |  | [optional] [default to null]
**Run** | [***Workflowv3ReportRun**](workflowv3ReportRun.md) |  | [optional] [default to null]
**Status** | [***Workflowv3Status**](workflowv3Status.md) |  | [optional] [default to null]
**Tags** | **[]string** |  | [optional] [default to null]
**TaskId** | **string** | Unique ID. | [optional] [default to null]
**Title** | **string** | Task title (subject). | [optional] [default to null]
**WorkflowType** | [***Schedulerv3WorkflowType**](schedulerv3WorkflowType.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

