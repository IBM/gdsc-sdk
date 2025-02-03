# Jumpboxv3SearchUsersResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**users** | [**List[Jumpboxv3DirectoryEntry]**](Jumpboxv3DirectoryEntry.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.jumpboxv3_search_users_response import Jumpboxv3SearchUsersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3SearchUsersResponse from a JSON string
jumpboxv3_search_users_response_instance = Jumpboxv3SearchUsersResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3SearchUsersResponse.to_json())

# convert the object into a dict
jumpboxv3_search_users_response_dict = jumpboxv3_search_users_response_instance.to_dict()
# create an instance of Jumpboxv3SearchUsersResponse from a dict
jumpboxv3_search_users_response_from_dict = Jumpboxv3SearchUsersResponse.from_dict(jumpboxv3_search_users_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


