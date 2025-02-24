# Healthcollectorv3UtilizationParameterObject

UnitUtilizationParameterObject gets information about unit utilization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analyzer_queue_value** | **int** | Analyzer queue value. | [optional] 
**detailed_err_message** | **str** | Detailed error message. | [optional] 
**error** | **int** | Error message. | [optional] 
**free_buffer_space_value** | **int** | Free buffer space value. | [optional] 
**logger_queue_value** | **int** | Logger queue value. | [optional] 
**mysql_disk_usage_value** | **int** | MySQL Disk usage. | [optional] 
**no_of_exceptions_value** | **int** | Number of exceptions. | [optional] 
**no_of_flat_log_requests_value** | **int** | Flat log requests value. | [optional] 
**no_of_policy_violations_value** | **int** | Number of policy violations. | [optional] 
**no_of_requests_value** | **int** | Number of requests. | [optional] 
**no_of_restarts_value** | **int** | Number of restarts. | [optional] 
**prec_mysql_memory_value** | **int** | MySQL memory value. | [optional] 
**sniffer_memory_value** | **int** | Sniffer memory value. | [optional] 
**system_cpu_load_value** | **int** | CPU load value. | [optional] 
**system_var_disk_usage_value** | **int** | System var disk usage value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_utilization_parameter_object import Healthcollectorv3UtilizationParameterObject

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3UtilizationParameterObject from a JSON string
healthcollectorv3_utilization_parameter_object_instance = Healthcollectorv3UtilizationParameterObject.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3UtilizationParameterObject.to_json())

# convert the object into a dict
healthcollectorv3_utilization_parameter_object_dict = healthcollectorv3_utilization_parameter_object_instance.to_dict()
# create an instance of Healthcollectorv3UtilizationParameterObject from a dict
healthcollectorv3_utilization_parameter_object_from_dict = Healthcollectorv3UtilizationParameterObject.from_dict(healthcollectorv3_utilization_parameter_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


