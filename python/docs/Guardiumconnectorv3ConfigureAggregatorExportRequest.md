# Guardiumconnectorv3ConfigureAggregatorExportRequest

ConfigureAggExportRequest definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | Central Manager ID. | [optional] 
**datamart_end_date_aggregator** | **str** | End date for aggregator datamart export. | [optional] 
**datamart_start_date_aggregator** | **str** | Start date for aggregator datamart export. | [optional] 
**managed_units** | **List[str]** | List of managed units to which apply the dm export start/end dates. | [optional] 
**skip_historical_datamarts** | **bool** | Flag to either skip or include historical datamarts as part of configure streaming API. | [optional] 
**update_central_manager** | **bool** | Flag to update the cm record with date ranges. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_configure_aggregator_export_request import Guardiumconnectorv3ConfigureAggregatorExportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3ConfigureAggregatorExportRequest from a JSON string
guardiumconnectorv3_configure_aggregator_export_request_instance = Guardiumconnectorv3ConfigureAggregatorExportRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3ConfigureAggregatorExportRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_configure_aggregator_export_request_dict = guardiumconnectorv3_configure_aggregator_export_request_instance.to_dict()
# create an instance of Guardiumconnectorv3ConfigureAggregatorExportRequest from a dict
guardiumconnectorv3_configure_aggregator_export_request_from_dict = Guardiumconnectorv3ConfigureAggregatorExportRequest.from_dict(guardiumconnectorv3_configure_aggregator_export_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


