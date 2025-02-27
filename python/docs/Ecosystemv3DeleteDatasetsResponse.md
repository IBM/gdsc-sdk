# Ecosystemv3DeleteDatasetsResponse

DeleteDatasetResponse message as the response for deleting a dataset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.ecosystemv3_delete_datasets_response import Ecosystemv3DeleteDatasetsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3DeleteDatasetsResponse from a JSON string
ecosystemv3_delete_datasets_response_instance = Ecosystemv3DeleteDatasetsResponse.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3DeleteDatasetsResponse.to_json())

# convert the object into a dict
ecosystemv3_delete_datasets_response_dict = ecosystemv3_delete_datasets_response_instance.to_dict()
# create an instance of Ecosystemv3DeleteDatasetsResponse from a dict
ecosystemv3_delete_datasets_response_from_dict = Ecosystemv3DeleteDatasetsResponse.from_dict(ecosystemv3_delete_datasets_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


