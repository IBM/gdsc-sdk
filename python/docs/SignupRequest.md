# SignupRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.signup_request import SignupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SignupRequest from a JSON string
signup_request_instance = SignupRequest.from_json(json)
# print the JSON string representation of the object
print(SignupRequest.to_json())

# convert the object into a dict
signup_request_dict = signup_request_instance.to_dict()
# create an instance of SignupRequest from a dict
signup_request_from_dict = SignupRequest.from_dict(signup_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


