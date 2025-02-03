# Streamsv3CheckAzureStorageStringResponse

CheckAzureStorageStringResponse defines response of CheckAzureStorageStringRequest call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Streamsv3AzureCheckStatus**](Streamsv3AzureCheckStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.streamsv3_check_azure_storage_string_response import Streamsv3CheckAzureStorageStringResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Streamsv3CheckAzureStorageStringResponse from a JSON string
streamsv3_check_azure_storage_string_response_instance = Streamsv3CheckAzureStorageStringResponse.from_json(json)
# print the JSON string representation of the object
print(Streamsv3CheckAzureStorageStringResponse.to_json())

# convert the object into a dict
streamsv3_check_azure_storage_string_response_dict = streamsv3_check_azure_storage_string_response_instance.to_dict()
# create an instance of Streamsv3CheckAzureStorageStringResponse from a dict
streamsv3_check_azure_storage_string_response_from_dict = Streamsv3CheckAzureStorageStringResponse.from_dict(streamsv3_check_azure_storage_string_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


