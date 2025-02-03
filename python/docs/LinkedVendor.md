# LinkedVendor


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vendor** | [**Vendor**](Vendor.md) |  | 
**total_accounts** | **float** |  | 
**is_sensitive** | **bool** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.linked_vendor import LinkedVendor

# TODO update the JSON string below
json = "{}"
# create an instance of LinkedVendor from a JSON string
linked_vendor_instance = LinkedVendor.from_json(json)
# print the JSON string representation of the object
print(LinkedVendor.to_json())

# convert the object into a dict
linked_vendor_dict = linked_vendor_instance.to_dict()
# create an instance of LinkedVendor from a dict
linked_vendor_from_dict = LinkedVendor.from_dict(linked_vendor_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


