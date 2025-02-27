

# Resourcecontrollerk8v3Job

Job contains the information about a job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clusterRoleRules** | [**List&lt;Resourcecontrollerk8v3Rule&gt;**](Resourcecontrollerk8v3Rule.md) |  |  [optional] |
|**command** | **List&lt;String&gt;** | Optional:  The optional command to execute as part of the job (if the container entrypoint is insufficient). |  [optional] |
|**container** | [**Resourcecontrollerk8v3Container**](Resourcecontrollerk8v3Container.md) |  |  [optional] |
|**controllerId** | **String** | The ID of the controller to execute the job on. |  [optional] |
|**created** | **String** | Optional:  The date this job was created (ms since epoch). |  [optional] |
|**cron** | [**Resourcecontrollerk8v3Cron**](Resourcecontrollerk8v3Cron.md) |  |  [optional] |
|**files** | [**List&lt;Resourcecontrollerk8v3File&gt;**](Resourcecontrollerk8v3File.md) | Optional:  The files for the job. |  [optional] |
|**id** | **String** | The ID of the job. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Optional:  The labels for the associated job, cron job, and pod. |  [optional] |
|**lastExecution** | [**Resourcecontrollerk8v3JobExecution**](Resourcecontrollerk8v3JobExecution.md) |  |  [optional] |
|**modified** | **String** | Optional:  The date this job was modified (ms since epoch). |  [optional] |
|**name** | **String** | The name of the job. |  [optional] |
|**roleRules** | [**List&lt;Resourcecontrollerk8v3Rule&gt;**](Resourcecontrollerk8v3Rule.md) |  |  [optional] |
|**secretKey** | **String** |  |  [optional] |
|**secrets** | [**List&lt;Resourcecontrollerk8v3Secret&gt;**](Resourcecontrollerk8v3Secret.md) | Optional:  The secrets for the job. |  [optional] |
|**status** | **String** | Optional:  The current job status. |  [optional] |



