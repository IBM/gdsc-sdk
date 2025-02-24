# Assetsv3AssetClassification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classification** | [**List[Assetsv3ClassificationData]**](Assetsv3ClassificationData.md) |  | [optional] 
**last_activity** | **str** |  | [optional] 
**total_count** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_asset_classification import Assetsv3AssetClassification

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetClassification from a JSON string
assetsv3_asset_classification_instance = Assetsv3AssetClassification.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetClassification.to_json())

# convert the object into a dict
assetsv3_asset_classification_dict = assetsv3_asset_classification_instance.to_dict()
# create an instance of Assetsv3AssetClassification from a dict
assetsv3_asset_classification_from_dict = Assetsv3AssetClassification.from_dict(assetsv3_asset_classification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


