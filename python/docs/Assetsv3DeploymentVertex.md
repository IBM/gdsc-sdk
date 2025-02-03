# Assetsv3DeploymentVertex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**criticality** | [**Assetsv3Level**](Assetsv3Level.md) |  | [optional] 
**data_center** | **str** |  | [optional] 
**deployment_account** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**deployment_id** | **str** |  | [optional] 
**deployment_subscription** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**dns** | **str** |  | [optional] 
**environment** | **str** |  | [optional] 
**extended_properties** | [**List[Assetsv3CustomProperty]**](Assetsv3CustomProperty.md) |  | [optional] 
**name** | **str** |  | [optional] 
**region** | **str** |  | [optional] 
**resolution_key** | **str** |  | [optional] 
**risk_level** | [**Assetsv3Level**](Assetsv3Level.md) |  | [optional] 
**service** | **str** |  | [optional] 
**state** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_deployment_vertex import Assetsv3DeploymentVertex

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3DeploymentVertex from a JSON string
assetsv3_deployment_vertex_instance = Assetsv3DeploymentVertex.from_json(json)
# print the JSON string representation of the object
print(Assetsv3DeploymentVertex.to_json())

# convert the object into a dict
assetsv3_deployment_vertex_dict = assetsv3_deployment_vertex_instance.to_dict()
# create an instance of Assetsv3DeploymentVertex from a dict
assetsv3_deployment_vertex_from_dict = Assetsv3DeploymentVertex.from_dict(assetsv3_deployment_vertex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


