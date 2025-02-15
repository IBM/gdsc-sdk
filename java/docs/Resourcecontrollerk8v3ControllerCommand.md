

# Resourcecontrollerk8v3ControllerCommand

Contains the command information to be executed by a controller.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**args** | **Object** | The command arguments. |  [optional] |
|**created** | **String** | The date this command was created (ms since epoch). |  [optional] |
|**id** | **String** | The ID of the command. |  [optional] |
|**modified** | **String** | The date this command was modified (ms since epoch). |  [optional] |
|**result** | **String** | The result of the command. This value is write-only and can only be written once. |  [optional] |
|**status** | **String** | The status of the command. The current valid values are pending, success, error. |  [optional] |
|**type** | **String** | The type of command. The current valid values are get_app_logs. |  [optional] |



