# Guardiumconnectorv3GetPolicySummariesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy_data** | [**List[Guardiumconnectorv3GdpPolicyObject]**](Guardiumconnectorv3GdpPolicyObject.md) |  | [optional] 
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_policy_summaries_response import Guardiumconnectorv3GetPolicySummariesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetPolicySummariesResponse from a JSON string
guardiumconnectorv3_get_policy_summaries_response_instance = Guardiumconnectorv3GetPolicySummariesResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetPolicySummariesResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_policy_summaries_response_dict = guardiumconnectorv3_get_policy_summaries_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetPolicySummariesResponse from a dict
guardiumconnectorv3_get_policy_summaries_response_from_dict = Guardiumconnectorv3GetPolicySummariesResponse.from_dict(guardiumconnectorv3_get_policy_summaries_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


