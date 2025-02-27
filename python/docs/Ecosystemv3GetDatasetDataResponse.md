# Ecosystemv3GetDatasetDataResponse

GetDatasetDataResponse returns the data report on a dataset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**record_count** | **int** | Total number of records associated with the filter. | [optional] 
**report_result** | [**Workflowv3ReportResult**](Workflowv3ReportResult.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.ecosystemv3_get_dataset_data_response import Ecosystemv3GetDatasetDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3GetDatasetDataResponse from a JSON string
ecosystemv3_get_dataset_data_response_instance = Ecosystemv3GetDatasetDataResponse.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3GetDatasetDataResponse.to_json())

# convert the object into a dict
ecosystemv3_get_dataset_data_response_dict = ecosystemv3_get_dataset_data_response_instance.to_dict()
# create an instance of Ecosystemv3GetDatasetDataResponse from a dict
ecosystemv3_get_dataset_data_response_from_dict = Ecosystemv3GetDatasetDataResponse.from_dict(ecosystemv3_get_dataset_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


