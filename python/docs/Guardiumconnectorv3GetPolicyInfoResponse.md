# Guardiumconnectorv3GetPolicyInfoResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy_data** | [**Guardiumconnectorv3PolicyData**](Guardiumconnectorv3PolicyData.md) |  | [optional] 
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_policy_info_response import Guardiumconnectorv3GetPolicyInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetPolicyInfoResponse from a JSON string
guardiumconnectorv3_get_policy_info_response_instance = Guardiumconnectorv3GetPolicyInfoResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetPolicyInfoResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_policy_info_response_dict = guardiumconnectorv3_get_policy_info_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetPolicyInfoResponse from a dict
guardiumconnectorv3_get_policy_info_response_from_dict = Guardiumconnectorv3GetPolicyInfoResponse.from_dict(guardiumconnectorv3_get_policy_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


