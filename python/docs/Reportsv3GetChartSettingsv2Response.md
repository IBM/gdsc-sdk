# Reportsv3GetChartSettingsv2Response

GetChartSettingsv2Response is the return type which encapsulates a VEGA chart settings from the GetChartSettingsv2() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_settings** | [**List[Reportsv3ChartSettingsv2]**](Reportsv3ChartSettingsv2.md) | A new VEGA chart definition. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_chart_settingsv2_response import Reportsv3GetChartSettingsv2Response

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetChartSettingsv2Response from a JSON string
reportsv3_get_chart_settingsv2_response_instance = Reportsv3GetChartSettingsv2Response.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetChartSettingsv2Response.to_json())

# convert the object into a dict
reportsv3_get_chart_settingsv2_response_dict = reportsv3_get_chart_settingsv2_response_instance.to_dict()
# create an instance of Reportsv3GetChartSettingsv2Response from a dict
reportsv3_get_chart_settingsv2_response_from_dict = Reportsv3GetChartSettingsv2Response.from_dict(reportsv3_get_chart_settingsv2_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


