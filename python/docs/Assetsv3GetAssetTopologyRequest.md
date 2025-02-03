# Assetsv3GetAssetTopologyRequest

GetAssetTopologyRequest - Request to get topology for a parent asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_get_asset_topology_request import Assetsv3GetAssetTopologyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3GetAssetTopologyRequest from a JSON string
assetsv3_get_asset_topology_request_instance = Assetsv3GetAssetTopologyRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3GetAssetTopologyRequest.to_json())

# convert the object into a dict
assetsv3_get_asset_topology_request_dict = assetsv3_get_asset_topology_request_instance.to_dict()
# create an instance of Assetsv3GetAssetTopologyRequest from a dict
assetsv3_get_asset_topology_request_from_dict = Assetsv3GetAssetTopologyRequest.from_dict(assetsv3_get_asset_topology_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


