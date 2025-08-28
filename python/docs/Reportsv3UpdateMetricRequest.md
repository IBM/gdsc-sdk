# Reportsv3UpdateMetricRequest

UpdatemetricRequest is the argument type used to update a metric with the Updatemetric() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | [**Reportsv3Metric**](Reportsv3Metric.md) |  | [optional] 
**metric_id** | **int** | The id of the metric that was updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_metric_request import Reportsv3UpdateMetricRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateMetricRequest from a JSON string
reportsv3_update_metric_request_instance = Reportsv3UpdateMetricRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateMetricRequest.to_json())

# convert the object into a dict
reportsv3_update_metric_request_dict = reportsv3_update_metric_request_instance.to_dict()
# create an instance of Reportsv3UpdateMetricRequest from a dict
reportsv3_update_metric_request_from_dict = Reportsv3UpdateMetricRequest.from_dict(reportsv3_update_metric_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


