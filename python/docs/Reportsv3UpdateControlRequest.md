# Reportsv3UpdateControlRequest

UpdateControlRequest is the argument type used to update a control.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**control** | [**Reportsv3Control**](Reportsv3Control.md) |  | [optional] 
**control_id** | **int** | The id of the control that was updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_control_request import Reportsv3UpdateControlRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateControlRequest from a JSON string
reportsv3_update_control_request_instance = Reportsv3UpdateControlRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateControlRequest.to_json())

# convert the object into a dict
reportsv3_update_control_request_dict = reportsv3_update_control_request_instance.to_dict()
# create an instance of Reportsv3UpdateControlRequest from a dict
reportsv3_update_control_request_from_dict = Reportsv3UpdateControlRequest.from_dict(reportsv3_update_control_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


