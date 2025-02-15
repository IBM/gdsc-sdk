# Resourcecontrollerk8v3QueryControllerLogsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controller_id** | **str** | The ID of the controller to get logs for. | [optional] 
**query_logs** | [**Resourcecontrollerk8v3QueryLogs**](Resourcecontrollerk8v3QueryLogs.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_query_controller_logs_request import Resourcecontrollerk8v3QueryControllerLogsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3QueryControllerLogsRequest from a JSON string
resourcecontrollerk8v3_query_controller_logs_request_instance = Resourcecontrollerk8v3QueryControllerLogsRequest.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3QueryControllerLogsRequest.to_json())

# convert the object into a dict
resourcecontrollerk8v3_query_controller_logs_request_dict = resourcecontrollerk8v3_query_controller_logs_request_instance.to_dict()
# create an instance of Resourcecontrollerk8v3QueryControllerLogsRequest from a dict
resourcecontrollerk8v3_query_controller_logs_request_from_dict = Resourcecontrollerk8v3QueryControllerLogsRequest.from_dict(resourcecontrollerk8v3_query_controller_logs_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


