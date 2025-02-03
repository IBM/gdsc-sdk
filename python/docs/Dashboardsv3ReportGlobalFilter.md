# Dashboardsv3ReportGlobalFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**case_insensitive** | **bool** |  | [optional] 
**filter_item_type** | **str** |  | [optional] 
**group_name** | **str** |  | [optional] 
**header_id** | **str** |  | [optional] 
**header_type** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**operator** | **str** |  | [optional] 
**operator_key** | **str** |  | [optional] 
**report_operator** | [**List[Dashboardsv3ReportOperator]**](Dashboardsv3ReportOperator.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.dashboardsv3_report_global_filter import Dashboardsv3ReportGlobalFilter

# TODO update the JSON string below
json = "{}"
# create an instance of Dashboardsv3ReportGlobalFilter from a JSON string
dashboardsv3_report_global_filter_instance = Dashboardsv3ReportGlobalFilter.from_json(json)
# print the JSON string representation of the object
print(Dashboardsv3ReportGlobalFilter.to_json())

# convert the object into a dict
dashboardsv3_report_global_filter_dict = dashboardsv3_report_global_filter_instance.to_dict()
# create an instance of Dashboardsv3ReportGlobalFilter from a dict
dashboardsv3_report_global_filter_from_dict = Dashboardsv3ReportGlobalFilter.from_dict(dashboardsv3_report_global_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


