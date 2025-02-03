

# Workflowv3TaskEdit

Editable fields of a task.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignments** | [**List&lt;Workflowv3Entity&gt;**](Workflowv3Entity.md) | Optional: Entities that the task is assigned to. |  [optional] |
|**comment** | **String** | Optional: Comment - this text will be added to the comments history. |  [optional] |
|**dateDue** | **OffsetDateTime** | Optional: Date due. |  [optional] |
|**dependsOn** | **List&lt;String&gt;** | Optional: Task ID dependencies if sequential processing is needed. |  [optional] |
|**description** | **String** | Optional: Multiline description of the task. |  [optional] |
|**investigationLinks** | [**List&lt;Schedulerv3ConfigurationItem&gt;**](Schedulerv3ConfigurationItem.md) |  |  [optional] |
|**justification** | **String** | Optional: Justification - this text will be added to the respond justification. |  [optional] |
|**priority** | **Workflowv3Priority** |  |  [optional] |
|**responseTemplate** | [**Schedulerv3ConfigurationItem**](Schedulerv3ConfigurationItem.md) |  |  [optional] |
|**reviewAction** | **String** | Optional: review action - this text will be added to the respond action. |  [optional] |
|**status** | **Workflowv3Status** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**taskId** | **String** |  |  [optional] |
|**title** | **String** | Optional: Task title (subject). |  [optional] |



