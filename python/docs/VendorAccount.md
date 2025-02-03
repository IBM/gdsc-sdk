# VendorAccount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vendor_account_id** | **str** | The Cloud account ID | 
**vendor_account_name** | **str** | The Cloud account name (as was onboarded to Polar) | 
**cloud_provider** | [**CloudServiceProvider**](CloudServiceProvider.md) |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.vendor_account import VendorAccount

# TODO update the JSON string below
json = "{}"
# create an instance of VendorAccount from a JSON string
vendor_account_instance = VendorAccount.from_json(json)
# print the JSON string representation of the object
print(VendorAccount.to_json())

# convert the object into a dict
vendor_account_dict = vendor_account_instance.to_dict()
# create an instance of VendorAccount from a dict
vendor_account_from_dict = VendorAccount.from_dict(vendor_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


