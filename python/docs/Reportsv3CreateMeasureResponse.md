# Reportsv3CreateMeasureResponse

CreateMeasureResponse is the response after creating a measure using the CreateMeasure() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**measure_id** | **int** | Unique measure ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_create_measure_response import Reportsv3CreateMeasureResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateMeasureResponse from a JSON string
reportsv3_create_measure_response_instance = Reportsv3CreateMeasureResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateMeasureResponse.to_json())

# convert the object into a dict
reportsv3_create_measure_response_dict = reportsv3_create_measure_response_instance.to_dict()
# create an instance of Reportsv3CreateMeasureResponse from a dict
reportsv3_create_measure_response_from_dict = Reportsv3CreateMeasureResponse.from_dict(reportsv3_create_measure_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


