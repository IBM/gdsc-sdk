# Reportsv3PartialChartUpdateResponse

PartialChartUpdateResponse containes the chart id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_id** | **str** | Unique Chart ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_partial_chart_update_response import Reportsv3PartialChartUpdateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3PartialChartUpdateResponse from a JSON string
reportsv3_partial_chart_update_response_instance = Reportsv3PartialChartUpdateResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3PartialChartUpdateResponse.to_json())

# convert the object into a dict
reportsv3_partial_chart_update_response_dict = reportsv3_partial_chart_update_response_instance.to_dict()
# create an instance of Reportsv3PartialChartUpdateResponse from a dict
reportsv3_partial_chart_update_response_from_dict = Reportsv3PartialChartUpdateResponse.from_dict(reportsv3_partial_chart_update_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


