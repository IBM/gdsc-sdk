# SubmitPasswordRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**session_id** | **str** | Current sessionId | 
**password** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.submit_password_request import SubmitPasswordRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SubmitPasswordRequest from a JSON string
submit_password_request_instance = SubmitPasswordRequest.from_json(json)
# print the JSON string representation of the object
print(SubmitPasswordRequest.to_json())

# convert the object into a dict
submit_password_request_dict = submit_password_request_instance.to_dict()
# create an instance of SubmitPasswordRequest from a dict
submit_password_request_from_dict = SubmitPasswordRequest.from_dict(submit_password_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


