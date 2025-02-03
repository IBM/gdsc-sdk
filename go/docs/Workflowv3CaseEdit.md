# Workflowv3CaseEdit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Artifacts** | **[]string** | Optional: Array of artifact URLs, i.e. a URL to a report result. | [optional] [default to null]
**Assignments** | [**[]Workflowv3Entity**](workflowv3Entity.md) | Optional: Entities that the case is assigned to. | [optional] [default to null]
**CaseId** | **string** | Unique ID - needed to update the case (read-only). | [optional] [default to null]
**Comment** | **string** | Optional: Comment - this text will be added to the comments history. | [optional] [default to null]
**DateDue** | [**time.Time**](time.Time.md) | Optional: Date due. | [optional] [default to null]
**Description** | **string** | Optional: Multiline description of the case. | [optional] [default to null]
**Priority** | [***Workflowv3Priority**](workflowv3Priority.md) |  | [optional] [default to null]
**Status** | [***Workflowv3Status**](workflowv3Status.md) |  | [optional] [default to null]
**Title** | **string** | Optional: Case title (subject). | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

