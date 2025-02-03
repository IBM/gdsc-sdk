# RescanDataStoreRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_store_id** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.rescan_data_store_request import RescanDataStoreRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RescanDataStoreRequest from a JSON string
rescan_data_store_request_instance = RescanDataStoreRequest.from_json(json)
# print the JSON string representation of the object
print(RescanDataStoreRequest.to_json())

# convert the object into a dict
rescan_data_store_request_dict = rescan_data_store_request_instance.to_dict()
# create an instance of RescanDataStoreRequest from a dict
rescan_data_store_request_from_dict = RescanDataStoreRequest.from_dict(rescan_data_store_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


