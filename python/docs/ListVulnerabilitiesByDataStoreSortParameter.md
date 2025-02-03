# ListVulnerabilitiesByDataStoreSortParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sort_by** | **str** |  | 
**sort_order** | [**SortOrder**](SortOrder.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.list_vulnerabilities_by_data_store_sort_parameter import ListVulnerabilitiesByDataStoreSortParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListVulnerabilitiesByDataStoreSortParameter from a JSON string
list_vulnerabilities_by_data_store_sort_parameter_instance = ListVulnerabilitiesByDataStoreSortParameter.from_json(json)
# print the JSON string representation of the object
print(ListVulnerabilitiesByDataStoreSortParameter.to_json())

# convert the object into a dict
list_vulnerabilities_by_data_store_sort_parameter_dict = list_vulnerabilities_by_data_store_sort_parameter_instance.to_dict()
# create an instance of ListVulnerabilitiesByDataStoreSortParameter from a dict
list_vulnerabilities_by_data_store_sort_parameter_from_dict = ListVulnerabilitiesByDataStoreSortParameter.from_dict(list_vulnerabilities_by_data_store_sort_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


