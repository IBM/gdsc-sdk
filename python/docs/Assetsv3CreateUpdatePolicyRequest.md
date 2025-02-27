# Assetsv3CreateUpdatePolicyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **int** | Operation to perform on the policy - Create,Update,Clone. | [optional] 
**policy** | [**Assetsv3PolicyUpdate**](Assetsv3PolicyUpdate.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_create_update_policy_request import Assetsv3CreateUpdatePolicyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3CreateUpdatePolicyRequest from a JSON string
assetsv3_create_update_policy_request_instance = Assetsv3CreateUpdatePolicyRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3CreateUpdatePolicyRequest.to_json())

# convert the object into a dict
assetsv3_create_update_policy_request_dict = assetsv3_create_update_policy_request_instance.to_dict()
# create an instance of Assetsv3CreateUpdatePolicyRequest from a dict
assetsv3_create_update_policy_request_from_dict = Assetsv3CreateUpdatePolicyRequest.from_dict(assetsv3_create_update_policy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


