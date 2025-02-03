# Assetsv3CustomProperty


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_type** | **str** | data type of the custom property. | [optional] 
**key** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_custom_property import Assetsv3CustomProperty

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3CustomProperty from a JSON string
assetsv3_custom_property_instance = Assetsv3CustomProperty.from_json(json)
# print the JSON string representation of the object
print(Assetsv3CustomProperty.to_json())

# convert the object into a dict
assetsv3_custom_property_dict = assetsv3_custom_property_instance.to_dict()
# create an instance of Assetsv3CustomProperty from a dict
assetsv3_custom_property_from_dict = Assetsv3CustomProperty.from_dict(assetsv3_custom_property_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


