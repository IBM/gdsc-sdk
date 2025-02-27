# Assetsv3Attributes

Attributes - Entity data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**critical_vulnerability_count** | **str** |  | [optional] 
**entity_id** | **str** |  | [optional] 
**entity_name** | **str** |  | [optional] 
**grouper_id** | **str** |  | [optional] 
**has_training_data** | **bool** |  | [optional] 
**major_vulnerability_count** | **str** |  | [optional] 
**sensitive_data_count** | **str** |  | [optional] 
**status_type** | [**Assetsv3StatusType**](Assetsv3StatusType.md) |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_attributes import Assetsv3Attributes

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3Attributes from a JSON string
assetsv3_attributes_instance = Assetsv3Attributes.from_json(json)
# print the JSON string representation of the object
print(Assetsv3Attributes.to_json())

# convert the object into a dict
assetsv3_attributes_dict = assetsv3_attributes_instance.to_dict()
# create an instance of Assetsv3Attributes from a dict
assetsv3_attributes_from_dict = Assetsv3Attributes.from_dict(assetsv3_attributes_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


