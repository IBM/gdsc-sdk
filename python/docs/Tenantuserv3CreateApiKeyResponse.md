# Tenantuserv3CreateApiKeyResponse

CreateApiKeyResponse API Key creation response format.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apikey** | **str** | Apikey. | [optional] 
**encoded** | **str** | Encoded apikey. | [optional] 
**secret** | **str** | Apikey secret. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_create_api_key_response import Tenantuserv3CreateApiKeyResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3CreateApiKeyResponse from a JSON string
tenantuserv3_create_api_key_response_instance = Tenantuserv3CreateApiKeyResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3CreateApiKeyResponse.to_json())

# convert the object into a dict
tenantuserv3_create_api_key_response_dict = tenantuserv3_create_api_key_response_instance.to_dict()
# create an instance of Tenantuserv3CreateApiKeyResponse from a dict
tenantuserv3_create_api_key_response_from_dict = Tenantuserv3CreateApiKeyResponse.from_dict(tenantuserv3_create_api_key_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


