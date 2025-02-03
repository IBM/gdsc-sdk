# Assetsv3AssetsForMergeSplitResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **int** |  | [optional] 
**asset_name** | **str** |  | [optional] 
**database_name** | **str** |  | [optional] 
**dsdef_key** | **str** |  | [optional] 
**host_name** | **str** |  | [optional] 
**host_port** | **str** |  | [optional] 
**ip_address** | **str** |  | [optional] 
**ip_port** | **str** |  | [optional] 
**is_mergeable** | **bool** |  | [optional] 
**is_splittable** | **bool** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_assets_for_merge_split_response import Assetsv3AssetsForMergeSplitResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetsForMergeSplitResponse from a JSON string
assetsv3_assets_for_merge_split_response_instance = Assetsv3AssetsForMergeSplitResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetsForMergeSplitResponse.to_json())

# convert the object into a dict
assetsv3_assets_for_merge_split_response_dict = assetsv3_assets_for_merge_split_response_instance.to_dict()
# create an instance of Assetsv3AssetsForMergeSplitResponse from a dict
assetsv3_assets_for_merge_split_response_from_dict = Assetsv3AssetsForMergeSplitResponse.from_dict(assetsv3_assets_for_merge_split_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


