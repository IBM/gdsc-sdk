# Healthcollectorv3UtilizationParameterObjectGdp

UnitUtilizationParameterObject gets information about unit utilization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analyzer_queue_value** | **int** | Analyzer queue value. | [optional] 
**error_messages_code** | **int** | Error message. | [optional] 
**error_messages_value** | **str** | Detailed error message. | [optional] 
**free_buff_space_value** | **int** | Free buffer space value. | [optional] 
**logger_queue_value** | **int** | Logger queue value. | [optional] 
**mysql_disk_usage_value** | **int** | MySQL Disk usage. | [optional] 
**no_of_restarts_value** | **int** | Number of restarts. | [optional] 
**num_of_exceptions_value** | **int** | Number of exceptions. | [optional] 
**num_of_flat_log_requests_value** | **int** | Flat log requests value. | [optional] 
**num_of_policy_violations_value** | **int** | Number of policy violations. | [optional] 
**num_of_requests_value** | **int** | Number of requests. | [optional] 
**prec_mysql_mem_value** | **int** | MySQL memory value. | [optional] 
**snif_memory_value** | **int** | Sniffer memory value. | [optional] 
**sys_var_disk_usage_value** | **int** | System var disk usage value. | [optional] 
**system_cpu_load_value** | **int** | CPU load value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_utilization_parameter_object_gdp import Healthcollectorv3UtilizationParameterObjectGdp

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3UtilizationParameterObjectGdp from a JSON string
healthcollectorv3_utilization_parameter_object_gdp_instance = Healthcollectorv3UtilizationParameterObjectGdp.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3UtilizationParameterObjectGdp.to_json())

# convert the object into a dict
healthcollectorv3_utilization_parameter_object_gdp_dict = healthcollectorv3_utilization_parameter_object_gdp_instance.to_dict()
# create an instance of Healthcollectorv3UtilizationParameterObjectGdp from a dict
healthcollectorv3_utilization_parameter_object_gdp_from_dict = Healthcollectorv3UtilizationParameterObjectGdp.from_dict(healthcollectorv3_utilization_parameter_object_gdp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


