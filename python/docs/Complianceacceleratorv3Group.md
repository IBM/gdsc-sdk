# Complianceacceleratorv3Group

Group info for compliance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**desc** | **str** |  | [optional] 
**group_type_id** | **int** | Group type ID. | [optional] 
**id** | **int** | Id of group. | [optional] 
**ldap_config** | [**Groupbuilderv3LdapConfig**](Groupbuilderv3LdapConfig.md) |  | [optional] 
**members** | [**List[Groupbuilderv3GroupMember]**](Groupbuilderv3GroupMember.md) | Group members. | [optional] 
**members_to_add** | **List[str]** | Members of the groups to be stored. | [optional] 
**members_to_delete** | [**List[Groupbuilderv3GroupMember]**](Groupbuilderv3GroupMember.md) | Member ids to be deleted. | [optional] 
**name** | **str** | Name of group. | [optional] 
**parent** | **bool** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_group import Complianceacceleratorv3Group

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3Group from a JSON string
complianceacceleratorv3_group_instance = Complianceacceleratorv3Group.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3Group.to_json())

# convert the object into a dict
complianceacceleratorv3_group_dict = complianceacceleratorv3_group_instance.to_dict()
# create an instance of Complianceacceleratorv3Group from a dict
complianceacceleratorv3_group_from_dict = Complianceacceleratorv3Group.from_dict(complianceacceleratorv3_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


