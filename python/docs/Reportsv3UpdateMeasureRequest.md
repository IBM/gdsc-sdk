# Reportsv3UpdateMeasureRequest

UpdateMeasureRequest is the argument type used to update a measure with the UpdateMeasure() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**measure** | [**Reportsv3Measure**](Reportsv3Measure.md) |  | [optional] 
**measure_id** | **int** | The id of the measure that was updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_measure_request import Reportsv3UpdateMeasureRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateMeasureRequest from a JSON string
reportsv3_update_measure_request_instance = Reportsv3UpdateMeasureRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateMeasureRequest.to_json())

# convert the object into a dict
reportsv3_update_measure_request_dict = reportsv3_update_measure_request_instance.to_dict()
# create an instance of Reportsv3UpdateMeasureRequest from a dict
reportsv3_update_measure_request_from_dict = Reportsv3UpdateMeasureRequest.from_dict(reportsv3_update_measure_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


