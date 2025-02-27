# Ecosystemv3GetDatasetDetailResponse

GetDatasetDetailResponse returns the detail on a definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detail** | [**Ecosystemv3DatasetDetail**](Ecosystemv3DatasetDetail.md) |  | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.ecosystemv3_get_dataset_detail_response import Ecosystemv3GetDatasetDetailResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3GetDatasetDetailResponse from a JSON string
ecosystemv3_get_dataset_detail_response_instance = Ecosystemv3GetDatasetDetailResponse.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3GetDatasetDetailResponse.to_json())

# convert the object into a dict
ecosystemv3_get_dataset_detail_response_dict = ecosystemv3_get_dataset_detail_response_instance.to_dict()
# create an instance of Ecosystemv3GetDatasetDetailResponse from a dict
ecosystemv3_get_dataset_detail_response_from_dict = Ecosystemv3GetDatasetDetailResponse.from_dict(ecosystemv3_get_dataset_detail_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


