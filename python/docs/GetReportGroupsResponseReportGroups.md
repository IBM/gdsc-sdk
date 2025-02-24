# GetReportGroupsResponseReportGroups

ReportGroups contains the group ID and the reports used by that group ID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_id** | **str** | The group ID that is being used by the reports. | [optional] 
**reports** | [**List[ReportGroupsReport]**](ReportGroupsReport.md) | A list of reports being used by the groupID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.get_report_groups_response_report_groups import GetReportGroupsResponseReportGroups

# TODO update the JSON string below
json = "{}"
# create an instance of GetReportGroupsResponseReportGroups from a JSON string
get_report_groups_response_report_groups_instance = GetReportGroupsResponseReportGroups.from_json(json)
# print the JSON string representation of the object
print(GetReportGroupsResponseReportGroups.to_json())

# convert the object into a dict
get_report_groups_response_report_groups_dict = get_report_groups_response_report_groups_instance.to_dict()
# create an instance of GetReportGroupsResponseReportGroups from a dict
get_report_groups_response_report_groups_from_dict = GetReportGroupsResponseReportGroups.from_dict(get_report_groups_response_report_groups_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


