# ListDataStoresSortParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sort_by** | **str** |  | 
**sort_order** | [**SortOrder**](SortOrder.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.list_data_stores_sort_parameter import ListDataStoresSortParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListDataStoresSortParameter from a JSON string
list_data_stores_sort_parameter_instance = ListDataStoresSortParameter.from_json(json)
# print the JSON string representation of the object
print(ListDataStoresSortParameter.to_json())

# convert the object into a dict
list_data_stores_sort_parameter_dict = list_data_stores_sort_parameter_instance.to_dict()
# create an instance of ListDataStoresSortParameter from a dict
list_data_stores_sort_parameter_from_dict = ListDataStoresSortParameter.from_dict(list_data_stores_sort_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


