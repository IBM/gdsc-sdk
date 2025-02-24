# Tenantuserv3UniquePrivilege


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privilege_id** | **str** | Privilege ID. | [optional] 
**type** | **str** | Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_unique_privilege import Tenantuserv3UniquePrivilege

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3UniquePrivilege from a JSON string
tenantuserv3_unique_privilege_instance = Tenantuserv3UniquePrivilege.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3UniquePrivilege.to_json())

# convert the object into a dict
tenantuserv3_unique_privilege_dict = tenantuserv3_unique_privilege_instance.to_dict()
# create an instance of Tenantuserv3UniquePrivilege from a dict
tenantuserv3_unique_privilege_from_dict = Tenantuserv3UniquePrivilege.from_dict(tenantuserv3_unique_privilege_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


