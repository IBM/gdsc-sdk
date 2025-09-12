# Reportsv3DeleteMeasureRequest

DeleteMeasureRequest is the request for deleting a measure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**measure_id** | **int** | The id of the measure to be deleted. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_delete_measure_request import Reportsv3DeleteMeasureRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3DeleteMeasureRequest from a JSON string
reportsv3_delete_measure_request_instance = Reportsv3DeleteMeasureRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3DeleteMeasureRequest.to_json())

# convert the object into a dict
reportsv3_delete_measure_request_dict = reportsv3_delete_measure_request_instance.to_dict()
# create an instance of Reportsv3DeleteMeasureRequest from a dict
reportsv3_delete_measure_request_from_dict = Reportsv3DeleteMeasureRequest.from_dict(reportsv3_delete_measure_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


