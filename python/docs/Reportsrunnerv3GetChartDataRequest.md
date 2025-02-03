# Reportsrunnerv3GetChartDataRequest

GetChartDataRequest is the argument of GetChartData API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_id** | **str** | Optional: the ID of the chart we wish to get its data. | [optional] 
**chart_settings** | [**Reportsv3ChartSettings**](Reportsv3ChartSettings.md) |  | [optional] 
**model_type** | [**Reportsv3ModelType**](Reportsv3ModelType.md) |  | [optional] 
**report_definition** | [**Reportsv3ReportDefinition**](Reportsv3ReportDefinition.md) |  | [optional] 
**runtime_parameter_list** | [**List[Reportsv3RunTimeParameter]**](Reportsv3RunTimeParameter.md) | Runtime parameters. | [optional] 
**time_zone** | **str** | Optional: time zone. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_get_chart_data_request import Reportsrunnerv3GetChartDataRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3GetChartDataRequest from a JSON string
reportsrunnerv3_get_chart_data_request_instance = Reportsrunnerv3GetChartDataRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3GetChartDataRequest.to_json())

# convert the object into a dict
reportsrunnerv3_get_chart_data_request_dict = reportsrunnerv3_get_chart_data_request_instance.to_dict()
# create an instance of Reportsrunnerv3GetChartDataRequest from a dict
reportsrunnerv3_get_chart_data_request_from_dict = Reportsrunnerv3GetChartDataRequest.from_dict(reportsrunnerv3_get_chart_data_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


