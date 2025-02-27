# Complianceacceleratorv3GetComplianceInfoResponse

Response message to retrieve compliance data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**compliance_info** | [**Complianceacceleratorv3ComplianceInfo**](Complianceacceleratorv3ComplianceInfo.md) |  | [optional] 
**status** | [**Complianceacceleratorv3StatusResponseBase**](Complianceacceleratorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_get_compliance_info_response import Complianceacceleratorv3GetComplianceInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3GetComplianceInfoResponse from a JSON string
complianceacceleratorv3_get_compliance_info_response_instance = Complianceacceleratorv3GetComplianceInfoResponse.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3GetComplianceInfoResponse.to_json())

# convert the object into a dict
complianceacceleratorv3_get_compliance_info_response_dict = complianceacceleratorv3_get_compliance_info_response_instance.to_dict()
# create an instance of Complianceacceleratorv3GetComplianceInfoResponse from a dict
complianceacceleratorv3_get_compliance_info_response_from_dict = Complianceacceleratorv3GetComplianceInfoResponse.from_dict(complianceacceleratorv3_get_compliance_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


