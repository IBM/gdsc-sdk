# Tenantuserv3Apikey

ApiKey message includes information of a single apikey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_date** | **datetime** | Date activated. | [optional] 
**active** | **bool** | Is Active. | [optional] 
**apikey** | **str** | Apikey. | [optional] 
**id** | **str** | Apikey id. | [optional] 
**last_used** | **datetime** | Date last used. | [optional] 
**name** | **str** | ApiKey name. | [optional] 
**roles** | **List[str]** | Roles. | [optional] 
**secret** | **str** | Secret. | [optional] 
**tenant_id** | **str** | Tenant id. | [optional] 
**user_id** | **str** | Email. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_apikey import Tenantuserv3Apikey

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3Apikey from a JSON string
tenantuserv3_apikey_instance = Tenantuserv3Apikey.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3Apikey.to_json())

# convert the object into a dict
tenantuserv3_apikey_dict = tenantuserv3_apikey_instance.to_dict()
# create an instance of Tenantuserv3Apikey from a dict
tenantuserv3_apikey_from_dict = Tenantuserv3Apikey.from_dict(tenantuserv3_apikey_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


