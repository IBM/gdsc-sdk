# Reportsrunnerv3GetReportDataCountRequest

GetReportDataCountRequest is the argument get count.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_range** | [**Reportsv3DateRange**](Reportsv3DateRange.md) |  | [optional] 
**model_type** | [**Reportsv3ModelType**](Reportsv3ModelType.md) |  | [optional] 
**report_definition** | [**Reportsv3ReportDefinition**](Reportsv3ReportDefinition.md) |  | [optional] 
**report_id** | **str** | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). | [optional] 
**runtime_parameter_list** | [**List[Reportsv3RunTimeParameter]**](Reportsv3RunTimeParameter.md) | List of runtime parameter if needed. | [optional] 
**time_zone** | **str** | Optional: time zone. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_get_report_data_count_request import Reportsrunnerv3GetReportDataCountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3GetReportDataCountRequest from a JSON string
reportsrunnerv3_get_report_data_count_request_instance = Reportsrunnerv3GetReportDataCountRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3GetReportDataCountRequest.to_json())

# convert the object into a dict
reportsrunnerv3_get_report_data_count_request_dict = reportsrunnerv3_get_report_data_count_request_instance.to_dict()
# create an instance of Reportsrunnerv3GetReportDataCountRequest from a dict
reportsrunnerv3_get_report_data_count_request_from_dict = Reportsrunnerv3GetReportDataCountRequest.from_dict(reportsrunnerv3_get_report_data_count_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


