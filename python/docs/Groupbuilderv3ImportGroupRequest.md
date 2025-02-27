# Groupbuilderv3ImportGroupRequest

GetGroupsRequest requests to import specific groups from a Guardium Data Protection central manager.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | Central manager host name. | [optional] 
**groups** | [**List[Groupbuilderv3Group]**](Groupbuilderv3Group.md) | List of groups to import from the central manager. | [optional] 
**ldap_config** | [**Groupbuilderv3LdapConfig**](Groupbuilderv3LdapConfig.md) |  | [optional] 
**one_time** | **bool** | Import without synchronizing. | [optional] 
**preview** | **bool** | This flag is only valid if ldap_config is specified When set, LDAP import will pull the first 10 members from LDAP based on specified  LDAP config and return to the caller without adding them to the group. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.groupbuilderv3_import_group_request import Groupbuilderv3ImportGroupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3ImportGroupRequest from a JSON string
groupbuilderv3_import_group_request_instance = Groupbuilderv3ImportGroupRequest.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3ImportGroupRequest.to_json())

# convert the object into a dict
groupbuilderv3_import_group_request_dict = groupbuilderv3_import_group_request_instance.to_dict()
# create an instance of Groupbuilderv3ImportGroupRequest from a dict
groupbuilderv3_import_group_request_from_dict = Groupbuilderv3ImportGroupRequest.from_dict(groupbuilderv3_import_group_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


