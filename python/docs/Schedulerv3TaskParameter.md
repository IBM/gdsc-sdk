# Schedulerv3TaskParameter

TaskParameter includes all the parameters needed to run a job, add different job runtime parameters here.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_import_parameter** | [**Schedulerv3IntegrationParameter**](Schedulerv3IntegrationParameter.md) |  | [optional] 
**report_parameter** | [**Schedulerv3ReportParameter**](Schedulerv3ReportParameter.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_task_parameter import Schedulerv3TaskParameter

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3TaskParameter from a JSON string
schedulerv3_task_parameter_instance = Schedulerv3TaskParameter.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3TaskParameter.to_json())

# convert the object into a dict
schedulerv3_task_parameter_dict = schedulerv3_task_parameter_instance.to_dict()
# create an instance of Schedulerv3TaskParameter from a dict
schedulerv3_task_parameter_from_dict = Schedulerv3TaskParameter.from_dict(schedulerv3_task_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


