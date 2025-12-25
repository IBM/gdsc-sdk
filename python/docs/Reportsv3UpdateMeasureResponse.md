# Reportsv3UpdateMeasureResponse

UpdateMeasureResponse is the response after updating a measure using the UpdateMeasure() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**measure_id** | **int** | The id of the measure that was updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_measure_response import Reportsv3UpdateMeasureResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateMeasureResponse from a JSON string
reportsv3_update_measure_response_instance = Reportsv3UpdateMeasureResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateMeasureResponse.to_json())

# convert the object into a dict
reportsv3_update_measure_response_dict = reportsv3_update_measure_response_instance.to_dict()
# create an instance of Reportsv3UpdateMeasureResponse from a dict
reportsv3_update_measure_response_from_dict = Reportsv3UpdateMeasureResponse.from_dict(reportsv3_update_measure_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


