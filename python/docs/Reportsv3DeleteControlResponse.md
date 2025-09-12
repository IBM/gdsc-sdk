# Reportsv3DeleteControlResponse

DeleteControlResponse is the response for deleting a control.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Success or error message. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_delete_control_response import Reportsv3DeleteControlResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3DeleteControlResponse from a JSON string
reportsv3_delete_control_response_instance = Reportsv3DeleteControlResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3DeleteControlResponse.to_json())

# convert the object into a dict
reportsv3_delete_control_response_dict = reportsv3_delete_control_response_instance.to_dict()
# create an instance of Reportsv3DeleteControlResponse from a dict
reportsv3_delete_control_response_from_dict = Reportsv3DeleteControlResponse.from_dict(reportsv3_delete_control_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


