# Assetsv3PolicyApplied

PolicyApplied - Asset Overview - data of policies applied on the asset for Control Health widget data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**policy_source** | **str** |  | [optional] 
**status** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_policy_applied import Assetsv3PolicyApplied

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3PolicyApplied from a JSON string
assetsv3_policy_applied_instance = Assetsv3PolicyApplied.from_json(json)
# print the JSON string representation of the object
print(Assetsv3PolicyApplied.to_json())

# convert the object into a dict
assetsv3_policy_applied_dict = assetsv3_policy_applied_instance.to_dict()
# create an instance of Assetsv3PolicyApplied from a dict
assetsv3_policy_applied_from_dict = Assetsv3PolicyApplied.from_dict(assetsv3_policy_applied_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


