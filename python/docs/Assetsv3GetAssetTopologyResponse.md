# Assetsv3GetAssetTopologyResponse

GetAssetTopologyResponse - Response to get list of topology for a parent asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapped_entities** | [**Assetsv3MappedEntities**](Assetsv3MappedEntities.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_get_asset_topology_response import Assetsv3GetAssetTopologyResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3GetAssetTopologyResponse from a JSON string
assetsv3_get_asset_topology_response_instance = Assetsv3GetAssetTopologyResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3GetAssetTopologyResponse.to_json())

# convert the object into a dict
assetsv3_get_asset_topology_response_dict = assetsv3_get_asset_topology_response_instance.to_dict()
# create an instance of Assetsv3GetAssetTopologyResponse from a dict
assetsv3_get_asset_topology_response_from_dict = Assetsv3GetAssetTopologyResponse.from_dict(assetsv3_get_asset_topology_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


