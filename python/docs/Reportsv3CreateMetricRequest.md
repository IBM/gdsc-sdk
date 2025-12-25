# Reportsv3CreateMetricRequest

CreatemetricRequest is the argument type used to create a unique metric with the Createmetric() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | [**Reportsv3Metric**](Reportsv3Metric.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_create_metric_request import Reportsv3CreateMetricRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateMetricRequest from a JSON string
reportsv3_create_metric_request_instance = Reportsv3CreateMetricRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateMetricRequest.to_json())

# convert the object into a dict
reportsv3_create_metric_request_dict = reportsv3_create_metric_request_instance.to_dict()
# create an instance of Reportsv3CreateMetricRequest from a dict
reportsv3_create_metric_request_from_dict = Reportsv3CreateMetricRequest.from_dict(reportsv3_create_metric_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


