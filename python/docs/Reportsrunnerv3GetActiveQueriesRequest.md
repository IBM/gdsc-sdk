# Reportsrunnerv3GetActiveQueriesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**elapsed_time** | **int** |  | [optional] 
**type** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_get_active_queries_request import Reportsrunnerv3GetActiveQueriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3GetActiveQueriesRequest from a JSON string
reportsrunnerv3_get_active_queries_request_instance = Reportsrunnerv3GetActiveQueriesRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3GetActiveQueriesRequest.to_json())

# convert the object into a dict
reportsrunnerv3_get_active_queries_request_dict = reportsrunnerv3_get_active_queries_request_instance.to_dict()
# create an instance of Reportsrunnerv3GetActiveQueriesRequest from a dict
reportsrunnerv3_get_active_queries_request_from_dict = Reportsrunnerv3GetActiveQueriesRequest.from_dict(reportsrunnerv3_get_active_queries_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


