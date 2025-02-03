# Guardiumconnectorv3GdpPolicyObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**policy_description** | **str** | Policy name. | [optional] 
**policy_rules_count** | **int** | Number of rules. | [optional] 
**policy_sub_type** | **str** |  | [optional] 
**policy_type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_gdp_policy_object import Guardiumconnectorv3GdpPolicyObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GdpPolicyObject from a JSON string
guardiumconnectorv3_gdp_policy_object_instance = Guardiumconnectorv3GdpPolicyObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GdpPolicyObject.to_json())

# convert the object into a dict
guardiumconnectorv3_gdp_policy_object_dict = guardiumconnectorv3_gdp_policy_object_instance.to_dict()
# create an instance of Guardiumconnectorv3GdpPolicyObject from a dict
guardiumconnectorv3_gdp_policy_object_from_dict = Guardiumconnectorv3GdpPolicyObject.from_dict(guardiumconnectorv3_gdp_policy_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


