# VendorDataStore


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_store_id** | **str** |  | 
**data_store_type** | **str** |  | 
**data_store_name** | **str** |  | 
**cloud_region** | **str** |  | 
**sensitivities_summary** | [**List[SensitivitySummary]**](SensitivitySummary.md) |  | 
**cloud_provider** | [**CloudServiceProvider**](CloudServiceProvider.md) |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.vendor_data_store import VendorDataStore

# TODO update the JSON string below
json = "{}"
# create an instance of VendorDataStore from a JSON string
vendor_data_store_instance = VendorDataStore.from_json(json)
# print the JSON string representation of the object
print(VendorDataStore.to_json())

# convert the object into a dict
vendor_data_store_dict = vendor_data_store_instance.to_dict()
# create an instance of VendorDataStore from a dict
vendor_data_store_from_dict = VendorDataStore.from_dict(vendor_data_store_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


