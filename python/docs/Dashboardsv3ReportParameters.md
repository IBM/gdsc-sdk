# Dashboardsv3ReportParameters

ReportParameters - distinguishing features of a report card.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end** | **str** | End. | [optional] 
**group_ids** | **List[int]** |  | [optional] 
**id** | **str** | Parameters id. | [optional] 
**local_time_filter** | [**Dashboardsv3TimeRange**](Dashboardsv3TimeRange.md) |  | [optional] 
**menu_item** | **str** | Menu Item. | [optional] 
**override** | **bool** | Use local parameters instead of global. | [optional] 
**range** | **str** | Time range - Time range is no longer used. | [optional] 
**regulation** | **str** | Regulation for isDataSecurity. | [optional] 
**start** | **str** | Start. | [optional] 
**tags** | [**List[Reportsv3ReportTag]**](Reportsv3ReportTag.md) | Report tags. | [optional] 
**title** | **str** | Optional title of card. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.dashboardsv3_report_parameters import Dashboardsv3ReportParameters

# TODO update the JSON string below
json = "{}"
# create an instance of Dashboardsv3ReportParameters from a JSON string
dashboardsv3_report_parameters_instance = Dashboardsv3ReportParameters.from_json(json)
# print the JSON string representation of the object
print(Dashboardsv3ReportParameters.to_json())

# convert the object into a dict
dashboardsv3_report_parameters_dict = dashboardsv3_report_parameters_instance.to_dict()
# create an instance of Dashboardsv3ReportParameters from a dict
dashboardsv3_report_parameters_from_dict = Dashboardsv3ReportParameters.from_dict(dashboardsv3_report_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


