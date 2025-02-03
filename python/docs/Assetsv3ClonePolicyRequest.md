# Assetsv3ClonePolicyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy_id** | **str** | Policy id that needs to be cloned. | [optional] 
**policy_name** | **str** | New policy name of the cloned policy. | [optional] 
**rules** | [**List[Assetsv3Rule]**](Assetsv3Rule.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_clone_policy_request import Assetsv3ClonePolicyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ClonePolicyRequest from a JSON string
assetsv3_clone_policy_request_instance = Assetsv3ClonePolicyRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ClonePolicyRequest.to_json())

# convert the object into a dict
assetsv3_clone_policy_request_dict = assetsv3_clone_policy_request_instance.to_dict()
# create an instance of Assetsv3ClonePolicyRequest from a dict
assetsv3_clone_policy_request_from_dict = Assetsv3ClonePolicyRequest.from_dict(assetsv3_clone_policy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


