# Reportsv3Measure


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**column** | [**Reportsv3MetricsColumn**](Reportsv3MetricsColumn.md) |  | [optional] 
**measure_id** | **int** |  | [optional] 
**report_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_measure import Reportsv3Measure

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3Measure from a JSON string
reportsv3_measure_instance = Reportsv3Measure.from_json(json)
# print the JSON string representation of the object
print(Reportsv3Measure.to_json())

# convert the object into a dict
reportsv3_measure_dict = reportsv3_measure_instance.to_dict()
# create an instance of Reportsv3Measure from a dict
reportsv3_measure_from_dict = Reportsv3Measure.from_dict(reportsv3_measure_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


