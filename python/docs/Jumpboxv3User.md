# Jumpboxv3User

User has information about a single user typically used in listing and editing users.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_date** | **datetime** | Creation date. | [optional] 
**directory_id** | **str** | Which directory did this user come from. | [optional] 
**disabled** | **bool** | User disabled. | [optional] 
**display_name** | **str** | LDAP cn. | [optional] 
**distinguished_name** | **str** | LDAP dn&#x3D;  (needed to import user from LDAP into TenantUser). | [optional] 
**email** | **str** | Email address of the user. | [optional] 
**external_id** | **str** | External id of the user. | [optional] 
**metadata** | **Dict[str, str]** | Metadata will contain all preferences. | [optional] 
**roles** | **List[str]** | Roles. | [optional] 
**state** | [**Jumpboxv3UserState**](Jumpboxv3UserState.md) |  | [optional] [default to Jumpboxv3UserState.ACTIVE]
**uid** | **str** | Email. | [optional] 
**user_id** | **str** | Unique id for user. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_user import Jumpboxv3User

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3User from a JSON string
jumpboxv3_user_instance = Jumpboxv3User.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3User.to_json())

# convert the object into a dict
jumpboxv3_user_dict = jumpboxv3_user_instance.to_dict()
# create an instance of Jumpboxv3User from a dict
jumpboxv3_user_from_dict = Jumpboxv3User.from_dict(jumpboxv3_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


