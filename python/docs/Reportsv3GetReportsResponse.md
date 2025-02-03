# Reportsv3GetReportsResponse

GetReportsResponse is the return type which encapsulates a list of reports from the GetReports() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**in_report_children_list** | **List[str]** | List of report ids of children that are children of in reports. | [optional] 
**reports_list** | [**List[Reportsv3BriefReport]**](Reportsv3BriefReport.md) | A new reports list. | [optional] 
**reports_tags** | [**List[Reportsv3ReportTag]**](Reportsv3ReportTag.md) | The Reports&#39; tags. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_get_reports_response import Reportsv3GetReportsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetReportsResponse from a JSON string
reportsv3_get_reports_response_instance = Reportsv3GetReportsResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetReportsResponse.to_json())

# convert the object into a dict
reportsv3_get_reports_response_dict = reportsv3_get_reports_response_instance.to_dict()
# create an instance of Reportsv3GetReportsResponse from a dict
reportsv3_get_reports_response_from_dict = Reportsv3GetReportsResponse.from_dict(reportsv3_get_reports_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


