# Policybuilderv3StorePolicyGdpRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | ID of central manager. | [optional] 
**data** | **str** | Policies pushed from GDP in json format. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_store_policy_gdp_request import Policybuilderv3StorePolicyGdpRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3StorePolicyGdpRequest from a JSON string
policybuilderv3_store_policy_gdp_request_instance = Policybuilderv3StorePolicyGdpRequest.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3StorePolicyGdpRequest.to_json())

# convert the object into a dict
policybuilderv3_store_policy_gdp_request_dict = policybuilderv3_store_policy_gdp_request_instance.to_dict()
# create an instance of Policybuilderv3StorePolicyGdpRequest from a dict
policybuilderv3_store_policy_gdp_request_from_dict = Policybuilderv3StorePolicyGdpRequest.from_dict(policybuilderv3_store_policy_gdp_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


