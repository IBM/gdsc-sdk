# Reportsv3ChartSettingsv2

ChartSettingsv2 encapsulates all data necessary for a VEGA chart object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_sequence_numbers** | **List[int]** | Sequence numbers for the categories. | [optional] 
**chart_id** | **str** | The chart ID. | [optional] 
**chart_title** | **str** | The chart title. | [optional] 
**creation_time** | **datetime** | The creation time of the chart. | [optional] 
**creator_user_id** | **str** | The ID of the creator of the chart. | [optional] 
**default_chart_expanded** | **bool** | Indicates if the default chart is expanded. | [optional] 
**is_default_chart** | **bool** | Indicates if the chart is the default chart. | [optional] 
**is_predefined** | **bool** | Indicates if the chart is predefined. | [optional] 
**measure_sequence_numbers** | **List[int]** | Sequence numbers for the measures. | [optional] 
**refresh_rate** | **int** | Chart refresh rate. | [optional] 
**report_id** | **str** | The ID of the report connected to the chart. | [optional] 
**vega_definition** | **str** | The VEGA chart definition in a stringified JSON. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_chart_settingsv2 import Reportsv3ChartSettingsv2

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ChartSettingsv2 from a JSON string
reportsv3_chart_settingsv2_instance = Reportsv3ChartSettingsv2.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ChartSettingsv2.to_json())

# convert the object into a dict
reportsv3_chart_settingsv2_dict = reportsv3_chart_settingsv2_instance.to_dict()
# create an instance of Reportsv3ChartSettingsv2 from a dict
reportsv3_chart_settingsv2_from_dict = Reportsv3ChartSettingsv2.from_dict(reportsv3_chart_settingsv2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


