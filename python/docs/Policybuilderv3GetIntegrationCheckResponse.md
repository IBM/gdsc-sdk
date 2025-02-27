# Policybuilderv3GetIntegrationCheckResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy_names** | **List[str]** | Array contains policy names that uses integration id, if any. | [optional] 
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_get_integration_check_response import Policybuilderv3GetIntegrationCheckResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GetIntegrationCheckResponse from a JSON string
policybuilderv3_get_integration_check_response_instance = Policybuilderv3GetIntegrationCheckResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GetIntegrationCheckResponse.to_json())

# convert the object into a dict
policybuilderv3_get_integration_check_response_dict = policybuilderv3_get_integration_check_response_instance.to_dict()
# create an instance of Policybuilderv3GetIntegrationCheckResponse from a dict
policybuilderv3_get_integration_check_response_from_dict = Policybuilderv3GetIntegrationCheckResponse.from_dict(policybuilderv3_get_integration_check_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


