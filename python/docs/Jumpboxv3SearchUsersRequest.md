# Jumpboxv3SearchUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**search_string** | **str** | Any text including wild-card character. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.jumpboxv3_search_users_request import Jumpboxv3SearchUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3SearchUsersRequest from a JSON string
jumpboxv3_search_users_request_instance = Jumpboxv3SearchUsersRequest.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3SearchUsersRequest.to_json())

# convert the object into a dict
jumpboxv3_search_users_request_dict = jumpboxv3_search_users_request_instance.to_dict()
# create an instance of Jumpboxv3SearchUsersRequest from a dict
jumpboxv3_search_users_request_from_dict = Jumpboxv3SearchUsersRequest.from_dict(jumpboxv3_search_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


