# Reportsrunnerv3StopQueryRequest

StopQueryRequest is the argument type of the StopQuery API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query_ids** | **List[str]** | Token that identifies the query. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_stop_query_request import Reportsrunnerv3StopQueryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3StopQueryRequest from a JSON string
reportsrunnerv3_stop_query_request_instance = Reportsrunnerv3StopQueryRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3StopQueryRequest.to_json())

# convert the object into a dict
reportsrunnerv3_stop_query_request_dict = reportsrunnerv3_stop_query_request_instance.to_dict()
# create an instance of Reportsrunnerv3StopQueryRequest from a dict
reportsrunnerv3_stop_query_request_from_dict = Reportsrunnerv3StopQueryRequest.from_dict(reportsrunnerv3_stop_query_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


