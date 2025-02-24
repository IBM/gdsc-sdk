# Workflowv3Filter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssignedToMe** | **bool** | Optional: Cases and tasks that are assigned to Me. | [optional] [default to null]
**AssignedToMyRoles** | **bool** | Optional: Cases and tasks that are assigned to My Roles. | [optional] [default to null]
**DateCreated** | [**time.Time**](time.Time.md) | Optional: where Date Created meets criteria. | [optional] [default to null]
**DateCreatedOperator** | [***Workflowv3FilterOperator**](workflowv3FilterOperator.md) |  | [optional] [default to null]
**DateDue** | [**time.Time**](time.Time.md) | Optional: where Date Due meets criteria. | [optional] [default to null]
**DateDueOperator** | [***Workflowv3FilterOperator**](workflowv3FilterOperator.md) |  | [optional] [default to null]
**FilterColumns** | [**[]Workflowv3FilterColumn**](workflowv3FilterColumn.md) |  | [optional] [default to null]
**Priority** | [***Workflowv3Priority**](workflowv3Priority.md) |  | [optional] [default to null]
**PriorityOperator** | [***Workflowv3FilterOperator**](workflowv3FilterOperator.md) |  | [optional] [default to null]
**ReportId** | **string** |  | [optional] [default to null]
**ScheduledJobId** | **[]string** |  | [optional] [default to null]
**ScheduledTaskId** | **[]string** |  | [optional] [default to null]
**Status** | [***Workflowv3Status**](workflowv3Status.md) |  | [optional] [default to null]
**StatusOperator** | [***Workflowv3FilterOperator**](workflowv3FilterOperator.md) |  | [optional] [default to null]
**Tags** | **[]string** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

