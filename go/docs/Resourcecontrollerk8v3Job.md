# Resourcecontrollerk8v3Job

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClusterRoleRules** | [**[]Resourcecontrollerk8v3Rule**](resourcecontrollerk8v3Rule.md) |  | [optional] [default to null]
**Command** | **[]string** | Optional:  The optional command to execute as part of the job (if the container entrypoint is insufficient). | [optional] [default to null]
**Container** | [***Resourcecontrollerk8v3Container**](resourcecontrollerk8v3Container.md) |  | [optional] [default to null]
**ControllerId** | **string** | The ID of the controller to execute the job on. | [optional] [default to null]
**Created** | **string** | Optional:  The date this job was created (ms since epoch). | [optional] [default to null]
**Cron** | [***Resourcecontrollerk8v3Cron**](resourcecontrollerk8v3Cron.md) |  | [optional] [default to null]
**Files** | [**[]Resourcecontrollerk8v3File**](resourcecontrollerk8v3File.md) | Optional:  The files for the job. | [optional] [default to null]
**Id** | **string** | The ID of the job. | [optional] [default to null]
**Labels** | **map[string]string** | Optional:  The labels for the associated job, cron job, and pod. | [optional] [default to null]
**LastExecution** | [***Resourcecontrollerk8v3JobExecution**](resourcecontrollerk8v3JobExecution.md) |  | [optional] [default to null]
**Modified** | **string** | Optional:  The date this job was modified (ms since epoch). | [optional] [default to null]
**Name** | **string** | The name of the job. | [optional] [default to null]
**RoleRules** | [**[]Resourcecontrollerk8v3Rule**](resourcecontrollerk8v3Rule.md) |  | [optional] [default to null]
**SecretKey** | **string** |  | [optional] [default to null]
**Secrets** | [**[]Resourcecontrollerk8v3Secret**](resourcecontrollerk8v3Secret.md) | Optional:  The secrets for the job. | [optional] [default to null]
**Status** | **string** | Optional:  The current job status. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

