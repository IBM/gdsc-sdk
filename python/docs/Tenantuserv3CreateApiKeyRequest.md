# Tenantuserv3CreateApiKeyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Key name. | [optional] 
**roles** | **List[str]** | Roles. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_create_api_key_request import Tenantuserv3CreateApiKeyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3CreateApiKeyRequest from a JSON string
tenantuserv3_create_api_key_request_instance = Tenantuserv3CreateApiKeyRequest.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3CreateApiKeyRequest.to_json())

# convert the object into a dict
tenantuserv3_create_api_key_request_dict = tenantuserv3_create_api_key_request_instance.to_dict()
# create an instance of Tenantuserv3CreateApiKeyRequest from a dict
tenantuserv3_create_api_key_request_from_dict = Tenantuserv3CreateApiKeyRequest.from_dict(tenantuserv3_create_api_key_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


