# resourcecontrollerk8v3ControllerApp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**container** | [**Resourcecontrollerk8v3Container**](Resourcecontrollerk8v3Container.md) |  | [optional] [default to null]
**deployment** | [**Resourcecontrollerk8v3AppDeployment**](Resourcecontrollerk8v3AppDeployment.md) |  | [optional] [default to null]
**emptyUnderscoredir** | **string** | empty directory path | [optional] [default to null]
**files** | [**array[Resourcecontrollerk8v3ControllerAppFile]**](Resourcecontrollerk8v3ControllerAppFile.md) | the controlle app files | [optional] [default to null]
**hpa** | [**Resourcecontrollerk8v3AppHpa**](Resourcecontrollerk8v3AppHpa.md) |  | [optional] [default to null]
**id** | **string** |  | [optional] [default to null]
**initUnderscorecontainers** | [**array[Resourcecontrollerk8v3InitContainer]**](Resourcecontrollerk8v3InitContainer.md) | the initial container list for the app | [optional] [default to null]
**modified** | **string** |  | [optional] [default to null]
**name** | **string** |  | [optional] [default to null]
**secretUnderscorekey** | **string** | decryption info of protected secrets | [optional] [default to null]
**secrets** | [**array[Resourcecontrollerk8v3ControllerAppSecret]**](Resourcecontrollerk8v3ControllerAppSecret.md) | app secrets | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


