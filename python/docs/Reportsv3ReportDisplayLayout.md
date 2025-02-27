# Reportsv3ReportDisplayLayout

ReportDisplayLayout has report matadata , rows and headers.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_timestamp_header_id** | **str** | The default timestamp header id. | [optional] 
**fetch_size** | **int** | Report data fetch size. | [optional] 
**in_report_additional_parameter** | [**List[Reportsv3InReportAdditionalParameter]**](Reportsv3InReportAdditionalParameter.md) | Additional Parameters for in report. | [optional] 
**is_auditable** | **bool** | If a report is auditable. | [optional] 
**is_predefined** | **bool** | Is predefined report. | [optional] 
**number_of_events** | **str** | Total count of the report results. | [optional] 
**offset** | **int** | Report data offset. | [optional] 
**refresh_rate** | **int** | Report refresh rate. | [optional] 
**report_description** | **str** | Report description. | [optional] 
**report_headers** | [**List[Reportsv3DisplayHeader]**](Reportsv3DisplayHeader.md) | The report headers. | [optional] 
**report_id** | **str** | The report ID. | [optional] 
**report_name** | **str** | Report name. | [optional] 
**report_tags** | [**List[Reportsv3ReportTag]**](Reportsv3ReportTag.md) | Report tags. | [optional] 
**runtime_param_list** | [**List[Reportsv3RunTimeParameter]**](Reportsv3RunTimeParameter.md) | Runtime Parameter list. | [optional] 
**selected_timestamp_header_id** | **str** | The selected timestamp header id- in case the user override the default. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_report_display_layout import Reportsv3ReportDisplayLayout

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ReportDisplayLayout from a JSON string
reportsv3_report_display_layout_instance = Reportsv3ReportDisplayLayout.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ReportDisplayLayout.to_json())

# convert the object into a dict
reportsv3_report_display_layout_dict = reportsv3_report_display_layout_instance.to_dict()
# create an instance of Reportsv3ReportDisplayLayout from a dict
reportsv3_report_display_layout_from_dict = Reportsv3ReportDisplayLayout.from_dict(reportsv3_report_display_layout_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


