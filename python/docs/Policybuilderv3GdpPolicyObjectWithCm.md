# Policybuilderv3GdpPolicyObjectWithCm


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**last_edited_timestamp** | **str** |  | [optional] 
**policy_description** | **str** | Policy name. | [optional] 
**policy_rules_count** | **int** | Number of rules. | [optional] 
**policy_sub_type** | **str** |  | [optional] 
**policy_type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_gdp_policy_object_with_cm import Policybuilderv3GdpPolicyObjectWithCm

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GdpPolicyObjectWithCm from a JSON string
policybuilderv3_gdp_policy_object_with_cm_instance = Policybuilderv3GdpPolicyObjectWithCm.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GdpPolicyObjectWithCm.to_json())

# convert the object into a dict
policybuilderv3_gdp_policy_object_with_cm_dict = policybuilderv3_gdp_policy_object_with_cm_instance.to_dict()
# create an instance of Policybuilderv3GdpPolicyObjectWithCm from a dict
policybuilderv3_gdp_policy_object_with_cm_from_dict = Policybuilderv3GdpPolicyObjectWithCm.from_dict(policybuilderv3_gdp_policy_object_with_cm_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


