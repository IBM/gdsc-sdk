# Ecosystemv3DataInsertResponse

Returns inserted record count.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entries_inserted** | **int** | Number of entries inserted. | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.ecosystemv3_data_insert_response import Ecosystemv3DataInsertResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3DataInsertResponse from a JSON string
ecosystemv3_data_insert_response_instance = Ecosystemv3DataInsertResponse.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3DataInsertResponse.to_json())

# convert the object into a dict
ecosystemv3_data_insert_response_dict = ecosystemv3_data_insert_response_instance.to_dict()
# create an instance of Ecosystemv3DataInsertResponse from a dict
ecosystemv3_data_insert_response_from_dict = Ecosystemv3DataInsertResponse.from_dict(ecosystemv3_data_insert_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


