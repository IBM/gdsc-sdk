# Resourcecontrollerk8v3AppDeployment

AppDeployment contains the information required to deploy an app.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controller_id** | **str** | Optional: The internal ID of the controller for the app. | [optional] 
**details** | **str** | Optional: The details of the deployment. Used to hold error details if status is error. | [optional] 
**modified** | **str** | Optional: The date this app deployment was modified (ms since epoch). | [optional] 
**replicas** | **int** | Optional: The replicas of the deployment. | [optional] 
**status** | **str** | Optional: The status of the deployment. Currently supported values are deploying, ready, error, undeploying, and restarting. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_app_deployment import Resourcecontrollerk8v3AppDeployment

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3AppDeployment from a JSON string
resourcecontrollerk8v3_app_deployment_instance = Resourcecontrollerk8v3AppDeployment.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3AppDeployment.to_json())

# convert the object into a dict
resourcecontrollerk8v3_app_deployment_dict = resourcecontrollerk8v3_app_deployment_instance.to_dict()
# create an instance of Resourcecontrollerk8v3AppDeployment from a dict
resourcecontrollerk8v3_app_deployment_from_dict = Resourcecontrollerk8v3AppDeployment.from_dict(resourcecontrollerk8v3_app_deployment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


