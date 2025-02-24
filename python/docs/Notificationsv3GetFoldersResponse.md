# Notificationsv3GetFoldersResponse

Response from test of an SMTP configuration.  A translated response is provided to provide status of the test.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**folders** | **List[str]** | The folders retrieved is returned here as an array of name strings. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_get_folders_response import Notificationsv3GetFoldersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3GetFoldersResponse from a JSON string
notificationsv3_get_folders_response_instance = Notificationsv3GetFoldersResponse.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3GetFoldersResponse.to_json())

# convert the object into a dict
notificationsv3_get_folders_response_dict = notificationsv3_get_folders_response_instance.to_dict()
# create an instance of Notificationsv3GetFoldersResponse from a dict
notificationsv3_get_folders_response_from_dict = Notificationsv3GetFoldersResponse.from_dict(notificationsv3_get_folders_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


