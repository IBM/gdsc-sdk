# Connectionsv3PartialUpdateConnectorsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectors** | [**List[Connectionsv3PartialConnector]**](Connectionsv3PartialConnector.md) | The list of connectors to update. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_partial_update_connectors_request import Connectionsv3PartialUpdateConnectorsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3PartialUpdateConnectorsRequest from a JSON string
connectionsv3_partial_update_connectors_request_instance = Connectionsv3PartialUpdateConnectorsRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3PartialUpdateConnectorsRequest.to_json())

# convert the object into a dict
connectionsv3_partial_update_connectors_request_dict = connectionsv3_partial_update_connectors_request_instance.to_dict()
# create an instance of Connectionsv3PartialUpdateConnectorsRequest from a dict
connectionsv3_partial_update_connectors_request_from_dict = Connectionsv3PartialUpdateConnectorsRequest.from_dict(connectionsv3_partial_update_connectors_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


