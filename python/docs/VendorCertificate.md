# VendorCertificate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_name** | **str** | The vendor certificate | 

## Example

```python
from ibm_gdsc_sdk_software.models.vendor_certificate import VendorCertificate

# TODO update the JSON string below
json = "{}"
# create an instance of VendorCertificate from a JSON string
vendor_certificate_instance = VendorCertificate.from_json(json)
# print the JSON string representation of the object
print(VendorCertificate.to_json())

# convert the object into a dict
vendor_certificate_dict = vendor_certificate_instance.to_dict()
# create an instance of VendorCertificate from a dict
vendor_certificate_from_dict = VendorCertificate.from_dict(vendor_certificate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


