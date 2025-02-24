# Qspmpolicymanagerv3FetchObjectStoreFileResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucket_name** | **str** |  | [optional] 
**file_name** | [**Qspmpolicymanagerv3FileName**](Qspmpolicymanagerv3FileName.md) |  | [optional] 
**folder_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_fetch_object_store_file_response import Qspmpolicymanagerv3FetchObjectStoreFileResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmpolicymanagerv3FetchObjectStoreFileResponse from a JSON string
qspmpolicymanagerv3_fetch_object_store_file_response_instance = Qspmpolicymanagerv3FetchObjectStoreFileResponse.from_json(json)
# print the JSON string representation of the object
print(Qspmpolicymanagerv3FetchObjectStoreFileResponse.to_json())

# convert the object into a dict
qspmpolicymanagerv3_fetch_object_store_file_response_dict = qspmpolicymanagerv3_fetch_object_store_file_response_instance.to_dict()
# create an instance of Qspmpolicymanagerv3FetchObjectStoreFileResponse from a dict
qspmpolicymanagerv3_fetch_object_store_file_response_from_dict = Qspmpolicymanagerv3FetchObjectStoreFileResponse.from_dict(qspmpolicymanagerv3_fetch_object_store_file_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


