# Guardiumconnectorv3GetAggregatorsConfigResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**managed_units_config** | [**List[Guardiumconnectorv3AggregatorConfig]**](Guardiumconnectorv3AggregatorConfig.md) | List of aggregator configurations from tenant database. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_get_aggregators_config_response import Guardiumconnectorv3GetAggregatorsConfigResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetAggregatorsConfigResponse from a JSON string
guardiumconnectorv3_get_aggregators_config_response_instance = Guardiumconnectorv3GetAggregatorsConfigResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetAggregatorsConfigResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_aggregators_config_response_dict = guardiumconnectorv3_get_aggregators_config_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetAggregatorsConfigResponse from a dict
guardiumconnectorv3_get_aggregators_config_response_from_dict = Guardiumconnectorv3GetAggregatorsConfigResponse.from_dict(guardiumconnectorv3_get_aggregators_config_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


