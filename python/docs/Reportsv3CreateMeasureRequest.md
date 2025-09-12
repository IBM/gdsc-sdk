# Reportsv3CreateMeasureRequest

CreateMeasureRequest is the argument type used to create a unique measure with the CreateMeasure() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**measure** | [**Reportsv3Measure**](Reportsv3Measure.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_create_measure_request import Reportsv3CreateMeasureRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateMeasureRequest from a JSON string
reportsv3_create_measure_request_instance = Reportsv3CreateMeasureRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateMeasureRequest.to_json())

# convert the object into a dict
reportsv3_create_measure_request_dict = reportsv3_create_measure_request_instance.to_dict()
# create an instance of Reportsv3CreateMeasureRequest from a dict
reportsv3_create_measure_request_from_dict = Reportsv3CreateMeasureRequest.from_dict(reportsv3_create_measure_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


