# Ecosystemv3DatasetsFilter

DatasetsFilter includes all fields used to filter the set of desired datasets list returned by a GET request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataset_names** | **List[str]** | The state filter groups commonly paired states. Only returns records that include the specified names. | [optional] 
**end_time** | **datetime** | Return datasets created before this time (&lt;). | [optional] 
**start_time** | **datetime** | Return datasets created at this time or later (&gt;&#x3D;). | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.ecosystemv3_datasets_filter import Ecosystemv3DatasetsFilter

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3DatasetsFilter from a JSON string
ecosystemv3_datasets_filter_instance = Ecosystemv3DatasetsFilter.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3DatasetsFilter.to_json())

# convert the object into a dict
ecosystemv3_datasets_filter_dict = ecosystemv3_datasets_filter_instance.to_dict()
# create an instance of Ecosystemv3DatasetsFilter from a dict
ecosystemv3_datasets_filter_from_dict = Ecosystemv3DatasetsFilter.from_dict(ecosystemv3_datasets_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


