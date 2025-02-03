# Complianceacceleratorv3Options


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_config** | [**Complianceacceleratorv3EmailConfig**](Complianceacceleratorv3EmailConfig.md) |  | [optional] 
**parent_groups** | [**Dict[str, Complianceacceleratorv3Group]**](Complianceacceleratorv3Group.md) |  | [optional] 
**policy_id** | **str** |  | [optional] 
**rules** | [**Dict[str, Complianceacceleratorv3RuleAndAction]**](Complianceacceleratorv3RuleAndAction.md) | Key is policy rule names for alerts. | [optional] 
**syslog_config** | [**Complianceacceleratorv3SyslogConfig**](Complianceacceleratorv3SyslogConfig.md) |  | [optional] 
**tasks** | [**Dict[str, Complianceacceleratorv3TaskStatus]**](Complianceacceleratorv3TaskStatus.md) | Tasks that need to be completed. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_options import Complianceacceleratorv3Options

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3Options from a JSON string
complianceacceleratorv3_options_instance = Complianceacceleratorv3Options.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3Options.to_json())

# convert the object into a dict
complianceacceleratorv3_options_dict = complianceacceleratorv3_options_instance.to_dict()
# create an instance of Complianceacceleratorv3Options from a dict
complianceacceleratorv3_options_from_dict = Complianceacceleratorv3Options.from_dict(complianceacceleratorv3_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


