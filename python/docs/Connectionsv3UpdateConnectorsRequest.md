# Connectionsv3UpdateConnectorsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectors** | [**List[Connectionsv3Connector]**](Connectionsv3Connector.md) | The list of connectors to update. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_update_connectors_request import Connectionsv3UpdateConnectorsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3UpdateConnectorsRequest from a JSON string
connectionsv3_update_connectors_request_instance = Connectionsv3UpdateConnectorsRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3UpdateConnectorsRequest.to_json())

# convert the object into a dict
connectionsv3_update_connectors_request_dict = connectionsv3_update_connectors_request_instance.to_dict()
# create an instance of Connectionsv3UpdateConnectorsRequest from a dict
connectionsv3_update_connectors_request_from_dict = Connectionsv3UpdateConnectorsRequest.from_dict(connectionsv3_update_connectors_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


