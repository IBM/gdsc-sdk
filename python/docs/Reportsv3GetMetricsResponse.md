# Reportsv3GetMetricsResponse

GetMetricsResponse is the return type which encapsulates a list of metrics from the GetMetrics() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metrics_list** | [**List[Reportsv3Metric]**](Reportsv3Metric.md) | List of Metrics. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_metrics_response import Reportsv3GetMetricsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetMetricsResponse from a JSON string
reportsv3_get_metrics_response_instance = Reportsv3GetMetricsResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetMetricsResponse.to_json())

# convert the object into a dict
reportsv3_get_metrics_response_dict = reportsv3_get_metrics_response_instance.to_dict()
# create an instance of Reportsv3GetMetricsResponse from a dict
reportsv3_get_metrics_response_from_dict = Reportsv3GetMetricsResponse.from_dict(reportsv3_get_metrics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


