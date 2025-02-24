# Resourcecontrollerk8v3App

App contains the information about an app.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**container** | [**Resourcecontrollerk8v3Container**](Resourcecontrollerk8v3Container.md) |  | [optional] 
**created** | **str** | Optional: The date this app was created (ms since epoch). | [optional] 
**deployment** | [**Resourcecontrollerk8v3AppDeployment**](Resourcecontrollerk8v3AppDeployment.md) |  | [optional] 
**empty_dir** | **str** | Optional: The path for mounted empty directory. All containers in pod have read/write permission to it. | [optional] 
**file_ids** | **List[str]** | Optional: The internal IDs of the files for the app. This is deprecated in favor of the files field. | [optional] 
**files** | [**List[Resourcecontrollerk8v3AppFile]**](Resourcecontrollerk8v3AppFile.md) | Optional: The files for the app. | [optional] 
**hpa** | [**Resourcecontrollerk8v3AppHpa**](Resourcecontrollerk8v3AppHpa.md) |  | [optional] 
**id** | **str** | The internal ID of the app. | [optional] 
**init_containers** | [**List[Resourcecontrollerk8v3InitContainer]**](Resourcecontrollerk8v3InitContainer.md) |  | [optional] 
**modified** | **str** | Optional: The date this app was modified (ms since epoch). | [optional] 
**name** | **str** | The name of the app. | [optional] 
**secrets** | [**List[Resourcecontrollerk8v3AppSecret]**](Resourcecontrollerk8v3AppSecret.md) | Optional: The secrets for the app. | [optional] 
**status** | **str** | Optional: The status of the app. | [optional] 
**tenant_id** | **str** | The tenant id for the app. | [optional] 
**tenant_uuid** | **str** | The internal ID of the tenant for the app. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_app import Resourcecontrollerk8v3App

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3App from a JSON string
resourcecontrollerk8v3_app_instance = Resourcecontrollerk8v3App.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3App.to_json())

# convert the object into a dict
resourcecontrollerk8v3_app_dict = resourcecontrollerk8v3_app_instance.to_dict()
# create an instance of Resourcecontrollerk8v3App from a dict
resourcecontrollerk8v3_app_from_dict = Resourcecontrollerk8v3App.from_dict(resourcecontrollerk8v3_app_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


