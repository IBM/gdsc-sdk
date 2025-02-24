# ListLinkedVendorDataStoresSortParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sort_by** | **str** |  | 
**sort_order** | [**SortOrder**](SortOrder.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.list_linked_vendor_data_stores_sort_parameter import ListLinkedVendorDataStoresSortParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListLinkedVendorDataStoresSortParameter from a JSON string
list_linked_vendor_data_stores_sort_parameter_instance = ListLinkedVendorDataStoresSortParameter.from_json(json)
# print the JSON string representation of the object
print(ListLinkedVendorDataStoresSortParameter.to_json())

# convert the object into a dict
list_linked_vendor_data_stores_sort_parameter_dict = list_linked_vendor_data_stores_sort_parameter_instance.to_dict()
# create an instance of ListLinkedVendorDataStoresSortParameter from a dict
list_linked_vendor_data_stores_sort_parameter_from_dict = ListLinkedVendorDataStoresSortParameter.from_dict(list_linked_vendor_data_stores_sort_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


