# Guardiumconnectorv3CollectorConfig

Collector configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datamart_start_date_collector** | **str** | Datamart start date. | [optional] 
**host** | **str** | Hostname of collector. | [optional] 
**unit_type** | **str** | Unit type. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_collector_config import Guardiumconnectorv3CollectorConfig

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3CollectorConfig from a JSON string
guardiumconnectorv3_collector_config_instance = Guardiumconnectorv3CollectorConfig.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3CollectorConfig.to_json())

# convert the object into a dict
guardiumconnectorv3_collector_config_dict = guardiumconnectorv3_collector_config_instance.to_dict()
# create an instance of Guardiumconnectorv3CollectorConfig from a dict
guardiumconnectorv3_collector_config_from_dict = Guardiumconnectorv3CollectorConfig.from_dict(guardiumconnectorv3_collector_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


