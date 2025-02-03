# Schedulerv3ScheduledTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AuditType** | [***Schedulerv3AuditType**](schedulerv3AuditType.md) |  | [optional] [default to null]
**DeliveryMethod** | [***Schedulerv3DeliveryMethod**](schedulerv3DeliveryMethod.md) |  | [optional] [default to null]
**DistributionRuleIds** | **[]string** | Optional: Distribution rule IDs for a task. Will be populated by recipients on save. | [optional] [default to null]
**EmailSubject** | **string** | Optional: Email subject with replaceable variables. | [optional] [default to null]
**Instructions** | **string** | Optional: Instructions for the task owner. | [optional] [default to null]
**Name** | **string** | Task name (usually the same as the report name). | [optional] [default to null]
**Parameter** | [***Schedulerv3TaskParameter**](schedulerv3TaskParameter.md) |  | [optional] [default to null]
**Recipients** | [**[]Schedulerv3Recipient**](schedulerv3Recipient.md) | Optional: Report result recipients. | [optional] [default to null]
**ReportFilters** | [***Reportsv3ReportFilterBrackets**](reportsv3ReportFilterBrackets.md) |  | [optional] [default to null]
**ScheduledTaskId** | **string** | Optional: Id for the task. | [optional] [default to null]
**Type_** | [***Schedulerv3TaskType**](schedulerv3TaskType.md) |  | [optional] [default to null]
**WorkflowInvestigationLinks** | [**[]Schedulerv3ConfigurationItem**](schedulerv3ConfigurationItem.md) |  | [optional] [default to null]
**WorkflowResponseTemplate** | [***Schedulerv3ConfigurationItem**](schedulerv3ConfigurationItem.md) |  | [optional] [default to null]
**WorkflowType** | [***Schedulerv3WorkflowType**](schedulerv3WorkflowType.md) |  | [optional] [default to null]
**WorkflowUniqueFields** | **[]string** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

