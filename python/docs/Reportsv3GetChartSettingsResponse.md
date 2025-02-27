# Reportsv3GetChartSettingsResponse

GetChartSettingsResponse is the return type which encapsulates a chart settings from the GetChartSettings() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_settings** | [**List[Reportsv3ChartSettings]**](Reportsv3ChartSettings.md) | A new report definition. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_chart_settings_response import Reportsv3GetChartSettingsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetChartSettingsResponse from a JSON string
reportsv3_get_chart_settings_response_instance = Reportsv3GetChartSettingsResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetChartSettingsResponse.to_json())

# convert the object into a dict
reportsv3_get_chart_settings_response_dict = reportsv3_get_chart_settings_response_instance.to_dict()
# create an instance of Reportsv3GetChartSettingsResponse from a dict
reportsv3_get_chart_settings_response_from_dict = Reportsv3GetChartSettingsResponse.from_dict(reportsv3_get_chart_settings_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


