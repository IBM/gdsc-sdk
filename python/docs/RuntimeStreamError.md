# RuntimeStreamError


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**details** | [**List[ProtobufAny]**](ProtobufAny.md) |  | [optional] 
**grpc_code** | **int** |  | [optional] 
**http_code** | **int** |  | [optional] 
**http_status** | **str** |  | [optional] 
**message** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.runtime_stream_error import RuntimeStreamError

# TODO update the JSON string below
json = "{}"
# create an instance of RuntimeStreamError from a JSON string
runtime_stream_error_instance = RuntimeStreamError.from_json(json)
# print the JSON string representation of the object
print(RuntimeStreamError.to_json())

# convert the object into a dict
runtime_stream_error_dict = runtime_stream_error_instance.to_dict()
# create an instance of RuntimeStreamError from a dict
runtime_stream_error_from_dict = RuntimeStreamError.from_dict(runtime_stream_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


