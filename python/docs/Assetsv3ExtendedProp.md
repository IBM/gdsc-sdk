# Assetsv3ExtendedProp


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_type** | **str** |  | [optional] 
**entity_name** | **str** |  | [optional] 
**entity_type** | **str** |  | [optional] 
**key** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_extended_prop import Assetsv3ExtendedProp

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ExtendedProp from a JSON string
assetsv3_extended_prop_instance = Assetsv3ExtendedProp.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ExtendedProp.to_json())

# convert the object into a dict
assetsv3_extended_prop_dict = assetsv3_extended_prop_instance.to_dict()
# create an instance of Assetsv3ExtendedProp from a dict
assetsv3_extended_prop_from_dict = Assetsv3ExtendedProp.from_dict(assetsv3_extended_prop_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


