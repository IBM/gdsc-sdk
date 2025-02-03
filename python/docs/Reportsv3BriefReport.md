# Reportsv3BriefReport

BriefReport - a small-scale representation of a report.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_level** | **int** | Calculated access-level. | [optional] 
**category_id** | **str** | The report&#39;s category ID. | [optional] 
**creator_user_id** | **str** | Author. | [optional] 
**creator_user_name** | **str** | Author name. | [optional] 
**group_ids_used_in_filter** | **List[str]** |  | [optional] 
**headers** | [**List[Reportsv3DisplayHeader]**](Reportsv3DisplayHeader.md) | The report&#39;s brief headers. | [optional] 
**is_pinned** | **bool** | Flag to determine weather the report is pinned or not. | [optional] 
**last_run_time** | **datetime** | The report&#39;s last run time in format YYYY-MM-DDTHH:mm:ss.sssZ. | [optional] 
**report_description** | **str** | The report description. | [optional] 
**report_id** | **str** | The report ID. | [optional] 
**report_name** | **str** | The report name. | [optional] 
**report_tags** | [**List[Reportsv3ReportTag]**](Reportsv3ReportTag.md) | The report tags. | [optional] 
**table_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_brief_report import Reportsv3BriefReport

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3BriefReport from a JSON string
reportsv3_brief_report_instance = Reportsv3BriefReport.from_json(json)
# print the JSON string representation of the object
print(Reportsv3BriefReport.to_json())

# convert the object into a dict
reportsv3_brief_report_dict = reportsv3_brief_report_instance.to_dict()
# create an instance of Reportsv3BriefReport from a dict
reportsv3_brief_report_from_dict = Reportsv3BriefReport.from_dict(reportsv3_brief_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


