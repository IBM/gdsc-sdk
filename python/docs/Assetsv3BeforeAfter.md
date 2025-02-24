# Assetsv3BeforeAfter

Before and after the action was performed on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** |  | [optional] 
**asset_name** | **str** |  | [optional] 
**rule_id** | **str** |  | [optional] 
**rule_name** | **str** |  | [optional] 
**tag_category** | **str** |  | [optional] 
**tag_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_before_after import Assetsv3BeforeAfter

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3BeforeAfter from a JSON string
assetsv3_before_after_instance = Assetsv3BeforeAfter.from_json(json)
# print the JSON string representation of the object
print(Assetsv3BeforeAfter.to_json())

# convert the object into a dict
assetsv3_before_after_dict = assetsv3_before_after_instance.to_dict()
# create an instance of Assetsv3BeforeAfter from a dict
assetsv3_before_after_from_dict = Assetsv3BeforeAfter.from_dict(assetsv3_before_after_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


