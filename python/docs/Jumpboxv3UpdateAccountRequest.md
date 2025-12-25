# Jumpboxv3UpdateAccountRequest

UpdateAccountRequest message for PUT v3/accounts/{account_id} api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **str** | Account id. | [optional] 
**external_metadata** | [**Dict[str, Tenantuserv3ExternalMetadata]**](Tenantuserv3ExternalMetadata.md) | External metadata. | [optional] 
**is_inactive** | **bool** | Is inactive. | [optional] 
**is_ready** | **bool** | Is ready. | [optional] 
**name** | **str** | Name. | [optional] 
**part_number** | **str** | Part number. | [optional] 
**uid** | **str** | Email. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_update_account_request import Jumpboxv3UpdateAccountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3UpdateAccountRequest from a JSON string
jumpboxv3_update_account_request_instance = Jumpboxv3UpdateAccountRequest.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3UpdateAccountRequest.to_json())

# convert the object into a dict
jumpboxv3_update_account_request_dict = jumpboxv3_update_account_request_instance.to_dict()
# create an instance of Jumpboxv3UpdateAccountRequest from a dict
jumpboxv3_update_account_request_from_dict = Jumpboxv3UpdateAccountRequest.from_dict(jumpboxv3_update_account_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


