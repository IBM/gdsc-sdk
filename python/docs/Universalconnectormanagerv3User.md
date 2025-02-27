# Universalconnectormanagerv3User

User has information about a single user; based on tenantuser.proto > FullUser.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**display_name** | **str** | LDAP cn. | [optional] 
**uid** | **str** | Email. | [optional] 
**user_id** | **str** | Unique id for user. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.universalconnectormanagerv3_user import Universalconnectormanagerv3User

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3User from a JSON string
universalconnectormanagerv3_user_instance = Universalconnectormanagerv3User.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3User.to_json())

# convert the object into a dict
universalconnectormanagerv3_user_dict = universalconnectormanagerv3_user_instance.to_dict()
# create an instance of Universalconnectormanagerv3User from a dict
universalconnectormanagerv3_user_from_dict = Universalconnectormanagerv3User.from_dict(universalconnectormanagerv3_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


