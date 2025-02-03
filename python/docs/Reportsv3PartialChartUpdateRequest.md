# Reportsv3PartialChartUpdateRequest

PartialChartUpdateRequest is the argument type used to update a chart  with partial information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_id** | **str** | Unique chart ID. | [optional] 
**chart_title** | **str** | The chart title. | [optional] 
**chart_type** | [**Reportsv3ChartType**](Reportsv3ChartType.md) |  | [optional] 
**update_mask** | [**ProtobufFieldMask**](ProtobufFieldMask.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_partial_chart_update_request import Reportsv3PartialChartUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3PartialChartUpdateRequest from a JSON string
reportsv3_partial_chart_update_request_instance = Reportsv3PartialChartUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3PartialChartUpdateRequest.to_json())

# convert the object into a dict
reportsv3_partial_chart_update_request_dict = reportsv3_partial_chart_update_request_instance.to_dict()
# create an instance of Reportsv3PartialChartUpdateRequest from a dict
reportsv3_partial_chart_update_request_from_dict = Reportsv3PartialChartUpdateRequest.from_dict(reportsv3_partial_chart_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


