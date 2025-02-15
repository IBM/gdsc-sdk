# UserStores200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[AccessibleDataStores]**](AccessibleDataStores.md) |  | 
**next_token** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.user_stores200_response import UserStores200Response

# TODO update the JSON string below
json = "{}"
# create an instance of UserStores200Response from a JSON string
user_stores200_response_instance = UserStores200Response.from_json(json)
# print the JSON string representation of the object
print(UserStores200Response.to_json())

# convert the object into a dict
user_stores200_response_dict = user_stores200_response_instance.to_dict()
# create an instance of UserStores200Response from a dict
user_stores200_response_from_dict = UserStores200Response.from_dict(user_stores200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


