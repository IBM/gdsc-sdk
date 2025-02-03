# Complianceacceleratorv3SyslogConfig

Syslog alerts configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **str** | Syslog post. | [optional] 
**include_q_radar** | **bool** | Is q radar being used. | [optional] 
**is_deletion** | **bool** | The syslog config is being deleted. | [optional] 
**name** | **str** | Syslog name. | [optional] 
**port** | **str** | Syslog port. | [optional] 
**protocol** | **str** | Syslog protocol UDP || TCP. | [optional] 
**syslog_id** | **str** | Syslog id. | [optional] 
**template_id** | **str** | Syslog template. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_syslog_config import Complianceacceleratorv3SyslogConfig

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3SyslogConfig from a JSON string
complianceacceleratorv3_syslog_config_instance = Complianceacceleratorv3SyslogConfig.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3SyslogConfig.to_json())

# convert the object into a dict
complianceacceleratorv3_syslog_config_dict = complianceacceleratorv3_syslog_config_instance.to_dict()
# create an instance of Complianceacceleratorv3SyslogConfig from a dict
complianceacceleratorv3_syslog_config_from_dict = Complianceacceleratorv3SyslogConfig.from_dict(complianceacceleratorv3_syslog_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


