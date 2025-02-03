# Vendor


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vendor_id** | **str** | The 3rd party vendor unique ID | 
**vendor_name** | **str** | The 3rd party vendor name (Company name) | 
**vendor_url** | **str** | The 3rd party company website URL | [optional] 
**description** | **str** | Short description of the 3rd party vendor | 
**accounts** | [**List[VendorAccount]**](VendorAccount.md) |  | [optional] 
**certificates** | [**List[VendorCertificate]**](VendorCertificate.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.vendor import Vendor

# TODO update the JSON string below
json = "{}"
# create an instance of Vendor from a JSON string
vendor_instance = Vendor.from_json(json)
# print the JSON string representation of the object
print(Vendor.to_json())

# convert the object into a dict
vendor_dict = vendor_instance.to_dict()
# create an instance of Vendor from a dict
vendor_from_dict = Vendor.from_dict(vendor_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


