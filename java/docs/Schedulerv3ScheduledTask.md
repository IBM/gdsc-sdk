

# Schedulerv3ScheduledTask

Scheduled Task for Post v3/schedules api.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditType** | **Schedulerv3AuditType** |  |  [optional] |
|**deliveryMethod** | [**Schedulerv3DeliveryMethod**](Schedulerv3DeliveryMethod.md) |  |  [optional] |
|**distributionRuleIds** | **List&lt;String&gt;** | Optional: Distribution rule IDs for a task. Will be populated by recipients on save. |  [optional] |
|**emailSubject** | **String** | Optional: Email subject with replaceable variables. |  [optional] |
|**instructions** | **String** | Optional: Instructions for the task owner. |  [optional] |
|**name** | **String** | Task name (usually the same as the report name). |  [optional] |
|**parameter** | [**Schedulerv3TaskParameter**](Schedulerv3TaskParameter.md) |  |  [optional] |
|**recipients** | [**List&lt;Schedulerv3Recipient&gt;**](Schedulerv3Recipient.md) | Optional: Report result recipients. |  [optional] |
|**reportFilters** | [**Reportsv3ReportFilterBrackets**](Reportsv3ReportFilterBrackets.md) |  |  [optional] |
|**scheduledTaskId** | **String** | Optional: Id for the task. |  [optional] |
|**type** | **Schedulerv3TaskType** |  |  [optional] |
|**workflowInvestigationLinks** | [**List&lt;Schedulerv3ConfigurationItem&gt;**](Schedulerv3ConfigurationItem.md) |  |  [optional] |
|**workflowResponseTemplate** | [**Schedulerv3ConfigurationItem**](Schedulerv3ConfigurationItem.md) |  |  [optional] |
|**workflowType** | **Schedulerv3WorkflowType** |  |  [optional] |
|**workflowUniqueFields** | **List&lt;String&gt;** |  |  [optional] |



