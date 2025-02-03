# Assetsv3AssetInformation

AssetInformation - Asset Overview - Asset Information .

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | **str** |  | [optional] 
**application_id** | **str** |  | [optional] 
**asset_name** | **str** |  | [optional] 
**asset_type** | **str** |  | [optional] 
**category** | **str** |  | [optional] 
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**criticality** | **str** |  | [optional] 
**data_center** | **str** |  | [optional] 
**database** | **str** |  | [optional] 
**database_protocol** | **str** |  | [optional] 
**database_type** | **str** |  | [optional] 
**deployment** | **str** |  | [optional] 
**endpoint** | **str** |  | [optional] 
**environment** | **str** |  | [optional] 
**folder_path** | **str** |  | [optional] 
**gdp_data_sources** | **str** |  | [optional] 
**has_training_data** | **bool** |  | [optional] 
**host_name** | **str** |  | [optional] 
**last_activity** | **str** |  | [optional] 
**last_trained** | **str** |  | [optional] 
**mac_address** | **str** |  | [optional] 
**model** | **str** |  | [optional] 
**os** | **str** |  | [optional] 
**owner** | **str** |  | [optional] 
**publisher** | **str** |  | [optional] 
**region** | **str** |  | [optional] 
**risk_level** | **str** |  | [optional] 
**var_schema** | **str** |  | [optional] 
**server** | **str** |  | [optional] 
**service** | **str** |  | [optional] 
**size** | **str** |  | [optional] 
**state** | **str** |  | [optional] 
**storage** | **str** |  | [optional] 
**storage_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_asset_information import Assetsv3AssetInformation

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetInformation from a JSON string
assetsv3_asset_information_instance = Assetsv3AssetInformation.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetInformation.to_json())

# convert the object into a dict
assetsv3_asset_information_dict = assetsv3_asset_information_instance.to_dict()
# create an instance of Assetsv3AssetInformation from a dict
assetsv3_asset_information_from_dict = Assetsv3AssetInformation.from_dict(assetsv3_asset_information_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


