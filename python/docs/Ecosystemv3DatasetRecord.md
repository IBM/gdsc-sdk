# Ecosystemv3DatasetRecord

A dataset record indicates the dataset name and creation time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_time** | **datetime** | The time the dataset definition was created. | [optional] 
**data_count** | **int** | Row count on a dataset. | [optional] 
**dataset_name** | **str** | Dataset name, unique,  \&quot;\&quot; for new records, required for update. | [optional] 
**editable** | **bool** | Can this data set schema be edited. | [optional] 
**last_updated** | **datetime** | The last time the data is updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.ecosystemv3_dataset_record import Ecosystemv3DatasetRecord

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3DatasetRecord from a JSON string
ecosystemv3_dataset_record_instance = Ecosystemv3DatasetRecord.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3DatasetRecord.to_json())

# convert the object into a dict
ecosystemv3_dataset_record_dict = ecosystemv3_dataset_record_instance.to_dict()
# create an instance of Ecosystemv3DatasetRecord from a dict
ecosystemv3_dataset_record_from_dict = Ecosystemv3DatasetRecord.from_dict(ecosystemv3_dataset_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


