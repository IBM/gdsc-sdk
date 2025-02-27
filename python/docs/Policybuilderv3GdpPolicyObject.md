# Policybuilderv3GdpPolicyObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**policy_description** | **str** | Policy name. | [optional] 
**policy_rules_count** | **str** | Number of rules. | [optional] 
**policy_sub_type** | **str** |  | [optional] 
**policy_type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_gdp_policy_object import Policybuilderv3GdpPolicyObject

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GdpPolicyObject from a JSON string
policybuilderv3_gdp_policy_object_instance = Policybuilderv3GdpPolicyObject.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GdpPolicyObject.to_json())

# convert the object into a dict
policybuilderv3_gdp_policy_object_dict = policybuilderv3_gdp_policy_object_instance.to_dict()
# create an instance of Policybuilderv3GdpPolicyObject from a dict
policybuilderv3_gdp_policy_object_from_dict = Policybuilderv3GdpPolicyObject.from_dict(policybuilderv3_gdp_policy_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


