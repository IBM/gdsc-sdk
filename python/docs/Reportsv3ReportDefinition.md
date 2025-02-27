# Reportsv3ReportDefinition

ReportDefinition encapsulates all data necessary for a report object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_id** | **str** | Unique category ID. | [optional] 
**creation_time** | **datetime** | The report&#39;s cration time in format YYYY-MM-DDTHH:mm:ss.sssZ. | [optional] 
**creator_user_id** | **str** | An identifier for the creator of the report. | [optional] 
**date_range** | [**Reportsv3DateRange**](Reportsv3DateRange.md) |  | [optional] 
**default_timestamp_header_id** | **str** | The default timestamp header id. | [optional] 
**is_auditable** | **bool** | If a report is auditable. | [optional] 
**is_hidden** | **bool** | The is hidden true when report should be showed to the user. | [optional] 
**is_pinned** | **bool** | Is pinned report. | [optional] 
**is_predefined** | **bool** | If a report is predefined. | [optional] 
**refresh_rate** | **int** | Report refresh rate. | [optional] 
**report_description** | **str** | Report description. | [optional] 
**report_filters** | [**Reportsv3ReportFilterBrackets**](Reportsv3ReportFilterBrackets.md) |  | [optional] 
**report_headers** | [**List[Reportsv3ReportHeader]**](Reportsv3ReportHeader.md) | Selected headers for the report. | [optional] 
**report_id** | **str** | The report ID. | [optional] 
**report_name** | **str** | Report name. | [optional] 
**report_tags** | [**List[Reportsv3ReportTag]**](Reportsv3ReportTag.md) | Report tags. | [optional] 
**runtime_parameters** | [**List[Reportsv3RunTimeParameter]**](Reportsv3RunTimeParameter.md) | Report runtime parameters. | [optional] 
**selected_timestamp_header_id** | **str** | The selected timestamp header id- in case the user override the default. | [optional] 
**should_add_count** | **bool** | Add \&quot;count\&quot; statement or not. | [optional] 
**should_add_distinct** | **bool** | Add \&quot;distinct\&quot; statement or not. | [optional] 
**sql_last_version** | **str** | SQL Last Version -  Last version of GI when the query was generated. | [optional] 
**table_join_optimization** | **str** | optional : table join optimization - optimized the join operation to enhance the performance. the value can be empty, false or true. if the value is empty then the global setting will be used. | [optional] 
**use_pipeline_queries** | **str** | Optional: disable or enable the pipeline queries the value can be empty, false or true. if the value is empty then the global setting will be used. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_report_definition import Reportsv3ReportDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ReportDefinition from a JSON string
reportsv3_report_definition_instance = Reportsv3ReportDefinition.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ReportDefinition.to_json())

# convert the object into a dict
reportsv3_report_definition_dict = reportsv3_report_definition_instance.to_dict()
# create an instance of Reportsv3ReportDefinition from a dict
reportsv3_report_definition_from_dict = Reportsv3ReportDefinition.from_dict(reportsv3_report_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


