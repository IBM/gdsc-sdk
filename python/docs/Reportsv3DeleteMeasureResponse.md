# Reportsv3DeleteMeasureResponse

DeleteMeasureResponse is the response for deleting a measure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Success or error message. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_delete_measure_response import Reportsv3DeleteMeasureResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3DeleteMeasureResponse from a JSON string
reportsv3_delete_measure_response_instance = Reportsv3DeleteMeasureResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3DeleteMeasureResponse.to_json())

# convert the object into a dict
reportsv3_delete_measure_response_dict = reportsv3_delete_measure_response_instance.to_dict()
# create an instance of Reportsv3DeleteMeasureResponse from a dict
reportsv3_delete_measure_response_from_dict = Reportsv3DeleteMeasureResponse.from_dict(reportsv3_delete_measure_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


