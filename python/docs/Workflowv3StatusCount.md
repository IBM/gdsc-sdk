# Workflowv3StatusCount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Workflowv3Status**](Workflowv3Status.md) |  | [optional] [default to Workflowv3Status.UNDEFINED_STATUS]
**total** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_status_count import Workflowv3StatusCount

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3StatusCount from a JSON string
workflowv3_status_count_instance = Workflowv3StatusCount.from_json(json)
# print the JSON string representation of the object
print(Workflowv3StatusCount.to_json())

# convert the object into a dict
workflowv3_status_count_dict = workflowv3_status_count_instance.to_dict()
# create an instance of Workflowv3StatusCount from a dict
workflowv3_status_count_from_dict = Workflowv3StatusCount.from_dict(workflowv3_status_count_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


