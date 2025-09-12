# Reportsv3DeleteControlRequest

DeleteControlRequest is the request for deleting a control.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**control_id** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_delete_control_request import Reportsv3DeleteControlRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3DeleteControlRequest from a JSON string
reportsv3_delete_control_request_instance = Reportsv3DeleteControlRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3DeleteControlRequest.to_json())

# convert the object into a dict
reportsv3_delete_control_request_dict = reportsv3_delete_control_request_instance.to_dict()
# create an instance of Reportsv3DeleteControlRequest from a dict
reportsv3_delete_control_request_from_dict = Reportsv3DeleteControlRequest.from_dict(reportsv3_delete_control_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


