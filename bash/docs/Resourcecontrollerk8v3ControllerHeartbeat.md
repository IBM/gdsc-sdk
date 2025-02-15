# resourcecontrollerk8v3ControllerHeartbeat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capability** | **map[String, boolean]** | Optional: Capability the controller supports. If absence, app manager assumes all capabilities are false. Currently app manager is aware of capability key(s) below. - protected_secret_app: protected secret for AppDTO - protected_secret_job: protected secret for JobDTO | [optional] [default to null]
**controllerUnderscoreid** | **string** | Optional: controller id | [optional] [default to null]
**controllerUnderscoreversion** | [**Resourcecontrollerk8v3Version**](Resourcecontrollerk8v3Version.md) |  | [optional] [default to null]
**resources** | [**Resourcecontrollerk8v3ControllerResources**](Resourcecontrollerk8v3ControllerResources.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


