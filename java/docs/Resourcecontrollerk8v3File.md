

# Resourcecontrollerk8v3File

File Contains the information about a file.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** | The text content of the file. |  [optional] |
|**created** | **String** | Optional: The date this file was created (ms since epoch). |  [optional] |
|**description** | [**Resourcecontrollerk8v3TextContent**](Resourcecontrollerk8v3TextContent.md) |  |  [optional] |
|**id** | **String** | Optional: The internal ID of the file. |  [optional] |
|**modified** | **String** | Optional: The date this file was modified (ms since epoch). |  [optional] |
|**name** | **String** | The name of the file with pattern \&quot;^[a-zA-Z0-9-_.]+$\&quot;. |  [optional] |
|**path** | **String** | The path to the file, due to the limitation of the database, the length of path + name must be less than 2668 characters. |  [optional] |
|**type** | **String** | The type of the file (only used to provide an editor). |  [optional] |



