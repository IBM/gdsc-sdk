# Reportsrunnerv3StopQueryResponse

StopQueryResponse is the response of the StopQuery API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_success** | **Dict[str, bool]** |  | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_stop_query_response import Reportsrunnerv3StopQueryResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3StopQueryResponse from a JSON string
reportsrunnerv3_stop_query_response_instance = Reportsrunnerv3StopQueryResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3StopQueryResponse.to_json())

# convert the object into a dict
reportsrunnerv3_stop_query_response_dict = reportsrunnerv3_stop_query_response_instance.to_dict()
# create an instance of Reportsrunnerv3StopQueryResponse from a dict
reportsrunnerv3_stop_query_response_from_dict = Reportsrunnerv3StopQueryResponse.from_dict(reportsrunnerv3_stop_query_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


