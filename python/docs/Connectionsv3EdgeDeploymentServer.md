# Connectionsv3EdgeDeploymentServer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**name** | **str** | The name of the server. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_edge_deployment_server import Connectionsv3EdgeDeploymentServer

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3EdgeDeploymentServer from a JSON string
connectionsv3_edge_deployment_server_instance = Connectionsv3EdgeDeploymentServer.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3EdgeDeploymentServer.to_json())

# convert the object into a dict
connectionsv3_edge_deployment_server_dict = connectionsv3_edge_deployment_server_instance.to_dict()
# create an instance of Connectionsv3EdgeDeploymentServer from a dict
connectionsv3_edge_deployment_server_from_dict = Connectionsv3EdgeDeploymentServer.from_dict(connectionsv3_edge_deployment_server_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


