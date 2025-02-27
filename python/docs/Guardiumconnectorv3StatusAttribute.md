# Guardiumconnectorv3StatusAttribute

StatusAttribute is the key/value pair attributes of a Guardium unit.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | Attribute key name. | [optional] 
**value** | **str** | Attribute value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_status_attribute import Guardiumconnectorv3StatusAttribute

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3StatusAttribute from a JSON string
guardiumconnectorv3_status_attribute_instance = Guardiumconnectorv3StatusAttribute.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3StatusAttribute.to_json())

# convert the object into a dict
guardiumconnectorv3_status_attribute_dict = guardiumconnectorv3_status_attribute_instance.to_dict()
# create an instance of Guardiumconnectorv3StatusAttribute from a dict
guardiumconnectorv3_status_attribute_from_dict = Guardiumconnectorv3StatusAttribute.from_dict(guardiumconnectorv3_status_attribute_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


