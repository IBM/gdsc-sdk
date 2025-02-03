# Assetsv3AssetOverviewResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_classification** | [**Assetsv3AssetClassification**](Assetsv3AssetClassification.md) |  | [optional] 
**asset_control** | [**Assetsv3AssetControl**](Assetsv3AssetControl.md) |  | [optional] 
**asset_endpoints** | [**List[Assetsv3AssetEndpoint]**](Assetsv3AssetEndpoint.md) |  | [optional] 
**asset_information** | [**Assetsv3AssetInformation**](Assetsv3AssetInformation.md) |  | [optional] 
**asset_resource** | [**Assetsv3AssetResourcesInfo**](Assetsv3AssetResourcesInfo.md) |  | [optional] 
**asset_risk_events** | [**Assetsv3AssetRiskEvents**](Assetsv3AssetRiskEvents.md) |  | [optional] 
**asset_subscriptions** | [**List[Assetsv3AssetSubscription]**](Assetsv3AssetSubscription.md) |  | [optional] 
**asset_tags** | [**List[Assetsv3AssetTags]**](Assetsv3AssetTags.md) |  | [optional] 
**asset_va** | [**Assetsv3AssetVa**](Assetsv3AssetVa.md) |  | [optional] 
**dropdown_flag** | **int** |  | [optional] 
**entity_type** | **str** |  | [optional] 
**extended_properties** | [**List[Assetsv3ExtendedProp]**](Assetsv3ExtendedProp.md) |  | [optional] 
**model_application** | [**List[Assetsv3ModelApplication]**](Assetsv3ModelApplication.md) |  | [optional] 
**model_data** | [**List[Assetsv3ModelData]**](Assetsv3ModelData.md) |  | [optional] 
**overview_parameters** | [**List[Assetsv3OverviewParameter]**](Assetsv3OverviewParameter.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_asset_overview_response import Assetsv3AssetOverviewResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetOverviewResponse from a JSON string
assetsv3_asset_overview_response_instance = Assetsv3AssetOverviewResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetOverviewResponse.to_json())

# convert the object into a dict
assetsv3_asset_overview_response_dict = assetsv3_asset_overview_response_instance.to_dict()
# create an instance of Assetsv3AssetOverviewResponse from a dict
assetsv3_asset_overview_response_from_dict = Assetsv3AssetOverviewResponse.from_dict(assetsv3_asset_overview_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


