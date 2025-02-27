# Groupbuilderv3LdapConfig

LdapConfig contains information about configuration for importing group members from LDAP.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **List[str]** | LDAP object attribute used to convert to member data. | [optional] 
**bind_group_id** | **int** | ID of the group whose members are used as bind values for parameterize filter. | [optional] 
**bind_password** | **str** | Password for binding to LDAP if bind ID is set for ICP LDAP definition. | [optional] 
**clear_group** | **bool** | Flag indicating whether new data is replacing old data or is appended to it. | [optional] 
**filter** | **str** | LDAP search query to use to find objects. | [optional] 
**filter_scope** | **int** | Scope of LDAP search:  sub-tree vs immediate base DN children. | [optional] 
**import_limit** | **int** | Maximum number of objects to import. | [optional] 
**ldap_group_name** | **str** | DN name of the LDAP group to get members from.  Alternative to explicit filter. | [optional] 
**ldap_id** | **str** | ID of the ICP LDAP definition from which to import. | [optional] 
**member_prefix** | **str** | Prefix that will be added to each imported member. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.groupbuilderv3_ldap_config import Groupbuilderv3LdapConfig

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3LdapConfig from a JSON string
groupbuilderv3_ldap_config_instance = Groupbuilderv3LdapConfig.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3LdapConfig.to_json())

# convert the object into a dict
groupbuilderv3_ldap_config_dict = groupbuilderv3_ldap_config_instance.to_dict()
# create an instance of Groupbuilderv3LdapConfig from a dict
groupbuilderv3_ldap_config_from_dict = Groupbuilderv3LdapConfig.from_dict(groupbuilderv3_ldap_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


