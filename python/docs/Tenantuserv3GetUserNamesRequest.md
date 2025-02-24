# Tenantuserv3GetUserNamesRequest

GetUserNamesRequest message for GetUserNamesResponse.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_ids** | **List[str]** | user_ids specifies the IDs to look up in the given tenant. An empty list will result in no users being looked up. User IDs that are not found in the tenant will not be in the result. Duplicate User IDs will only be in the result once. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_get_user_names_request import Tenantuserv3GetUserNamesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetUserNamesRequest from a JSON string
tenantuserv3_get_user_names_request_instance = Tenantuserv3GetUserNamesRequest.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetUserNamesRequest.to_json())

# convert the object into a dict
tenantuserv3_get_user_names_request_dict = tenantuserv3_get_user_names_request_instance.to_dict()
# create an instance of Tenantuserv3GetUserNamesRequest from a dict
tenantuserv3_get_user_names_request_from_dict = Tenantuserv3GetUserNamesRequest.from_dict(tenantuserv3_get_user_names_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


