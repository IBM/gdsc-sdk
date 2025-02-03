# Jumpboxv3AuthorizeRequest

AuthorizeRequest message for POST v3/Authorize api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**display_name** | **str** | Display name of the user. | [optional] 
**email** | **str** | Contact email address of the user. | [optional] 
**external_id** | **str** | External id of the user. | [optional] 
**first_name** | **str** | First name of the user. | [optional] 
**is_renew** | **bool** | If it is a renew. | [optional] 
**is_update_user_info** | **bool** | Whether to update the user info with ISV during login. | [optional] 
**last_name** | **str** | Last name of the user. | [optional] 
**login_id** | **str** | Login id of the user. | [optional] 
**tenant_id** | **str** | Tenant id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.jumpboxv3_authorize_request import Jumpboxv3AuthorizeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3AuthorizeRequest from a JSON string
jumpboxv3_authorize_request_instance = Jumpboxv3AuthorizeRequest.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3AuthorizeRequest.to_json())

# convert the object into a dict
jumpboxv3_authorize_request_dict = jumpboxv3_authorize_request_instance.to_dict()
# create an instance of Jumpboxv3AuthorizeRequest from a dict
jumpboxv3_authorize_request_from_dict = Jumpboxv3AuthorizeRequest.from_dict(jumpboxv3_authorize_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


