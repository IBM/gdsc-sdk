# ReportGroupsReport

Report gives report information for the report using the group ID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_id** | **str** | The id of the Report. | [optional] 
**report_name** | **str** | The name of the Report. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.report_groups_report import ReportGroupsReport

# TODO update the JSON string below
json = "{}"
# create an instance of ReportGroupsReport from a JSON string
report_groups_report_instance = ReportGroupsReport.from_json(json)
# print the JSON string representation of the object
print(ReportGroupsReport.to_json())

# convert the object into a dict
report_groups_report_dict = report_groups_report_instance.to_dict()
# create an instance of ReportGroupsReport from a dict
report_groups_report_from_dict = ReportGroupsReport.from_dict(report_groups_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


