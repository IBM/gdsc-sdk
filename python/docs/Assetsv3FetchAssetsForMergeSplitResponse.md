# Assetsv3FetchAssetsForMergeSplitResponse

Response to Fetch Assets eligible for Merge or Split.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets** | [**List[Assetsv3AssetsForMergeSplitResponse]**](Assetsv3AssetsForMergeSplitResponse.md) |  | [optional] 
**assets_count** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_fetch_assets_for_merge_split_response import Assetsv3FetchAssetsForMergeSplitResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3FetchAssetsForMergeSplitResponse from a JSON string
assetsv3_fetch_assets_for_merge_split_response_instance = Assetsv3FetchAssetsForMergeSplitResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3FetchAssetsForMergeSplitResponse.to_json())

# convert the object into a dict
assetsv3_fetch_assets_for_merge_split_response_dict = assetsv3_fetch_assets_for_merge_split_response_instance.to_dict()
# create an instance of Assetsv3FetchAssetsForMergeSplitResponse from a dict
assetsv3_fetch_assets_for_merge_split_response_from_dict = Assetsv3FetchAssetsForMergeSplitResponse.from_dict(assetsv3_fetch_assets_for_merge_split_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


