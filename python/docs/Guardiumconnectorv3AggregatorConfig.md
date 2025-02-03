# Guardiumconnectorv3AggregatorConfig

Return the Aggregator configuration information from tenant database.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datamart_end_date_aggregator** | **str** | End date for Datamart export. | [optional] 
**datamart_start_date_aggregator** | **str** | Start date for Datamart export. | [optional] 
**host** | **str** | Hostname of Aggregator. | [optional] 
**unit_type** | **str** | Unit type. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_aggregator_config import Guardiumconnectorv3AggregatorConfig

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3AggregatorConfig from a JSON string
guardiumconnectorv3_aggregator_config_instance = Guardiumconnectorv3AggregatorConfig.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3AggregatorConfig.to_json())

# convert the object into a dict
guardiumconnectorv3_aggregator_config_dict = guardiumconnectorv3_aggregator_config_instance.to_dict()
# create an instance of Guardiumconnectorv3AggregatorConfig from a dict
guardiumconnectorv3_aggregator_config_from_dict = Guardiumconnectorv3AggregatorConfig.from_dict(guardiumconnectorv3_aggregator_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


