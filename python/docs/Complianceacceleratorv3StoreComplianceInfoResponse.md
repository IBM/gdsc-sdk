# Complianceacceleratorv3StoreComplianceInfoResponse

Response message after storing compliance data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Complianceacceleratorv3StatusResponseBase**](Complianceacceleratorv3StatusResponseBase.md) |  | [optional] 
**workspace_id** | **str** | The id of the workspace. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_store_compliance_info_response import Complianceacceleratorv3StoreComplianceInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3StoreComplianceInfoResponse from a JSON string
complianceacceleratorv3_store_compliance_info_response_instance = Complianceacceleratorv3StoreComplianceInfoResponse.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3StoreComplianceInfoResponse.to_json())

# convert the object into a dict
complianceacceleratorv3_store_compliance_info_response_dict = complianceacceleratorv3_store_compliance_info_response_instance.to_dict()
# create an instance of Complianceacceleratorv3StoreComplianceInfoResponse from a dict
complianceacceleratorv3_store_compliance_info_response_from_dict = Complianceacceleratorv3StoreComplianceInfoResponse.from_dict(complianceacceleratorv3_store_compliance_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


