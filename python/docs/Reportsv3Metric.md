# Reportsv3Metric


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**column** | [**Reportsv3MetricsColumn**](Reportsv3MetricsColumn.md) |  | [optional] 
**measure_id** | **int** |  | [optional] 
**measure_type** | [**Reportsv3MeasureType**](Reportsv3MeasureType.md) |  | [optional] 
**metric_id** | **int** |  | [optional] 
**metric_type** | [**Reportsv3MetricType**](Reportsv3MetricType.md) |  | [optional] 
**report_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_metric import Reportsv3Metric

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3Metric from a JSON string
reportsv3_metric_instance = Reportsv3Metric.from_json(json)
# print the JSON string representation of the object
print(Reportsv3Metric.to_json())

# convert the object into a dict
reportsv3_metric_dict = reportsv3_metric_instance.to_dict()
# create an instance of Reportsv3Metric from a dict
reportsv3_metric_from_dict = Reportsv3Metric.from_dict(reportsv3_metric_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


