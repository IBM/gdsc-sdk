# Policybuilderv3InsertGdpPolicyMetaDataRequest

Request object containing a list of objects.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | ID of central manager. | [optional] 
**data** | [**List[Policybuilderv3GdpPolicyObject]**](Policybuilderv3GdpPolicyObject.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_insert_gdp_policy_meta_data_request import Policybuilderv3InsertGdpPolicyMetaDataRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3InsertGdpPolicyMetaDataRequest from a JSON string
policybuilderv3_insert_gdp_policy_meta_data_request_instance = Policybuilderv3InsertGdpPolicyMetaDataRequest.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3InsertGdpPolicyMetaDataRequest.to_json())

# convert the object into a dict
policybuilderv3_insert_gdp_policy_meta_data_request_dict = policybuilderv3_insert_gdp_policy_meta_data_request_instance.to_dict()
# create an instance of Policybuilderv3InsertGdpPolicyMetaDataRequest from a dict
policybuilderv3_insert_gdp_policy_meta_data_request_from_dict = Policybuilderv3InsertGdpPolicyMetaDataRequest.from_dict(policybuilderv3_insert_gdp_policy_meta_data_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


