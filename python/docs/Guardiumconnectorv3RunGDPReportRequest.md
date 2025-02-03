# Guardiumconnectorv3RunGDPReportRequest

Runs specified report.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | Central Manager ID. | [optional] 
**max_fetch_size** | **int** | Maximum number of rows to retrieve if not specified will retrieve the maximum number of rows allowed by GDP for CSV export can&#39;t be larger than the configured maximum number of rows for CSV export on specified central manager. | [optional] 
**report_name** | **str** | Name of the report. | [optional] 
**report_parameters** | [**List[Guardiumconnectorv3GDPReportParameter]**](Guardiumconnectorv3GDPReportParameter.md) | Report parameters. | [optional] 
**sort_column** | **str** | Column to sort on if not specified returns rows in default sort order of the report. | [optional] 
**sort_order** | [**RunGDPReportRequestSortOrder**](RunGDPReportRequestSortOrder.md) |  | [optional] 
**start_from** | **int** | Result row index to retrieve from if not specified returns results from the beginning. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_run_gdp_report_request import Guardiumconnectorv3RunGDPReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3RunGDPReportRequest from a JSON string
guardiumconnectorv3_run_gdp_report_request_instance = Guardiumconnectorv3RunGDPReportRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3RunGDPReportRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_run_gdp_report_request_dict = guardiumconnectorv3_run_gdp_report_request_instance.to_dict()
# create an instance of Guardiumconnectorv3RunGDPReportRequest from a dict
guardiumconnectorv3_run_gdp_report_request_from_dict = Guardiumconnectorv3RunGDPReportRequest.from_dict(guardiumconnectorv3_run_gdp_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


