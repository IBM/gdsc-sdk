# Resourcecontrollerk8v3DeleteControllerResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_delete_controller_response import Resourcecontrollerk8v3DeleteControllerResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3DeleteControllerResponse from a JSON string
resourcecontrollerk8v3_delete_controller_response_instance = Resourcecontrollerk8v3DeleteControllerResponse.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3DeleteControllerResponse.to_json())

# convert the object into a dict
resourcecontrollerk8v3_delete_controller_response_dict = resourcecontrollerk8v3_delete_controller_response_instance.to_dict()
# create an instance of Resourcecontrollerk8v3DeleteControllerResponse from a dict
resourcecontrollerk8v3_delete_controller_response_from_dict = Resourcecontrollerk8v3DeleteControllerResponse.from_dict(resourcecontrollerk8v3_delete_controller_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


