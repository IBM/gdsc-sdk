# Reportsv3CreateChartv2Response

CreateChartv2Response contains the chart id of the newly created VEGA chart.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_id** | **str** | Unique chart ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_create_chartv2_response import Reportsv3CreateChartv2Response

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateChartv2Response from a JSON string
reportsv3_create_chartv2_response_instance = Reportsv3CreateChartv2Response.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateChartv2Response.to_json())

# convert the object into a dict
reportsv3_create_chartv2_response_dict = reportsv3_create_chartv2_response_instance.to_dict()
# create an instance of Reportsv3CreateChartv2Response from a dict
reportsv3_create_chartv2_response_from_dict = Reportsv3CreateChartv2Response.from_dict(reportsv3_create_chartv2_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


