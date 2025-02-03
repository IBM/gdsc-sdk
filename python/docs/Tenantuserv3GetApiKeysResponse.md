# Tenantuserv3GetApiKeysResponse

GetApiKeysResponse message for Get APIKeys api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apikeys** | [**List[Tenantuserv3Apikey]**](Tenantuserv3Apikey.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_get_api_keys_response import Tenantuserv3GetApiKeysResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetApiKeysResponse from a JSON string
tenantuserv3_get_api_keys_response_instance = Tenantuserv3GetApiKeysResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetApiKeysResponse.to_json())

# convert the object into a dict
tenantuserv3_get_api_keys_response_dict = tenantuserv3_get_api_keys_response_instance.to_dict()
# create an instance of Tenantuserv3GetApiKeysResponse from a dict
tenantuserv3_get_api_keys_response_from_dict = Tenantuserv3GetApiKeysResponse.from_dict(tenantuserv3_get_api_keys_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


