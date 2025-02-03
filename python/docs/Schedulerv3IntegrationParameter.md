# Schedulerv3IntegrationParameter

IntegrationParameter includes all the parameters needed to import data from a csv file or other integration task parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**extra_detail** | **str** |  | [optional] 
**integration_id** | **str** | SFTP or SMB connection record in integrations. | [optional] 
**template_id** | **str** | Optional: SFTP or SMB mapping record. | [optional] 
**value** | **str** | SFTP or SMB value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_integration_parameter import Schedulerv3IntegrationParameter

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3IntegrationParameter from a JSON string
schedulerv3_integration_parameter_instance = Schedulerv3IntegrationParameter.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3IntegrationParameter.to_json())

# convert the object into a dict
schedulerv3_integration_parameter_dict = schedulerv3_integration_parameter_instance.to_dict()
# create an instance of Schedulerv3IntegrationParameter from a dict
schedulerv3_integration_parameter_from_dict = Schedulerv3IntegrationParameter.from_dict(schedulerv3_integration_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


