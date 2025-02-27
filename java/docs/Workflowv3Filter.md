

# Workflowv3Filter

Filter - to find specific Cases.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignedToMe** | **Boolean** | Optional: Cases and tasks that are assigned to Me. |  [optional] |
|**assignedToMyRoles** | **Boolean** | Optional: Cases and tasks that are assigned to My Roles. |  [optional] |
|**dateCreated** | **OffsetDateTime** | Optional: where Date Created meets criteria. |  [optional] |
|**dateCreatedOperator** | **Workflowv3FilterOperator** |  |  [optional] |
|**dateDue** | **OffsetDateTime** | Optional: where Date Due meets criteria. |  [optional] |
|**dateDueOperator** | **Workflowv3FilterOperator** |  |  [optional] |
|**filterColumns** | [**List&lt;Workflowv3FilterColumn&gt;**](Workflowv3FilterColumn.md) |  |  [optional] |
|**priority** | **Workflowv3Priority** |  |  [optional] |
|**priorityOperator** | **Workflowv3FilterOperator** |  |  [optional] |
|**reportId** | **String** |  |  [optional] |
|**scheduledJobId** | **List&lt;String&gt;** |  |  [optional] |
|**scheduledTaskId** | **List&lt;String&gt;** |  |  [optional] |
|**status** | **Workflowv3Status** |  |  [optional] |
|**statusOperator** | **Workflowv3FilterOperator** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |



