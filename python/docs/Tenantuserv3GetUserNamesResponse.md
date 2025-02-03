# Tenantuserv3GetUserNamesResponse

GetUserNamesResponse returns the.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Success or failure. | [optional] 
**users** | **Dict[str, str]** | Map of user names found by id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_get_user_names_response import Tenantuserv3GetUserNamesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetUserNamesResponse from a JSON string
tenantuserv3_get_user_names_response_instance = Tenantuserv3GetUserNamesResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetUserNamesResponse.to_json())

# convert the object into a dict
tenantuserv3_get_user_names_response_dict = tenantuserv3_get_user_names_response_instance.to_dict()
# create an instance of Tenantuserv3GetUserNamesResponse from a dict
tenantuserv3_get_user_names_response_from_dict = Tenantuserv3GetUserNamesResponse.from_dict(tenantuserv3_get_user_names_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


