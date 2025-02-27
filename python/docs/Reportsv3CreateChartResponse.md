# Reportsv3CreateChartResponse

CreateChartResponse containes the chart id of the newly created chart.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_id** | **str** | Unique chart ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_create_chart_response import Reportsv3CreateChartResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateChartResponse from a JSON string
reportsv3_create_chart_response_instance = Reportsv3CreateChartResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateChartResponse.to_json())

# convert the object into a dict
reportsv3_create_chart_response_dict = reportsv3_create_chart_response_instance.to_dict()
# create an instance of Reportsv3CreateChartResponse from a dict
reportsv3_create_chart_response_from_dict = Reportsv3CreateChartResponse.from_dict(reportsv3_create_chart_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


