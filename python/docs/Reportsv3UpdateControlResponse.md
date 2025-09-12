# Reportsv3UpdateControlResponse

UpdateControlResponse is the response after updating a control.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**control_id** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_control_response import Reportsv3UpdateControlResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateControlResponse from a JSON string
reportsv3_update_control_response_instance = Reportsv3UpdateControlResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateControlResponse.to_json())

# convert the object into a dict
reportsv3_update_control_response_dict = reportsv3_update_control_response_instance.to_dict()
# create an instance of Reportsv3UpdateControlResponse from a dict
reportsv3_update_control_response_from_dict = Reportsv3UpdateControlResponse.from_dict(reportsv3_update_control_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


