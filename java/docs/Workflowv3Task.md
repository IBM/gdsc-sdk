

# Workflowv3Task

Task (sub-task of a case).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**altId** | **String** | Alternate Unique ID. |  [optional] |
|**assignments** | [**List&lt;Workflowv3Entity&gt;**](Workflowv3Entity.md) | Entities that the task is assigned to. |  [optional] |
|**caseId** | **String** | Parent case. |  [optional] |
|**comments** | [**List&lt;Workflowv3Comment&gt;**](Workflowv3Comment.md) | Comments - who, when, what. |  [optional] |
|**dateCreated** | **OffsetDateTime** | Date created. |  [optional] |
|**dateDue** | **OffsetDateTime** | Date due. |  [optional] |
|**dateModified** | **OffsetDateTime** | Date of last update. |  [optional] |
|**dependsOn** | **List&lt;String&gt;** | Task ID dependencies if sequential processing is needed. |  [optional] |
|**description** | **String** | Multiline description of the task. |  [optional] |
|**investigationLinks** | [**List&lt;Schedulerv3ConfigurationItem&gt;**](Schedulerv3ConfigurationItem.md) |  |  [optional] |
|**justification** | **String** |  |  [optional] |
|**number** | **String** |  |  [optional] |
|**priority** | **Workflowv3Priority** |  |  [optional] |
|**reportResult** | [**Workflowv3ReportResult**](Workflowv3ReportResult.md) |  |  [optional] |
|**responseTemplate** | [**Schedulerv3ConfigurationItem**](Schedulerv3ConfigurationItem.md) |  |  [optional] |
|**reviewAction** | **String** |  |  [optional] |
|**run** | [**Workflowv3ReportRun**](Workflowv3ReportRun.md) |  |  [optional] |
|**status** | **Workflowv3Status** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**taskId** | **String** | Unique ID. |  [optional] |
|**title** | **String** | Task title (subject). |  [optional] |
|**workflowType** | **Schedulerv3WorkflowType** |  |  [optional] |



