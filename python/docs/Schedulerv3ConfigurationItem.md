# Schedulerv3ConfigurationItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**display** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_configuration_item import Schedulerv3ConfigurationItem

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3ConfigurationItem from a JSON string
schedulerv3_configuration_item_instance = Schedulerv3ConfigurationItem.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3ConfigurationItem.to_json())

# convert the object into a dict
schedulerv3_configuration_item_dict = schedulerv3_configuration_item_instance.to_dict()
# create an instance of Schedulerv3ConfigurationItem from a dict
schedulerv3_configuration_item_from_dict = Schedulerv3ConfigurationItem.from_dict(schedulerv3_configuration_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


