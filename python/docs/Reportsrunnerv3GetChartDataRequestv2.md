# Reportsrunnerv3GetChartDataRequestv2

GetChartDataRequestv2 is the argument type used to run api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_id** | **str** | Optional: the ID of the chart we wish to get its data. | [optional] 
**chart_settings** | [**Reportsv3ChartSettingsv2**](Reportsv3ChartSettingsv2.md) |  | [optional] 
**model_type** | [**Reportsv3ModelType**](Reportsv3ModelType.md) |  | [optional] 
**report_definition** | [**Reportsv3ReportDefinition**](Reportsv3ReportDefinition.md) |  | [optional] 
**runtime_parameter_list** | [**List[Reportsv3RunTimeParameter]**](Reportsv3RunTimeParameter.md) | Runtime parameters. | [optional] 
**time_zone** | **str** | Optional: time zone. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_get_chart_data_requestv2 import Reportsrunnerv3GetChartDataRequestv2

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3GetChartDataRequestv2 from a JSON string
reportsrunnerv3_get_chart_data_requestv2_instance = Reportsrunnerv3GetChartDataRequestv2.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3GetChartDataRequestv2.to_json())

# convert the object into a dict
reportsrunnerv3_get_chart_data_requestv2_dict = reportsrunnerv3_get_chart_data_requestv2_instance.to_dict()
# create an instance of Reportsrunnerv3GetChartDataRequestv2 from a dict
reportsrunnerv3_get_chart_data_requestv2_from_dict = Reportsrunnerv3GetChartDataRequestv2.from_dict(reportsrunnerv3_get_chart_data_requestv2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


