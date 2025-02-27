

# Workflowv3TaskCreate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**altId** | **String** |  |  [optional] |
|**assignments** | [**List&lt;Workflowv3Entity&gt;**](Workflowv3Entity.md) | Optional: Entities that the task is assigned to. |  [optional] |
|**comment** | **String** | Optional: Comment - this text will be added to the comments history. |  [optional] |
|**dateDue** | **OffsetDateTime** | Optional: Date due. |  [optional] |
|**dependsOn** | **List&lt;String&gt;** | Optional: Task ID dependencies if sequential processing is needed. |  [optional] |
|**description** | **String** | Optional: Multiline description of the task. |  [optional] |
|**investigationLinks** | [**List&lt;Schedulerv3ConfigurationItem&gt;**](Schedulerv3ConfigurationItem.md) |  |  [optional] |
|**origin** | [**Workflowv3Origin**](Workflowv3Origin.md) |  |  [optional] |
|**priority** | **Workflowv3Priority** |  |  [optional] |
|**reportResult** | [**Workflowv3ReportResult**](Workflowv3ReportResult.md) |  |  [optional] |
|**responseTemplate** | [**Schedulerv3ConfigurationItem**](Schedulerv3ConfigurationItem.md) |  |  [optional] |
|**status** | **Workflowv3Status** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**title** | **String** | Task title (subject). |  [optional] |



