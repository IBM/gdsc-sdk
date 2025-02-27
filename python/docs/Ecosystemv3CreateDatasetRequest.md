# Ecosystemv3CreateDatasetRequest

All the details to save a dataset definition into the database.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detail** | [**Ecosystemv3DatasetDetail**](Ecosystemv3DatasetDetail.md) |  | [optional] 
**is_new** | **bool** | If it is a new dataset or existing one. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.ecosystemv3_create_dataset_request import Ecosystemv3CreateDatasetRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3CreateDatasetRequest from a JSON string
ecosystemv3_create_dataset_request_instance = Ecosystemv3CreateDatasetRequest.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3CreateDatasetRequest.to_json())

# convert the object into a dict
ecosystemv3_create_dataset_request_dict = ecosystemv3_create_dataset_request_instance.to_dict()
# create an instance of Ecosystemv3CreateDatasetRequest from a dict
ecosystemv3_create_dataset_request_from_dict = Ecosystemv3CreateDatasetRequest.from_dict(ecosystemv3_create_dataset_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


