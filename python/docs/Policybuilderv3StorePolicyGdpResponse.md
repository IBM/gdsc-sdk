# Policybuilderv3StorePolicyGdpResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response** | **str** | Response message. | [optional] 
**response_code** | **str** | Translatable response code or empty string if there is no response. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_store_policy_gdp_response import Policybuilderv3StorePolicyGdpResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3StorePolicyGdpResponse from a JSON string
policybuilderv3_store_policy_gdp_response_instance = Policybuilderv3StorePolicyGdpResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3StorePolicyGdpResponse.to_json())

# convert the object into a dict
policybuilderv3_store_policy_gdp_response_dict = policybuilderv3_store_policy_gdp_response_instance.to_dict()
# create an instance of Policybuilderv3StorePolicyGdpResponse from a dict
policybuilderv3_store_policy_gdp_response_from_dict = Policybuilderv3StorePolicyGdpResponse.from_dict(policybuilderv3_store_policy_gdp_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


