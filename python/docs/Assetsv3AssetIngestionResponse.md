# Assetsv3AssetIngestionResponse

Response - The response message is for Asset Ingestion api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_asset_ingestion_response import Assetsv3AssetIngestionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetIngestionResponse from a JSON string
assetsv3_asset_ingestion_response_instance = Assetsv3AssetIngestionResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetIngestionResponse.to_json())

# convert the object into a dict
assetsv3_asset_ingestion_response_dict = assetsv3_asset_ingestion_response_instance.to_dict()
# create an instance of Assetsv3AssetIngestionResponse from a dict
assetsv3_asset_ingestion_response_from_dict = Assetsv3AssetIngestionResponse.from_dict(assetsv3_asset_ingestion_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


