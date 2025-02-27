# Policybuilderv3GetGdpPolicyMetaDataResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policies** | [**List[Policybuilderv3GdpPolicyObjectWithCm]**](Policybuilderv3GdpPolicyObjectWithCm.md) |  | [optional] 
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_get_gdp_policy_meta_data_response import Policybuilderv3GetGdpPolicyMetaDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GetGdpPolicyMetaDataResponse from a JSON string
policybuilderv3_get_gdp_policy_meta_data_response_instance = Policybuilderv3GetGdpPolicyMetaDataResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GetGdpPolicyMetaDataResponse.to_json())

# convert the object into a dict
policybuilderv3_get_gdp_policy_meta_data_response_dict = policybuilderv3_get_gdp_policy_meta_data_response_instance.to_dict()
# create an instance of Policybuilderv3GetGdpPolicyMetaDataResponse from a dict
policybuilderv3_get_gdp_policy_meta_data_response_from_dict = Policybuilderv3GetGdpPolicyMetaDataResponse.from_dict(policybuilderv3_get_gdp_policy_meta_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


