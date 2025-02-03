

# Workflowv3CaseEdit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**artifacts** | **List&lt;String&gt;** | Optional: Array of artifact URLs, i.e. a URL to a report result. |  [optional] |
|**assignments** | [**List&lt;Workflowv3Entity&gt;**](Workflowv3Entity.md) | Optional: Entities that the case is assigned to. |  [optional] |
|**caseId** | **String** | Unique ID - needed to update the case (read-only). |  [optional] |
|**comment** | **String** | Optional: Comment - this text will be added to the comments history. |  [optional] |
|**dateDue** | **OffsetDateTime** | Optional: Date due. |  [optional] |
|**description** | **String** | Optional: Multiline description of the case. |  [optional] |
|**priority** | **Workflowv3Priority** |  |  [optional] |
|**status** | **Workflowv3Status** |  |  [optional] |
|**title** | **String** | Optional: Case title (subject). |  [optional] |



