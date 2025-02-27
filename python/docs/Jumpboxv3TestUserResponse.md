# Jumpboxv3TestUserResponse

TestUserResponse for if user exist.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Success message for the test. | [optional] 
**user** | [**Jumpboxv3User**](Jumpboxv3User.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_test_user_response import Jumpboxv3TestUserResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3TestUserResponse from a JSON string
jumpboxv3_test_user_response_instance = Jumpboxv3TestUserResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3TestUserResponse.to_json())

# convert the object into a dict
jumpboxv3_test_user_response_dict = jumpboxv3_test_user_response_instance.to_dict()
# create an instance of Jumpboxv3TestUserResponse from a dict
jumpboxv3_test_user_response_from_dict = Jumpboxv3TestUserResponse.from_dict(jumpboxv3_test_user_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


