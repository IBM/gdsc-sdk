# Assetsv3TagCategory

Base tag domain object which is used in get and list APIs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_time** | **datetime** |  | [optional] 
**creation_time_utc** | **datetime** |  | [optional] 
**description** | **str** | Description of Tag Domain. | [optional] 
**grouper** | **str** |  | [optional] 
**id** | **str** | id of  Domain. | [optional] 
**is_delete** | **bool** |  | [optional] 
**mapped_entity_name** | **str** |  | [optional] 
**name** | **str** | Name of Tag Domain. | [optional] 
**properties** | **str** |  | [optional] 
**purpose** | **str** | Purpose of  Domain. | [optional] 
**tags** | [**List[Assetsv3Tag]**](Assetsv3Tag.md) |  | [optional] 
**updated_time** | **datetime** |  | [optional] 
**utc_offset** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_tag_category import Assetsv3TagCategory

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3TagCategory from a JSON string
assetsv3_tag_category_instance = Assetsv3TagCategory.from_json(json)
# print the JSON string representation of the object
print(Assetsv3TagCategory.to_json())

# convert the object into a dict
assetsv3_tag_category_dict = assetsv3_tag_category_instance.to_dict()
# create an instance of Assetsv3TagCategory from a dict
assetsv3_tag_category_from_dict = Assetsv3TagCategory.from_dict(assetsv3_tag_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


