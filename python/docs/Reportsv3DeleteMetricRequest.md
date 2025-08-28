# Reportsv3DeleteMetricRequest

DeletemetricRequest is the request for deleting a metric.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric_id** | **int** | The id of the metric to be deleted. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_delete_metric_request import Reportsv3DeleteMetricRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3DeleteMetricRequest from a JSON string
reportsv3_delete_metric_request_instance = Reportsv3DeleteMetricRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3DeleteMetricRequest.to_json())

# convert the object into a dict
reportsv3_delete_metric_request_dict = reportsv3_delete_metric_request_instance.to_dict()
# create an instance of Reportsv3DeleteMetricRequest from a dict
reportsv3_delete_metric_request_from_dict = Reportsv3DeleteMetricRequest.from_dict(reportsv3_delete_metric_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


