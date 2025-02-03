

# Workflowv3Case

Top-level task (case).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**altId** | **String** | Alternate Unique ID. |  [optional] |
|**artifacts** | **List&lt;String&gt;** | Array of artifact URLs, i.e. a URL to a report result. |  [optional] |
|**assignments** | [**List&lt;Workflowv3Entity&gt;**](Workflowv3Entity.md) | Entities that the case is assigned to. |  [optional] |
|**caseId** | **String** | Unique ID. |  [optional] |
|**comments** | [**List&lt;Workflowv3Comment&gt;**](Workflowv3Comment.md) | Comments - who, when, what. |  [optional] |
|**dateCreated** | **OffsetDateTime** | Date created (Scheduled job queue time). |  [optional] |
|**dateDue** | **OffsetDateTime** | Date due (Scheduled job next run). |  [optional] |
|**dateModified** | **OffsetDateTime** | Date of last update. |  [optional] |
|**description** | **String** | Multiline description of the case. |  [optional] |
|**fullAccess** | **Boolean** | Access level. |  [optional] |
|**origin** | [**Workflowv3Origin**](Workflowv3Origin.md) |  |  [optional] |
|**priority** | **Workflowv3Priority** |  |  [optional] |
|**status** | **Workflowv3Status** |  |  [optional] |
|**tasks** | [**List&lt;Workflowv3Task&gt;**](Workflowv3Task.md) | Sub-tasks that the current user has access to. |  [optional] |
|**title** | **String** | Case title (subject). |  [optional] |



