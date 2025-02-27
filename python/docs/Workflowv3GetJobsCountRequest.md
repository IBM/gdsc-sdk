# Workflowv3GetJobsCountRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**case_id** | **str** |  | [optional] 
**filter** | [**Workflowv3Filter**](Workflowv3Filter.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_get_jobs_count_request import Workflowv3GetJobsCountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3GetJobsCountRequest from a JSON string
workflowv3_get_jobs_count_request_instance = Workflowv3GetJobsCountRequest.from_json(json)
# print the JSON string representation of the object
print(Workflowv3GetJobsCountRequest.to_json())

# convert the object into a dict
workflowv3_get_jobs_count_request_dict = workflowv3_get_jobs_count_request_instance.to_dict()
# create an instance of Workflowv3GetJobsCountRequest from a dict
workflowv3_get_jobs_count_request_from_dict = Workflowv3GetJobsCountRequest.from_dict(workflowv3_get_jobs_count_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


