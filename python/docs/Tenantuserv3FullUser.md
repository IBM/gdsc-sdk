# Tenantuserv3FullUser


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_date** | **datetime** | Datetime of last access. | [optional] 
**directory_id** | **str** | Which directory did this user come from?. | [optional] 
**disabled** | **bool** | Disabled. | [optional] 
**display_name** | **str** | LDAP cn. | [optional] 
**distinguished_name** | **str** | LDAP dn&#x3D;  (needed to import user from LDAP into TenantUser). | [optional] 
**email** | **str** | The email address of the user for communication. | [optional] 
**external_id** | **str** | External id of this user. E.g. ISV id. | [optional] 
**metadata** | **Dict[str, str]** | Metadata will contain all preferences   --&gt; this will contain all user-specific settings, including session time out. | [optional] 
**privileges** | **Dict[str, bool]** | Cumulative privileges base on all roles. | [optional] 
**roles** | **List[str]** | Roles. | [optional] 
**state** | [**Tenantuserv3UserState**](Tenantuserv3UserState.md) |  | [optional] [default to Tenantuserv3UserState.ACTIVE]
**tenant_id** | **str** | Tenant this user belongs to. | [optional] 
**uid** | **str** | Email. | [optional] 
**user_id** | **str** | Unique id for user. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_full_user import Tenantuserv3FullUser

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3FullUser from a JSON string
tenantuserv3_full_user_instance = Tenantuserv3FullUser.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3FullUser.to_json())

# convert the object into a dict
tenantuserv3_full_user_dict = tenantuserv3_full_user_instance.to_dict()
# create an instance of Tenantuserv3FullUser from a dict
tenantuserv3_full_user_from_dict = Tenantuserv3FullUser.from_dict(tenantuserv3_full_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


