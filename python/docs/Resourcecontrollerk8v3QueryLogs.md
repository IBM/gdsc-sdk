# Resourcecontrollerk8v3QueryLogs


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_date** | **str** | The end date (ms since epoch) to limit logs to. | [optional] 
**previous** | **bool** | True if the logs for the previous container instance should be retrieved, false otherwise. | [optional] 
**start_date** | **str** | The start date (ms since epoch) to limit logs to. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_query_logs import Resourcecontrollerk8v3QueryLogs

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3QueryLogs from a JSON string
resourcecontrollerk8v3_query_logs_instance = Resourcecontrollerk8v3QueryLogs.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3QueryLogs.to_json())

# convert the object into a dict
resourcecontrollerk8v3_query_logs_dict = resourcecontrollerk8v3_query_logs_instance.to_dict()
# create an instance of Resourcecontrollerk8v3QueryLogs from a dict
resourcecontrollerk8v3_query_logs_from_dict = Resourcecontrollerk8v3QueryLogs.from_dict(resourcecontrollerk8v3_query_logs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


