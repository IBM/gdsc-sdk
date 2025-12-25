# Connectionsv3GetConnectionsWithFiltersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculate_facets** | **bool** | Whether or not to calculate facets. | [optional] 
**calculate_preset_stats** | **bool** | Whether or not to calculate preset stats. | [optional] 
**calculate_total** | **bool** | Whether or not to calculate total. | [optional] 
**fetch_size** | **int** | The max amount of rows to return for pagination. | [optional] 
**filters** | [**List[Connectionsv3HeaderFilter]**](Connectionsv3HeaderFilter.md) | The filters to apply. | [optional] 
**headers** | **List[str]** | The headers used. | [optional] 
**offset** | **int** | The amount to offset the rows by for pagination. | [optional] 
**order** | [**Connectionsv3OrderType**](Connectionsv3OrderType.md) |  | [optional] [default to Connectionsv3OrderType.NONE]
**search** | **str** | The text to search. | [optional] 
**sort_by** | **str** | The header key used for sorting. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_get_connections_with_filters_request import Connectionsv3GetConnectionsWithFiltersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GetConnectionsWithFiltersRequest from a JSON string
connectionsv3_get_connections_with_filters_request_instance = Connectionsv3GetConnectionsWithFiltersRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GetConnectionsWithFiltersRequest.to_json())

# convert the object into a dict
connectionsv3_get_connections_with_filters_request_dict = connectionsv3_get_connections_with_filters_request_instance.to_dict()
# create an instance of Connectionsv3GetConnectionsWithFiltersRequest from a dict
connectionsv3_get_connections_with_filters_request_from_dict = Connectionsv3GetConnectionsWithFiltersRequest.from_dict(connectionsv3_get_connections_with_filters_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


