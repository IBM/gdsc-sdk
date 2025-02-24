# Assetsv3FetchAssetListRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | **List[str]** |  | [optional] 
**filter** | [**List[Assetsv3FilterCatagory]**](Assetsv3FilterCatagory.md) |  | [optional] 
**page_number** | **int** |  | [optional] 
**page_size** | **int** |  | [optional] 
**parent_id** | **str** |  | [optional] 
**search_key** | **str** |  | [optional] 
**sort** | **str** |  | [optional] 
**sort_by** | **str** |  | [optional] 
**view_type** | [**Assetsv3AssetView**](Assetsv3AssetView.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_fetch_asset_list_request import Assetsv3FetchAssetListRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3FetchAssetListRequest from a JSON string
assetsv3_fetch_asset_list_request_instance = Assetsv3FetchAssetListRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3FetchAssetListRequest.to_json())

# convert the object into a dict
assetsv3_fetch_asset_list_request_dict = assetsv3_fetch_asset_list_request_instance.to_dict()
# create an instance of Assetsv3FetchAssetListRequest from a dict
assetsv3_fetch_asset_list_request_from_dict = Assetsv3FetchAssetListRequest.from_dict(assetsv3_fetch_asset_list_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


