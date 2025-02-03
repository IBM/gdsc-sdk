# Assetsv3Tag


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_time** | **datetime** |  | [optional] 
**creation_time_utc** | **datetime** |  | [optional] 
**description** | **str** | Description of Tag concept. | [optional] 
**domain_id** | **str** | Id of  Domain of the tag concept. | [optional] 
**id** | **str** | id of  concept. | [optional] 
**is_delete** | **bool** |  | [optional] 
**name** | **str** | Name of Tag concept. | [optional] 
**properties** | **str** |  | [optional] 
**source** | **str** |  | [optional] 
**updated_time** | **datetime** |  | [optional] 
**utc_offset** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_tag import Assetsv3Tag

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3Tag from a JSON string
assetsv3_tag_instance = Assetsv3Tag.from_json(json)
# print the JSON string representation of the object
print(Assetsv3Tag.to_json())

# convert the object into a dict
assetsv3_tag_dict = assetsv3_tag_instance.to_dict()
# create an instance of Assetsv3Tag from a dict
assetsv3_tag_from_dict = Assetsv3Tag.from_dict(assetsv3_tag_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


