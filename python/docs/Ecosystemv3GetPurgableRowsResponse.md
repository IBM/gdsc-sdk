# Ecosystemv3GetPurgableRowsResponse

Returns the number of rows that can be purged.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purgable_rows** | **int** | Number of rows that can be purged. | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.ecosystemv3_get_purgable_rows_response import Ecosystemv3GetPurgableRowsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3GetPurgableRowsResponse from a JSON string
ecosystemv3_get_purgable_rows_response_instance = Ecosystemv3GetPurgableRowsResponse.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3GetPurgableRowsResponse.to_json())

# convert the object into a dict
ecosystemv3_get_purgable_rows_response_dict = ecosystemv3_get_purgable_rows_response_instance.to_dict()
# create an instance of Ecosystemv3GetPurgableRowsResponse from a dict
ecosystemv3_get_purgable_rows_response_from_dict = Ecosystemv3GetPurgableRowsResponse.from_dict(ecosystemv3_get_purgable_rows_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


