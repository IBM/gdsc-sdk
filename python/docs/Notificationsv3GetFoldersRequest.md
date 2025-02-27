# Notificationsv3GetFoldersRequest

Get folders from the integratioin provided. The configuration properties vary by integration and must match the required content.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**folder_name** | **str** | The folder_name field is provided to fetch all folders in the folder_name provided. | [optional] 
**integration_id** | **str** | The integration id to get the folders for. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_get_folders_request import Notificationsv3GetFoldersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3GetFoldersRequest from a JSON string
notificationsv3_get_folders_request_instance = Notificationsv3GetFoldersRequest.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3GetFoldersRequest.to_json())

# convert the object into a dict
notificationsv3_get_folders_request_dict = notificationsv3_get_folders_request_instance.to_dict()
# create an instance of Notificationsv3GetFoldersRequest from a dict
notificationsv3_get_folders_request_from_dict = Notificationsv3GetFoldersRequest.from_dict(notificationsv3_get_folders_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


