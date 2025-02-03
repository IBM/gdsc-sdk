# Workflowv3Case

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AltId** | **string** | Alternate Unique ID. | [optional] [default to null]
**Artifacts** | **[]string** | Array of artifact URLs, i.e. a URL to a report result. | [optional] [default to null]
**Assignments** | [**[]Workflowv3Entity**](workflowv3Entity.md) | Entities that the case is assigned to. | [optional] [default to null]
**CaseId** | **string** | Unique ID. | [optional] [default to null]
**Comments** | [**[]Workflowv3Comment**](workflowv3Comment.md) | Comments - who, when, what. | [optional] [default to null]
**DateCreated** | [**time.Time**](time.Time.md) | Date created (Scheduled job queue time). | [optional] [default to null]
**DateDue** | [**time.Time**](time.Time.md) | Date due (Scheduled job next run). | [optional] [default to null]
**DateModified** | [**time.Time**](time.Time.md) | Date of last update. | [optional] [default to null]
**Description** | **string** | Multiline description of the case. | [optional] [default to null]
**FullAccess** | **bool** | Access level. | [optional] [default to null]
**Origin** | [***Workflowv3Origin**](workflowv3Origin.md) |  | [optional] [default to null]
**Priority** | [***Workflowv3Priority**](workflowv3Priority.md) |  | [optional] [default to null]
**Status** | [***Workflowv3Status**](workflowv3Status.md) |  | [optional] [default to null]
**Tasks** | [**[]Workflowv3Task**](workflowv3Task.md) | Sub-tasks that the current user has access to. | [optional] [default to null]
**Title** | **string** | Case title (subject). | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

