# Jumpboxv3DirectoryEntry

DirectoryEntry message for ICP directory search result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**directory_id** | **str** | Which directory did this user come from. | [optional] 
**display_name** | **str** | LDAP cn. | [optional] 
**distinguished_name** | **str** | LDAP dn&#x3D;  (needed to import user from LDAP into TenantUser). | [optional] 
**metadata** | **Dict[str, str]** | Metadata will contain extra attributes returned from LDAP search. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_directory_entry import Jumpboxv3DirectoryEntry

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3DirectoryEntry from a JSON string
jumpboxv3_directory_entry_instance = Jumpboxv3DirectoryEntry.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3DirectoryEntry.to_json())

# convert the object into a dict
jumpboxv3_directory_entry_dict = jumpboxv3_directory_entry_instance.to_dict()
# create an instance of Jumpboxv3DirectoryEntry from a dict
jumpboxv3_directory_entry_from_dict = Jumpboxv3DirectoryEntry.from_dict(jumpboxv3_directory_entry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


