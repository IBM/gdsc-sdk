# Assetsv3FetchAssetChangeLogResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_change_log** | [**List[Assetsv3AssetChangeLog]**](Assetsv3AssetChangeLog.md) |  | [optional] 
**total_count** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_fetch_asset_change_log_response import Assetsv3FetchAssetChangeLogResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3FetchAssetChangeLogResponse from a JSON string
assetsv3_fetch_asset_change_log_response_instance = Assetsv3FetchAssetChangeLogResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3FetchAssetChangeLogResponse.to_json())

# convert the object into a dict
assetsv3_fetch_asset_change_log_response_dict = assetsv3_fetch_asset_change_log_response_instance.to_dict()
# create an instance of Assetsv3FetchAssetChangeLogResponse from a dict
assetsv3_fetch_asset_change_log_response_from_dict = Assetsv3FetchAssetChangeLogResponse.from_dict(assetsv3_fetch_asset_change_log_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


