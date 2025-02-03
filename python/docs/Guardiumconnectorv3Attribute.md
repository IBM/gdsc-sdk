# Guardiumconnectorv3Attribute

Central Manager attribute definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Attribute name. | [optional] 
**value** | **str** | Attribute value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_attribute import Guardiumconnectorv3Attribute

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3Attribute from a JSON string
guardiumconnectorv3_attribute_instance = Guardiumconnectorv3Attribute.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3Attribute.to_json())

# convert the object into a dict
guardiumconnectorv3_attribute_dict = guardiumconnectorv3_attribute_instance.to_dict()
# create an instance of Guardiumconnectorv3Attribute from a dict
guardiumconnectorv3_attribute_from_dict = Guardiumconnectorv3Attribute.from_dict(guardiumconnectorv3_attribute_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


