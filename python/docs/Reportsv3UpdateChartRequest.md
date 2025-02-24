# Reportsv3UpdateChartRequest

UpdateChartRequests is the argument type used to update a chart.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_id** | **str** | Unique chart ID. | [optional] 
**chart_settings** | [**Reportsv3ChartSettings**](Reportsv3ChartSettings.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_chart_request import Reportsv3UpdateChartRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateChartRequest from a JSON string
reportsv3_update_chart_request_instance = Reportsv3UpdateChartRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateChartRequest.to_json())

# convert the object into a dict
reportsv3_update_chart_request_dict = reportsv3_update_chart_request_instance.to_dict()
# create an instance of Reportsv3UpdateChartRequest from a dict
reportsv3_update_chart_request_from_dict = Reportsv3UpdateChartRequest.from_dict(reportsv3_update_chart_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


