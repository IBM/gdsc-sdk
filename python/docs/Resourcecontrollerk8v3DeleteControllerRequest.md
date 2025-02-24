# Resourcecontrollerk8v3DeleteControllerRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controller_id** | **str** | The ID of the controller to get the status. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_delete_controller_request import Resourcecontrollerk8v3DeleteControllerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3DeleteControllerRequest from a JSON string
resourcecontrollerk8v3_delete_controller_request_instance = Resourcecontrollerk8v3DeleteControllerRequest.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3DeleteControllerRequest.to_json())

# convert the object into a dict
resourcecontrollerk8v3_delete_controller_request_dict = resourcecontrollerk8v3_delete_controller_request_instance.to_dict()
# create an instance of Resourcecontrollerk8v3DeleteControllerRequest from a dict
resourcecontrollerk8v3_delete_controller_request_from_dict = Resourcecontrollerk8v3DeleteControllerRequest.from_dict(resourcecontrollerk8v3_delete_controller_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


