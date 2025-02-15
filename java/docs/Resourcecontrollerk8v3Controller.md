

# Resourcecontrollerk8v3Controller

Controller contains the information about a controller.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appIds** | **List&lt;String&gt;** | Optional: The list of internal IDs of the apps for the controller. |  [optional] |
|**apps** | [**List&lt;Resourcecontrollerk8v3App&gt;**](Resourcecontrollerk8v3App.md) | Optional: The controller&#39;s apps. |  [optional] |
|**capability** | **Map&lt;String, Boolean&gt;** | Optional: The controller capability like protected secret. If absence, app manager assumes all capabilities are false. |  [optional] |
|**created** | **String** | Optional: The date this controller was created (ms since epoch). |  [optional] |
|**description** | [**Resourcecontrollerk8v3TextContent**](Resourcecontrollerk8v3TextContent.md) |  |  [optional] |
|**id** | **String** | Optional: The internal ID of the controller. |  [optional] |
|**keypair** | [**Resourcecontrollerk8v3KeyPair**](Resourcecontrollerk8v3KeyPair.md) |  |  [optional] |
|**lastHeartbeat** | **String** | Optional: The last date when a heartbeat was applied to this controller (ms since epoch). |  [optional] |
|**local** | **Boolean** | Is the controller \\\&quot;local\\\&quot;? \\\&quot;Local\\\&quot; controllers may not be unpaired, removed, or renewed. |  [optional] |
|**modified** | **String** | Optional: The date this controller was modified (ms since epoch). |  [optional] |
|**name** | **String** | The name of the controller. |  [optional] |
|**resources** | [**Resourcecontrollerk8v3ControllerResources**](Resourcecontrollerk8v3ControllerResources.md) |  |  [optional] |
|**sinceLastHeartbeat** | **String** | Optional: The number of ms since the last heartbeat. |  [optional] |
|**status** | **String** | Optional: The status of the controller. Currently supported values are unpaired, paired, uninstalling. |  [optional] |
|**tenantId** | **String** | Optional: The tenant id for the controller. |  [optional] |
|**tenantUuid** | **String** | Optional: The internal ID of the tenant for the controller. |  [optional] |
|**version** | [**Resourcecontrollerk8v3Version**](Resourcecontrollerk8v3Version.md) |  |  [optional] |



