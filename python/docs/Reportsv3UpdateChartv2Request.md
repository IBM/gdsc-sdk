# Reportsv3UpdateChartv2Request

UpdateChartv2Request is the argument type used to update a VEGA chart.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_id** | **str** | Unique chart ID. | [optional] 
**chart_settings_v2** | [**Reportsv3ChartSettingsv2**](Reportsv3ChartSettingsv2.md) |  | [optional] 
**primary_category** | **int** |  | [optional] 
**primary_measure** | **int** |  | [optional] 
**secondary_category** | **int** |  | [optional] 
**secondary_measure** | **int** |  | [optional] 
**tertiary_category** | **int** |  | [optional] 
**tertiary_measure** | **int** |  | [optional] 
**vega_definition** | **str** | The VEGA chart definition in a stringified JSON. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_update_chartv2_request import Reportsv3UpdateChartv2Request

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateChartv2Request from a JSON string
reportsv3_update_chartv2_request_instance = Reportsv3UpdateChartv2Request.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateChartv2Request.to_json())

# convert the object into a dict
reportsv3_update_chartv2_request_dict = reportsv3_update_chartv2_request_instance.to_dict()
# create an instance of Reportsv3UpdateChartv2Request from a dict
reportsv3_update_chartv2_request_from_dict = Reportsv3UpdateChartv2Request.from_dict(reportsv3_update_chartv2_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


