# Jumpboxv3TestUserRequest

TestUserRequest Test user id with in an LDAP connection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ldap_id** | **str** | LDAP id. | [optional] 
**uid** | **str** | Email. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.jumpboxv3_test_user_request import Jumpboxv3TestUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3TestUserRequest from a JSON string
jumpboxv3_test_user_request_instance = Jumpboxv3TestUserRequest.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3TestUserRequest.to_json())

# convert the object into a dict
jumpboxv3_test_user_request_dict = jumpboxv3_test_user_request_instance.to_dict()
# create an instance of Jumpboxv3TestUserRequest from a dict
jumpboxv3_test_user_request_from_dict = Jumpboxv3TestUserRequest.from_dict(jumpboxv3_test_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


