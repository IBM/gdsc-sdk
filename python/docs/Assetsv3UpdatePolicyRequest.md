# Assetsv3UpdatePolicyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy_id** | **List[str]** | The IDs of the policies to be updated. | [optional] 
**update_activation_status** | **bool** | The activation status to be updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_update_policy_request import Assetsv3UpdatePolicyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3UpdatePolicyRequest from a JSON string
assetsv3_update_policy_request_instance = Assetsv3UpdatePolicyRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3UpdatePolicyRequest.to_json())

# convert the object into a dict
assetsv3_update_policy_request_dict = assetsv3_update_policy_request_instance.to_dict()
# create an instance of Assetsv3UpdatePolicyRequest from a dict
assetsv3_update_policy_request_from_dict = Assetsv3UpdatePolicyRequest.from_dict(assetsv3_update_policy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


