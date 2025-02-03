# Reportsv3ChartSettings

ChartSettings encapsulates all data necessary for a chart object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_id** | **str** | The chart id. | [optional] 
**chart_title** | **str** | The chart title. | [optional] 
**chart_type** | [**Reportsv3ChartType**](Reportsv3ChartType.md) |  | [optional] 
**creation_time** | **datetime** | The chart&#39;s cration time in format YYYY-MM-DDTHH:mm:ss.sssZ. | [optional] 
**creator_user_id** | **str** | An identifier for the creator of the chart. | [optional] 
**dataset_header_id** | **str** | Header id for the dataset values. | [optional] 
**dataset_max_values** | **int** | Chart dataset max values. | [optional] 
**default_chart_expanded** | **bool** | The default_chart_expanded is a flag taken from the user settings collection per report and user. | [optional] 
**is_default_chart** | **bool** | If true - this chart will be shown with the report. | [optional] 
**is_predefined** | **bool** | If a chart is predefined. | [optional] 
**refresh_rate** | **int** | Chart refresh rate. | [optional] 
**report_id** | **str** | The report id that the chart connected to. | [optional] 
**xaxis_header_id** | **str** | Header id for the x-axis values. | [optional] 
**xaxis_max_values** | **int** | Chart xaxis max values. | [optional] 
**yaxis_header_id** | **str** | Header id for the y-axis values. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_chart_settings import Reportsv3ChartSettings

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ChartSettings from a JSON string
reportsv3_chart_settings_instance = Reportsv3ChartSettings.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ChartSettings.to_json())

# convert the object into a dict
reportsv3_chart_settings_dict = reportsv3_chart_settings_instance.to_dict()
# create an instance of Reportsv3ChartSettings from a dict
reportsv3_chart_settings_from_dict = Reportsv3ChartSettings.from_dict(reportsv3_chart_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


