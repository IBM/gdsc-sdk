# Resourcecontrollerk8v3App

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Container** | [***Resourcecontrollerk8v3Container**](resourcecontrollerk8v3Container.md) |  | [optional] [default to null]
**Created** | **string** | Optional: The date this app was created (ms since epoch). | [optional] [default to null]
**Deployment** | [***Resourcecontrollerk8v3AppDeployment**](resourcecontrollerk8v3AppDeployment.md) |  | [optional] [default to null]
**EmptyDir** | **string** | Optional: The path for mounted empty directory. All containers in pod have read/write permission to it. | [optional] [default to null]
**FileIds** | **[]string** | Optional: The internal IDs of the files for the app. This is deprecated in favor of the files field. | [optional] [default to null]
**Files** | [**[]Resourcecontrollerk8v3AppFile**](resourcecontrollerk8v3AppFile.md) | Optional: The files for the app. | [optional] [default to null]
**Hpa** | [***Resourcecontrollerk8v3AppHpa**](resourcecontrollerk8v3AppHpa.md) |  | [optional] [default to null]
**Id** | **string** | The internal ID of the app. | [optional] [default to null]
**InitContainers** | [**[]Resourcecontrollerk8v3InitContainer**](resourcecontrollerk8v3InitContainer.md) |  | [optional] [default to null]
**Modified** | **string** | Optional: The date this app was modified (ms since epoch). | [optional] [default to null]
**Name** | **string** | The name of the app. | [optional] [default to null]
**Secrets** | [**[]Resourcecontrollerk8v3AppSecret**](resourcecontrollerk8v3AppSecret.md) | Optional: The secrets for the app. | [optional] [default to null]
**Status** | **string** | Optional: The status of the app. | [optional] [default to null]
**TenantId** | **string** | The tenant id for the app. | [optional] [default to null]
**TenantUuid** | **string** | The internal ID of the tenant for the app. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

