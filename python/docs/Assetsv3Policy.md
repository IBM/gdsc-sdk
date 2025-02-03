# Assetsv3Policy

Base Policy object which is used in create and list APIs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_status** | **int** | Policy Activation Status. | [optional] 
**installed_flag** | **bool** | Flag to indicate whether policy is installed or not. | [optional] 
**installed_timestamp** | **str** |  | [optional] 
**is_delete** | **int** | Policy isDelete. | [optional] 
**last_edited_timestamp** | **str** |  | [optional] 
**no_of_rules** | **int** | No. of rules associated with policy. | [optional] 
**policy_id** | **str** | Policy ID. | [optional] 
**policy_name** | **str** | Policy Name. | [optional] 
**policy_sequence** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_policy import Assetsv3Policy

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3Policy from a JSON string
assetsv3_policy_instance = Assetsv3Policy.from_json(json)
# print the JSON string representation of the object
print(Assetsv3Policy.to_json())

# convert the object into a dict
assetsv3_policy_dict = assetsv3_policy_instance.to_dict()
# create an instance of Assetsv3Policy from a dict
assetsv3_policy_from_dict = Assetsv3Policy.from_dict(assetsv3_policy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


