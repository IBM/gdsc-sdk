# Resourcecontrollerk8v3Rule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api_groups** | **List[str]** |  | [optional] 
**id** | **str** |  | [optional] 
**resources** | **List[str]** |  | [optional] 
**verbs** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_rule import Resourcecontrollerk8v3Rule

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3Rule from a JSON string
resourcecontrollerk8v3_rule_instance = Resourcecontrollerk8v3Rule.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3Rule.to_json())

# convert the object into a dict
resourcecontrollerk8v3_rule_dict = resourcecontrollerk8v3_rule_instance.to_dict()
# create an instance of Resourcecontrollerk8v3Rule from a dict
resourcecontrollerk8v3_rule_from_dict = Resourcecontrollerk8v3Rule.from_dict(resourcecontrollerk8v3_rule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


