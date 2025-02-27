# Ecosystemv3DatasetDetail

DatasetDetail provides the detail of the definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | [**List[Ecosystemv3ColumnDefinition]**](Ecosystemv3ColumnDefinition.md) | Columns of the definition. | [optional] 
**data_count** | **int** | Row count on a dataset. | [optional] 
**dataset_name** | **str** | The name of the definition. | [optional] 
**description** | **str** | Description in detail. | [optional] 
**editable** | **bool** | Can this data set schema be edited. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.ecosystemv3_dataset_detail import Ecosystemv3DatasetDetail

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3DatasetDetail from a JSON string
ecosystemv3_dataset_detail_instance = Ecosystemv3DatasetDetail.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3DatasetDetail.to_json())

# convert the object into a dict
ecosystemv3_dataset_detail_dict = ecosystemv3_dataset_detail_instance.to_dict()
# create an instance of Ecosystemv3DatasetDetail from a dict
ecosystemv3_dataset_detail_from_dict = Ecosystemv3DatasetDetail.from_dict(ecosystemv3_dataset_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


