# Assetsv3ListPolicyResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy_list** | [**List[Assetsv3Policy]**](Assetsv3Policy.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_list_policy_response import Assetsv3ListPolicyResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ListPolicyResponse from a JSON string
assetsv3_list_policy_response_instance = Assetsv3ListPolicyResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ListPolicyResponse.to_json())

# convert the object into a dict
assetsv3_list_policy_response_dict = assetsv3_list_policy_response_instance.to_dict()
# create an instance of Assetsv3ListPolicyResponse from a dict
assetsv3_list_policy_response_from_dict = Assetsv3ListPolicyResponse.from_dict(assetsv3_list_policy_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


