# Resourcecontrollerk8v3UpdateJobExecutionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**details** | **str** | Optional: The details of the job execution. | [optional] 
**ended** | **str** | Optional: The date this execution ended. | [optional] 
**id** | **str** | The ID of the job execution to update. | [optional] 
**job_id** | **str** | The ID of the job the execution is for. | [optional] 
**modified** | **str** | Optional: The date this job execution was modified (ms since epoch). | [optional] 
**name** | **str** | The name of the job execution. | [optional] 
**started** | **str** | The date this execution started. | [optional] 
**status** | **str** | The status of the execution. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_update_job_execution_request import Resourcecontrollerk8v3UpdateJobExecutionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3UpdateJobExecutionRequest from a JSON string
resourcecontrollerk8v3_update_job_execution_request_instance = Resourcecontrollerk8v3UpdateJobExecutionRequest.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3UpdateJobExecutionRequest.to_json())

# convert the object into a dict
resourcecontrollerk8v3_update_job_execution_request_dict = resourcecontrollerk8v3_update_job_execution_request_instance.to_dict()
# create an instance of Resourcecontrollerk8v3UpdateJobExecutionRequest from a dict
resourcecontrollerk8v3_update_job_execution_request_from_dict = Resourcecontrollerk8v3UpdateJobExecutionRequest.from_dict(resourcecontrollerk8v3_update_job_execution_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


