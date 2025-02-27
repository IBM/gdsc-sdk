# Complianceacceleratorv3AuditConfig

Audit scheduling configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Audit description. | [optional] 
**enabled** | **bool** | If audit is enabled to run. | [optional] 
**id** | **str** | Audit id. | [optional] 
**instructions** | **str** | Audit instructions. | [optional] 
**is_deletion** | **bool** | Delete flag. | [optional] 
**name** | **str** | Audit name. | [optional] 
**owner** | [**Schedulerv3Recipient**](Schedulerv3Recipient.md) |  | [optional] 
**recipients** | [**List[Schedulerv3Recipient]**](Schedulerv3Recipient.md) | Recepients. | [optional] 
**report_key** | **str** | Which reports set will be used. | [optional] 
**run_once_now** | **bool** | Flag if run once right away. | [optional] 
**scheduler** | [**Complianceacceleratorv3AuditScheduler**](Complianceacceleratorv3AuditScheduler.md) |  | [optional] 
**tasks** | [**List[Schedulerv3ScheduledTask]**](Schedulerv3ScheduledTask.md) | Array of tasks. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_audit_config import Complianceacceleratorv3AuditConfig

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3AuditConfig from a JSON string
complianceacceleratorv3_audit_config_instance = Complianceacceleratorv3AuditConfig.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3AuditConfig.to_json())

# convert the object into a dict
complianceacceleratorv3_audit_config_dict = complianceacceleratorv3_audit_config_instance.to_dict()
# create an instance of Complianceacceleratorv3AuditConfig from a dict
complianceacceleratorv3_audit_config_from_dict = Complianceacceleratorv3AuditConfig.from_dict(complianceacceleratorv3_audit_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


