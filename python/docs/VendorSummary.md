# VendorSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_account_details** | [**CloudAccountDetails**](CloudAccountDetails.md) |  | 
**sensitivities_summary** | [**List[SensitivitySummary]**](SensitivitySummary.md) |  | 
**cloud_provider** | [**CloudServiceProvider**](CloudServiceProvider.md) |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.vendor_summary import VendorSummary

# TODO update the JSON string below
json = "{}"
# create an instance of VendorSummary from a JSON string
vendor_summary_instance = VendorSummary.from_json(json)
# print the JSON string representation of the object
print(VendorSummary.to_json())

# convert the object into a dict
vendor_summary_dict = vendor_summary_instance.to_dict()
# create an instance of VendorSummary from a dict
vendor_summary_from_dict = VendorSummary.from_dict(vendor_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


