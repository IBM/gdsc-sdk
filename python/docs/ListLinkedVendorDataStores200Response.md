# ListLinkedVendorDataStores200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[VendorDataStore]**](VendorDataStore.md) |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.list_linked_vendor_data_stores200_response import ListLinkedVendorDataStores200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ListLinkedVendorDataStores200Response from a JSON string
list_linked_vendor_data_stores200_response_instance = ListLinkedVendorDataStores200Response.from_json(json)
# print the JSON string representation of the object
print(ListLinkedVendorDataStores200Response.to_json())

# convert the object into a dict
list_linked_vendor_data_stores200_response_dict = list_linked_vendor_data_stores200_response_instance.to_dict()
# create an instance of ListLinkedVendorDataStores200Response from a dict
list_linked_vendor_data_stores200_response_from_dict = ListLinkedVendorDataStores200Response.from_dict(list_linked_vendor_data_stores200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


