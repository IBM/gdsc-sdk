# Complianceacceleratorv3StatusResponseBase

StatusResponseBase is the message that stores status code and message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Message for status response. | [optional] 
**status** | **str** | Status code. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_status_response_base import Complianceacceleratorv3StatusResponseBase

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3StatusResponseBase from a JSON string
complianceacceleratorv3_status_response_base_instance = Complianceacceleratorv3StatusResponseBase.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3StatusResponseBase.to_json())

# convert the object into a dict
complianceacceleratorv3_status_response_base_dict = complianceacceleratorv3_status_response_base_instance.to_dict()
# create an instance of Complianceacceleratorv3StatusResponseBase from a dict
complianceacceleratorv3_status_response_base_from_dict = Complianceacceleratorv3StatusResponseBase.from_dict(complianceacceleratorv3_status_response_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


