# Resourcecontrollerk8v3Job

Job contains the information about a job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cluster_role_rules** | [**List[Resourcecontrollerk8v3Rule]**](Resourcecontrollerk8v3Rule.md) |  | [optional] 
**command** | **List[str]** | Optional:  The optional command to execute as part of the job (if the container entrypoint is insufficient). | [optional] 
**container** | [**Resourcecontrollerk8v3Container**](Resourcecontrollerk8v3Container.md) |  | [optional] 
**controller_id** | **str** | The ID of the controller to execute the job on. | [optional] 
**created** | **str** | Optional:  The date this job was created (ms since epoch). | [optional] 
**cron** | [**Resourcecontrollerk8v3Cron**](Resourcecontrollerk8v3Cron.md) |  | [optional] 
**files** | [**List[Resourcecontrollerk8v3File]**](Resourcecontrollerk8v3File.md) | Optional:  The files for the job. | [optional] 
**id** | **str** | The ID of the job. | [optional] 
**labels** | **Dict[str, str]** | Optional:  The labels for the associated job, cron job, and pod. | [optional] 
**last_execution** | [**Resourcecontrollerk8v3JobExecution**](Resourcecontrollerk8v3JobExecution.md) |  | [optional] 
**modified** | **str** | Optional:  The date this job was modified (ms since epoch). | [optional] 
**name** | **str** | The name of the job. | [optional] 
**role_rules** | [**List[Resourcecontrollerk8v3Rule]**](Resourcecontrollerk8v3Rule.md) |  | [optional] 
**secret_key** | **str** |  | [optional] 
**secrets** | [**List[Resourcecontrollerk8v3Secret]**](Resourcecontrollerk8v3Secret.md) | Optional:  The secrets for the job. | [optional] 
**status** | **str** | Optional:  The current job status. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_job import Resourcecontrollerk8v3Job

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3Job from a JSON string
resourcecontrollerk8v3_job_instance = Resourcecontrollerk8v3Job.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3Job.to_json())

# convert the object into a dict
resourcecontrollerk8v3_job_dict = resourcecontrollerk8v3_job_instance.to_dict()
# create an instance of Resourcecontrollerk8v3Job from a dict
resourcecontrollerk8v3_job_from_dict = Resourcecontrollerk8v3Job.from_dict(resourcecontrollerk8v3_job_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


