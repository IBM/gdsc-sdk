# Workflowv3JobCount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**scheduled_job_id** | **str** |  | [optional] 
**total** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_job_count import Workflowv3JobCount

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3JobCount from a JSON string
workflowv3_job_count_instance = Workflowv3JobCount.from_json(json)
# print the JSON string representation of the object
print(Workflowv3JobCount.to_json())

# convert the object into a dict
workflowv3_job_count_dict = workflowv3_job_count_instance.to_dict()
# create an instance of Workflowv3JobCount from a dict
workflowv3_job_count_from_dict = Workflowv3JobCount.from_dict(workflowv3_job_count_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


