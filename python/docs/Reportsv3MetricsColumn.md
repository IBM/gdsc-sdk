# Reportsv3MetricsColumn


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation_type** | [**Reportsv3AggregationType**](Reportsv3AggregationType.md) |  | [optional] 
**header_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_metrics_column import Reportsv3MetricsColumn

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3MetricsColumn from a JSON string
reportsv3_metrics_column_instance = Reportsv3MetricsColumn.from_json(json)
# print the JSON string representation of the object
print(Reportsv3MetricsColumn.to_json())

# convert the object into a dict
reportsv3_metrics_column_dict = reportsv3_metrics_column_instance.to_dict()
# create an instance of Reportsv3MetricsColumn from a dict
reportsv3_metrics_column_from_dict = Reportsv3MetricsColumn.from_dict(reportsv3_metrics_column_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


