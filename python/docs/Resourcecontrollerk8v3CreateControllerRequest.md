# Resourcecontrollerk8v3CreateControllerRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Optional: The description of the controller. | [optional] 
**name** | **str** | The name of the controller. | [optional] 
**tenant_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_create_controller_request import Resourcecontrollerk8v3CreateControllerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3CreateControllerRequest from a JSON string
resourcecontrollerk8v3_create_controller_request_instance = Resourcecontrollerk8v3CreateControllerRequest.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3CreateControllerRequest.to_json())

# convert the object into a dict
resourcecontrollerk8v3_create_controller_request_dict = resourcecontrollerk8v3_create_controller_request_instance.to_dict()
# create an instance of Resourcecontrollerk8v3CreateControllerRequest from a dict
resourcecontrollerk8v3_create_controller_request_from_dict = Resourcecontrollerk8v3CreateControllerRequest.from_dict(resourcecontrollerk8v3_create_controller_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


