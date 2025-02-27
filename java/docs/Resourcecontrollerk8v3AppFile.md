

# Resourcecontrollerk8v3AppFile

AppFile contains the information about an app file.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **String** | Optional: The internal ID of the app for the file. |  [optional] |
|**content** | **String** | The text content of the app file. |  [optional] |
|**created** | **String** | Optional: The date this app file was created (ms since epoch). |  [optional] |
|**description** | [**Resourcecontrollerk8v3TextContent**](Resourcecontrollerk8v3TextContent.md) |  |  [optional] |
|**id** | **String** | Optional: The internal ID of the app file. |  [optional] |
|**mimeType** | **String** | The mime type of the app file (only used to provide an editor). |  [optional] |
|**modified** | **String** | Optional: The date this app file was modified (ms since epoch). |  [optional] |
|**name** | **String** | The name of the app file. |  [optional] |
|**path** | **String** | The path to the file for the app. |  [optional] |
|**restartApp** | **Boolean** | True if the app should be restarted when updating this file, false otherwise. |  [optional] |



