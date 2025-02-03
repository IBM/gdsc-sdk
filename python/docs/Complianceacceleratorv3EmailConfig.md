# Complianceacceleratorv3EmailConfig

Emails alerts for policies compliance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integration_id** | **str** | Integration id. | [optional] 
**template_id** | **str** | Email template id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_email_config import Complianceacceleratorv3EmailConfig

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3EmailConfig from a JSON string
complianceacceleratorv3_email_config_instance = Complianceacceleratorv3EmailConfig.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3EmailConfig.to_json())

# convert the object into a dict
complianceacceleratorv3_email_config_dict = complianceacceleratorv3_email_config_instance.to_dict()
# create an instance of Complianceacceleratorv3EmailConfig from a dict
complianceacceleratorv3_email_config_from_dict = Complianceacceleratorv3EmailConfig.from_dict(complianceacceleratorv3_email_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


