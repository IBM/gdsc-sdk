# ListVendorDataStoresFilterParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_account_id** | **str** | The customer cloud account ID | [optional] 
**data_store_id** | **str** |  | [optional] 
**data_store_type** | **str** |  | [optional] 
**data_store_name** | **str** |  | [optional] 
**cloud_region** | **str** |  | [optional] 
**cloud_provider** | [**CloudServiceProvider**](CloudServiceProvider.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.list_vendor_data_stores_filter_parameter import ListVendorDataStoresFilterParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListVendorDataStoresFilterParameter from a JSON string
list_vendor_data_stores_filter_parameter_instance = ListVendorDataStoresFilterParameter.from_json(json)
# print the JSON string representation of the object
print(ListVendorDataStoresFilterParameter.to_json())

# convert the object into a dict
list_vendor_data_stores_filter_parameter_dict = list_vendor_data_stores_filter_parameter_instance.to_dict()
# create an instance of ListVendorDataStoresFilterParameter from a dict
list_vendor_data_stores_filter_parameter_from_dict = ListVendorDataStoresFilterParameter.from_dict(list_vendor_data_stores_filter_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


