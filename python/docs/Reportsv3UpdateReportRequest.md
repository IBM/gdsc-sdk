# Reportsv3UpdateReportRequest

UpdateReportRequest is the argument type used to update a report using the UpdateReport() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_settings** | [**Reportsv3ChartSettings**](Reportsv3ChartSettings.md) |  | [optional] 
**report_definition** | [**Reportsv3ReportDefinition**](Reportsv3ReportDefinition.md) |  | [optional] 
**report_id** | **str** | Unique Report ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_report_request import Reportsv3UpdateReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateReportRequest from a JSON string
reportsv3_update_report_request_instance = Reportsv3UpdateReportRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateReportRequest.to_json())

# convert the object into a dict
reportsv3_update_report_request_dict = reportsv3_update_report_request_instance.to_dict()
# create an instance of Reportsv3UpdateReportRequest from a dict
reportsv3_update_report_request_from_dict = Reportsv3UpdateReportRequest.from_dict(reportsv3_update_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


