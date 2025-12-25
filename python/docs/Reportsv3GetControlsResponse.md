# Reportsv3GetControlsResponse

GetControlsResponse is the response for getting a list of controls with all data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controls** | [**List[Reportsv3Control]**](Reportsv3Control.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_controls_response import Reportsv3GetControlsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetControlsResponse from a JSON string
reportsv3_get_controls_response_instance = Reportsv3GetControlsResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetControlsResponse.to_json())

# convert the object into a dict
reportsv3_get_controls_response_dict = reportsv3_get_controls_response_instance.to_dict()
# create an instance of Reportsv3GetControlsResponse from a dict
reportsv3_get_controls_response_from_dict = Reportsv3GetControlsResponse.from_dict(reportsv3_get_controls_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


