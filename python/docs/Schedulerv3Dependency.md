# Schedulerv3Dependency


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**config_id** | **str** |  | [optional] 
**config_type** | **str** | Specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc. | [optional] 
**scheduled_task_count** | **int** | Total number of the scheduled job tasks. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_dependency import Schedulerv3Dependency

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3Dependency from a JSON string
schedulerv3_dependency_instance = Schedulerv3Dependency.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3Dependency.to_json())

# convert the object into a dict
schedulerv3_dependency_dict = schedulerv3_dependency_instance.to_dict()
# create an instance of Schedulerv3Dependency from a dict
schedulerv3_dependency_from_dict = Schedulerv3Dependency.from_dict(schedulerv3_dependency_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


