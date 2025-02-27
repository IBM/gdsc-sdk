# Reportsv3GetQueryByReportIDRequest

GetQueryByReportIDRequest is the argument of the GetQueryByReportID() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**add_group_literal** | **str** |  | [optional] 
**add_job_id_literal** | **str** |  | [optional] 
**date_range** | [**Reportsv3DateRange**](Reportsv3DateRange.md) |  | [optional] 
**default_chart_expanded** | **bool** | Optional: if report has chart -send  default_chart_expanded be saved in user settings collection per report and user. | [optional] 
**exclude_group_id** | **str** |  | [optional] 
**facet_selected_header** | [**Reportsv3ReportHeader**](Reportsv3ReportHeader.md) |  | [optional] 
**filter_for_job_id** | **str** |  | [optional] 
**job_type** | [**Reportsv3JobType**](Reportsv3JobType.md) |  | [optional] 
**model_types** | [**List[Reportsv3ModelType]**](Reportsv3ModelType.md) |  | [optional] 
**report_id** | **str** | The id of the Report we wish to run. | [optional] 
**sql_type** | [**Reportsv3SqlType**](Reportsv3SqlType.md) |  | [optional] 
**table_join_optimization** | **bool** | Optional: disable or enable the table join optimization. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_query_by_report_id_request import Reportsv3GetQueryByReportIDRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetQueryByReportIDRequest from a JSON string
reportsv3_get_query_by_report_id_request_instance = Reportsv3GetQueryByReportIDRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetQueryByReportIDRequest.to_json())

# convert the object into a dict
reportsv3_get_query_by_report_id_request_dict = reportsv3_get_query_by_report_id_request_instance.to_dict()
# create an instance of Reportsv3GetQueryByReportIDRequest from a dict
reportsv3_get_query_by_report_id_request_from_dict = Reportsv3GetQueryByReportIDRequest.from_dict(reportsv3_get_query_by_report_id_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


