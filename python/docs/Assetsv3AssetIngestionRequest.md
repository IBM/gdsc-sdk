# Assetsv3AssetIngestionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | [**List[Assetsv3AccountVertex]**](Assetsv3AccountVertex.md) |  | [optional] 
**applications** | [**List[Assetsv3ApplicationVertex]**](Assetsv3ApplicationVertex.md) |  | [optional] 
**databases** | [**List[Assetsv3DatabaseVertex]**](Assetsv3DatabaseVertex.md) |  | [optional] 
**deployments** | [**List[Assetsv3DeploymentVertex]**](Assetsv3DeploymentVertex.md) |  | [optional] 
**endpoints** | [**List[Assetsv3EndpointVertex]**](Assetsv3EndpointVertex.md) |  | [optional] 
**hosts** | [**List[Assetsv3HostVertex]**](Assetsv3HostVertex.md) |  | [optional] 
**ips** | [**List[Assetsv3IPVertex]**](Assetsv3IPVertex.md) |  | [optional] 
**models** | [**List[Assetsv3ModelVertex]**](Assetsv3ModelVertex.md) |  | [optional] 
**origin** | **str** |  | [optional] 
**ports** | [**List[Assetsv3PortVertex]**](Assetsv3PortVertex.md) |  | [optional] 
**resources** | [**List[Assetsv3ResourcesVertex]**](Assetsv3ResourcesVertex.md) |  | [optional] 
**storages** | [**List[Assetsv3StorageVertex]**](Assetsv3StorageVertex.md) |  | [optional] 
**subscriptions** | [**List[Assetsv3SubscriptionVertex]**](Assetsv3SubscriptionVertex.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_asset_ingestion_request import Assetsv3AssetIngestionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetIngestionRequest from a JSON string
assetsv3_asset_ingestion_request_instance = Assetsv3AssetIngestionRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetIngestionRequest.to_json())

# convert the object into a dict
assetsv3_asset_ingestion_request_dict = assetsv3_asset_ingestion_request_instance.to_dict()
# create an instance of Assetsv3AssetIngestionRequest from a dict
assetsv3_asset_ingestion_request_from_dict = Assetsv3AssetIngestionRequest.from_dict(assetsv3_asset_ingestion_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


