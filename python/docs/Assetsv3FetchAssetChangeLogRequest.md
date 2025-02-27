# Assetsv3FetchAssetChangeLogRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** |  | [optional] 
**filter** | [**List[Assetsv3FilterCatagory]**](Assetsv3FilterCatagory.md) |  | [optional] 
**page_number** | **int** |  | [optional] 
**page_size** | **int** |  | [optional] 
**search_key** | **str** |  | [optional] 
**sort** | **str** |  | [optional] 
**sort_by** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_fetch_asset_change_log_request import Assetsv3FetchAssetChangeLogRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3FetchAssetChangeLogRequest from a JSON string
assetsv3_fetch_asset_change_log_request_instance = Assetsv3FetchAssetChangeLogRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3FetchAssetChangeLogRequest.to_json())

# convert the object into a dict
assetsv3_fetch_asset_change_log_request_dict = assetsv3_fetch_asset_change_log_request_instance.to_dict()
# create an instance of Assetsv3FetchAssetChangeLogRequest from a dict
assetsv3_fetch_asset_change_log_request_from_dict = Assetsv3FetchAssetChangeLogRequest.from_dict(assetsv3_fetch_asset_change_log_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


