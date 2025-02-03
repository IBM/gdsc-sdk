# Connectionsv3GetConnectionsWithFiltersResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectors** | [**List[Connectionsv3Connector]**](Connectionsv3Connector.md) |  | [optional] 
**facets** | [**List[Connectionsv3ConnectorFilterHeader]**](Connectionsv3ConnectorFilterHeader.md) |  | [optional] 
**preset_stats** | [**List[Connectionsv3ConnectorSettingStat]**](Connectionsv3ConnectorSettingStat.md) |  | [optional] 
**total_connectors** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_get_connections_with_filters_response import Connectionsv3GetConnectionsWithFiltersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GetConnectionsWithFiltersResponse from a JSON string
connectionsv3_get_connections_with_filters_response_instance = Connectionsv3GetConnectionsWithFiltersResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GetConnectionsWithFiltersResponse.to_json())

# convert the object into a dict
connectionsv3_get_connections_with_filters_response_dict = connectionsv3_get_connections_with_filters_response_instance.to_dict()
# create an instance of Connectionsv3GetConnectionsWithFiltersResponse from a dict
connectionsv3_get_connections_with_filters_response_from_dict = Connectionsv3GetConnectionsWithFiltersResponse.from_dict(connectionsv3_get_connections_with_filters_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


