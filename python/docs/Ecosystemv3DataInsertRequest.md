# Ecosystemv3DataInsertRequest

Requires dataset name, fields and data to be inserted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataset_name** | **str** | Data set target name. | [optional] 
**entries** | [**List[Ecosystemv3DataEntry]**](Ecosystemv3DataEntry.md) | Data set entries to insert. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.ecosystemv3_data_insert_request import Ecosystemv3DataInsertRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3DataInsertRequest from a JSON string
ecosystemv3_data_insert_request_instance = Ecosystemv3DataInsertRequest.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3DataInsertRequest.to_json())

# convert the object into a dict
ecosystemv3_data_insert_request_dict = ecosystemv3_data_insert_request_instance.to_dict()
# create an instance of Ecosystemv3DataInsertRequest from a dict
ecosystemv3_data_insert_request_from_dict = Ecosystemv3DataInsertRequest.from_dict(ecosystemv3_data_insert_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


