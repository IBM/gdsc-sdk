# ListVulnerabilitiesSortParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sort_by** | **str** |  | 
**sort_order** | [**SortOrder**](SortOrder.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.list_vulnerabilities_sort_parameter import ListVulnerabilitiesSortParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListVulnerabilitiesSortParameter from a JSON string
list_vulnerabilities_sort_parameter_instance = ListVulnerabilitiesSortParameter.from_json(json)
# print the JSON string representation of the object
print(ListVulnerabilitiesSortParameter.to_json())

# convert the object into a dict
list_vulnerabilities_sort_parameter_dict = list_vulnerabilities_sort_parameter_instance.to_dict()
# create an instance of ListVulnerabilitiesSortParameter from a dict
list_vulnerabilities_sort_parameter_from_dict = ListVulnerabilitiesSortParameter.from_dict(list_vulnerabilities_sort_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


