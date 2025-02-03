# Schedulerv3RepeatBegin

RepeatBegin includes schedule repeat begins at which hour and the timezone information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hour** | **int** | Begins at which hour. | [optional] 
**minute** | **int** | Begins at which minute. | [optional] 
**timezone** | **str** | Timezone information. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_repeat_begin import Schedulerv3RepeatBegin

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3RepeatBegin from a JSON string
schedulerv3_repeat_begin_instance = Schedulerv3RepeatBegin.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3RepeatBegin.to_json())

# convert the object into a dict
schedulerv3_repeat_begin_dict = schedulerv3_repeat_begin_instance.to_dict()
# create an instance of Schedulerv3RepeatBegin from a dict
schedulerv3_repeat_begin_from_dict = Schedulerv3RepeatBegin.from_dict(schedulerv3_repeat_begin_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


