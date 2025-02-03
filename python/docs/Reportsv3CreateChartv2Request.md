# Reportsv3CreateChartv2Request

CreateChartv2Request is the argument for the CreateChartv2() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_settings_v2** | [**Reportsv3ChartSettingsv2**](Reportsv3ChartSettingsv2.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_create_chartv2_request import Reportsv3CreateChartv2Request

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateChartv2Request from a JSON string
reportsv3_create_chartv2_request_instance = Reportsv3CreateChartv2Request.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateChartv2Request.to_json())

# convert the object into a dict
reportsv3_create_chartv2_request_dict = reportsv3_create_chartv2_request_instance.to_dict()
# create an instance of Reportsv3CreateChartv2Request from a dict
reportsv3_create_chartv2_request_from_dict = Reportsv3CreateChartv2Request.from_dict(reportsv3_create_chartv2_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


