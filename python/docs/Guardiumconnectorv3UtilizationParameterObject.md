# Guardiumconnectorv3UtilizationParameterObject

Information about unit utilization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analyzer_queue_value** | **int** | Analyzer queue value. | [optional] 
**detailed_err_message** | **str** | Detailed error message. | [optional] 
**error** | **int** | Error message. | [optional] 
**free_buff_space_value** | **int** | Free buffer space value. | [optional] 
**logger_queue_value** | **int** | Logger queue value. | [optional] 
**mysql_disk_usage_value** | **int** | MySQL disk usage. | [optional] 
**no_of_restarts_value** | **int** | Number of restarts. | [optional] 
**num_of_exceptions_value** | **int** | Number of excpetions. | [optional] 
**num_of_flat_log_requests_value** | **int** | Flat log requests value. | [optional] 
**num_of_policy_violations_value** | **int** | Number of policy violations. | [optional] 
**num_of_requests_value** | **int** | Number of requests. | [optional] 
**prec_mysql_mem_value** | **int** | MySQL memory value. | [optional] 
**snif_memory_value** | **int** | Sniffer memory value. | [optional] 
**sys_var_disk_usage_value** | **int** | System var disk usage value. | [optional] 
**system_cpu_load_value** | **int** | CPU load value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_utilization_parameter_object import Guardiumconnectorv3UtilizationParameterObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3UtilizationParameterObject from a JSON string
guardiumconnectorv3_utilization_parameter_object_instance = Guardiumconnectorv3UtilizationParameterObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3UtilizationParameterObject.to_json())

# convert the object into a dict
guardiumconnectorv3_utilization_parameter_object_dict = guardiumconnectorv3_utilization_parameter_object_instance.to_dict()
# create an instance of Guardiumconnectorv3UtilizationParameterObject from a dict
guardiumconnectorv3_utilization_parameter_object_from_dict = Guardiumconnectorv3UtilizationParameterObject.from_dict(guardiumconnectorv3_utilization_parameter_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


