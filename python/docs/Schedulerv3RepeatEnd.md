# Schedulerv3RepeatEnd

RepeatEnd includes repeat ends at which hour and the timezone information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hour** | **int** | Ends at which hour. | [optional] 
**minute** | **int** | Ends at which minute. | [optional] 
**timezone** | **str** | Timezone information. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_repeat_end import Schedulerv3RepeatEnd

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3RepeatEnd from a JSON string
schedulerv3_repeat_end_instance = Schedulerv3RepeatEnd.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3RepeatEnd.to_json())

# convert the object into a dict
schedulerv3_repeat_end_dict = schedulerv3_repeat_end_instance.to_dict()
# create an instance of Schedulerv3RepeatEnd from a dict
schedulerv3_repeat_end_from_dict = Schedulerv3RepeatEnd.from_dict(schedulerv3_repeat_end_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


