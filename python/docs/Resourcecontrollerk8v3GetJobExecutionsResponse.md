# Resourcecontrollerk8v3GetJobExecutionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executions** | [**List[Resourcecontrollerk8v3JobExecution]**](Resourcecontrollerk8v3JobExecution.md) | The executions for the job. | [optional] 
**job_id** | **str** | The ID of the job to get status. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_get_job_executions_response import Resourcecontrollerk8v3GetJobExecutionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3GetJobExecutionsResponse from a JSON string
resourcecontrollerk8v3_get_job_executions_response_instance = Resourcecontrollerk8v3GetJobExecutionsResponse.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3GetJobExecutionsResponse.to_json())

# convert the object into a dict
resourcecontrollerk8v3_get_job_executions_response_dict = resourcecontrollerk8v3_get_job_executions_response_instance.to_dict()
# create an instance of Resourcecontrollerk8v3GetJobExecutionsResponse from a dict
resourcecontrollerk8v3_get_job_executions_response_from_dict = Resourcecontrollerk8v3GetJobExecutionsResponse.from_dict(resourcecontrollerk8v3_get_job_executions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


