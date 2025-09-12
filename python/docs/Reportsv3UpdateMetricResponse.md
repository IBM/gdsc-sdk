# Reportsv3UpdateMetricResponse

UpdatemetricResponse is the response after updating a metric using the Updatemetric() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric_id** | **int** | The id of the metric that was updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_metric_response import Reportsv3UpdateMetricResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateMetricResponse from a JSON string
reportsv3_update_metric_response_instance = Reportsv3UpdateMetricResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateMetricResponse.to_json())

# convert the object into a dict
reportsv3_update_metric_response_dict = reportsv3_update_metric_response_instance.to_dict()
# create an instance of Reportsv3UpdateMetricResponse from a dict
reportsv3_update_metric_response_from_dict = Reportsv3UpdateMetricResponse.from_dict(reportsv3_update_metric_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


