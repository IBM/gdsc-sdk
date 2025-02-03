# Connectionsv3InternalSearchConnectionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **int** |  | [optional] 
**connectors** | [**List[Connectionsv3Connector]**](Connectionsv3Connector.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_internal_search_connection_response import Connectionsv3InternalSearchConnectionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3InternalSearchConnectionResponse from a JSON string
connectionsv3_internal_search_connection_response_instance = Connectionsv3InternalSearchConnectionResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3InternalSearchConnectionResponse.to_json())

# convert the object into a dict
connectionsv3_internal_search_connection_response_dict = connectionsv3_internal_search_connection_response_instance.to_dict()
# create an instance of Connectionsv3InternalSearchConnectionResponse from a dict
connectionsv3_internal_search_connection_response_from_dict = Connectionsv3InternalSearchConnectionResponse.from_dict(connectionsv3_internal_search_connection_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


