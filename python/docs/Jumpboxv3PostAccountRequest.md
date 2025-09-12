# Jumpboxv3PostAccountRequest

PostAccountsRequest message for POST v3/accounts api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_id** | **str** | External id. | [optional] 
**external_metadata** | [**Dict[str, Tenantuserv3ExternalMetadata]**](Tenantuserv3ExternalMetadata.md) | External metadata. | [optional] 
**name** | **str** | Account name. | [optional] 
**part_number** | **str** | Part number. | [optional] 
**uid** | **str** | Email. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_post_account_request import Jumpboxv3PostAccountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3PostAccountRequest from a JSON string
jumpboxv3_post_account_request_instance = Jumpboxv3PostAccountRequest.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3PostAccountRequest.to_json())

# convert the object into a dict
jumpboxv3_post_account_request_dict = jumpboxv3_post_account_request_instance.to_dict()
# create an instance of Jumpboxv3PostAccountRequest from a dict
jumpboxv3_post_account_request_from_dict = Jumpboxv3PostAccountRequest.from_dict(jumpboxv3_post_account_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


