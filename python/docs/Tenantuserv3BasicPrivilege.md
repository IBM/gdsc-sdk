# Tenantuserv3BasicPrivilege


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privilege_id** | **str** | Privilege ID to be updated. | [optional] 
**roles** | **List[str]** | Roles array (which is the purpose of Bulk Update). | [optional] 
**type** | **str** | Privilege type (to uniquely identify the privilege). | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_basic_privilege import Tenantuserv3BasicPrivilege

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3BasicPrivilege from a JSON string
tenantuserv3_basic_privilege_instance = Tenantuserv3BasicPrivilege.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3BasicPrivilege.to_json())

# convert the object into a dict
tenantuserv3_basic_privilege_dict = tenantuserv3_basic_privilege_instance.to_dict()
# create an instance of Tenantuserv3BasicPrivilege from a dict
tenantuserv3_basic_privilege_from_dict = Tenantuserv3BasicPrivilege.from_dict(tenantuserv3_basic_privilege_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


