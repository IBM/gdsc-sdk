# Guardiumconnectorv3ConfigureCollectorExportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | Central Manager ID. | [optional] 
**collectors** | **List[str]** | List of collectors. | [optional] 
**start_date** | **str** | Start date for export. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_configure_collector_export_request import Guardiumconnectorv3ConfigureCollectorExportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3ConfigureCollectorExportRequest from a JSON string
guardiumconnectorv3_configure_collector_export_request_instance = Guardiumconnectorv3ConfigureCollectorExportRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3ConfigureCollectorExportRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_configure_collector_export_request_dict = guardiumconnectorv3_configure_collector_export_request_instance.to_dict()
# create an instance of Guardiumconnectorv3ConfigureCollectorExportRequest from a dict
guardiumconnectorv3_configure_collector_export_request_from_dict = Guardiumconnectorv3ConfigureCollectorExportRequest.from_dict(guardiumconnectorv3_configure_collector_export_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


