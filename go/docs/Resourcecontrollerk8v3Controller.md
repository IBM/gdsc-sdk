# Resourcecontrollerk8v3Controller

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppIds** | **[]string** | Optional: The list of internal IDs of the apps for the controller. | [optional] [default to null]
**Apps** | [**[]Resourcecontrollerk8v3App**](resourcecontrollerk8v3App.md) | Optional: The controller&#x27;s apps. | [optional] [default to null]
**Capability** | **map[string]bool** | Optional: The controller capability like protected secret. If absence, app manager assumes all capabilities are false. | [optional] [default to null]
**Created** | **string** | Optional: The date this controller was created (ms since epoch). | [optional] [default to null]
**Description** | [***Resourcecontrollerk8v3TextContent**](resourcecontrollerk8v3TextContent.md) |  | [optional] [default to null]
**Id** | **string** | Optional: The internal ID of the controller. | [optional] [default to null]
**Keypair** | [***Resourcecontrollerk8v3KeyPair**](resourcecontrollerk8v3KeyPair.md) |  | [optional] [default to null]
**LastHeartbeat** | **string** | Optional: The last date when a heartbeat was applied to this controller (ms since epoch). | [optional] [default to null]
**Local** | **bool** | Is the controller \\\&quot;local\\\&quot;? \\\&quot;Local\\\&quot; controllers may not be unpaired, removed, or renewed. | [optional] [default to null]
**Modified** | **string** | Optional: The date this controller was modified (ms since epoch). | [optional] [default to null]
**Name** | **string** | The name of the controller. | [optional] [default to null]
**Resources** | [***Resourcecontrollerk8v3ControllerResources**](resourcecontrollerk8v3ControllerResources.md) |  | [optional] [default to null]
**SinceLastHeartbeat** | **string** | Optional: The number of ms since the last heartbeat. | [optional] [default to null]
**Status** | **string** | Optional: The status of the controller. Currently supported values are unpaired, paired, uninstalling. | [optional] [default to null]
**TenantId** | **string** | Optional: The tenant id for the controller. | [optional] [default to null]
**TenantUuid** | **string** | Optional: The internal ID of the tenant for the controller. | [optional] [default to null]
**Version** | [***Resourcecontrollerk8v3Version**](resourcecontrollerk8v3Version.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

