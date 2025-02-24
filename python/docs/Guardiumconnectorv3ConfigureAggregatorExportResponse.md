# Guardiumconnectorv3ConfigureAggregatorExportResponse

ConfigureAggScheduleResponse Response message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_configure_aggregator_export_response import Guardiumconnectorv3ConfigureAggregatorExportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3ConfigureAggregatorExportResponse from a JSON string
guardiumconnectorv3_configure_aggregator_export_response_instance = Guardiumconnectorv3ConfigureAggregatorExportResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3ConfigureAggregatorExportResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_configure_aggregator_export_response_dict = guardiumconnectorv3_configure_aggregator_export_response_instance.to_dict()
# create an instance of Guardiumconnectorv3ConfigureAggregatorExportResponse from a dict
guardiumconnectorv3_configure_aggregator_export_response_from_dict = Guardiumconnectorv3ConfigureAggregatorExportResponse.from_dict(guardiumconnectorv3_configure_aggregator_export_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


