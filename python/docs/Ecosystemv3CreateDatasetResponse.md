# Ecosystemv3CreateDatasetResponse

Save result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.ecosystemv3_create_dataset_response import Ecosystemv3CreateDatasetResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3CreateDatasetResponse from a JSON string
ecosystemv3_create_dataset_response_instance = Ecosystemv3CreateDatasetResponse.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3CreateDatasetResponse.to_json())

# convert the object into a dict
ecosystemv3_create_dataset_response_dict = ecosystemv3_create_dataset_response_instance.to_dict()
# create an instance of Ecosystemv3CreateDatasetResponse from a dict
ecosystemv3_create_dataset_response_from_dict = Ecosystemv3CreateDatasetResponse.from_dict(ecosystemv3_create_dataset_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


