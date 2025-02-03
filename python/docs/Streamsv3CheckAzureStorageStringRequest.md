# Streamsv3CheckAzureStorageStringRequest

CheckAzureStorageStringRequest defines a request to verify Azure storage connection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connection_string** | **str** | Storage connection string. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.streamsv3_check_azure_storage_string_request import Streamsv3CheckAzureStorageStringRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Streamsv3CheckAzureStorageStringRequest from a JSON string
streamsv3_check_azure_storage_string_request_instance = Streamsv3CheckAzureStorageStringRequest.from_json(json)
# print the JSON string representation of the object
print(Streamsv3CheckAzureStorageStringRequest.to_json())

# convert the object into a dict
streamsv3_check_azure_storage_string_request_dict = streamsv3_check_azure_storage_string_request_instance.to_dict()
# create an instance of Streamsv3CheckAzureStorageStringRequest from a dict
streamsv3_check_azure_storage_string_request_from_dict = Streamsv3CheckAzureStorageStringRequest.from_dict(streamsv3_check_azure_storage_string_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


