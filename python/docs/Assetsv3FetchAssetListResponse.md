# Assetsv3FetchAssetListResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets** | [**List[Assetsv3Asset]**](Assetsv3Asset.md) |  | [optional] 
**groups** | [**List[Assetsv3GroupedAsset]**](Assetsv3GroupedAsset.md) |  | [optional] 
**total_count** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_fetch_asset_list_response import Assetsv3FetchAssetListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3FetchAssetListResponse from a JSON string
assetsv3_fetch_asset_list_response_instance = Assetsv3FetchAssetListResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3FetchAssetListResponse.to_json())

# convert the object into a dict
assetsv3_fetch_asset_list_response_dict = assetsv3_fetch_asset_list_response_instance.to_dict()
# create an instance of Assetsv3FetchAssetListResponse from a dict
assetsv3_fetch_asset_list_response_from_dict = Assetsv3FetchAssetListResponse.from_dict(assetsv3_fetch_asset_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


