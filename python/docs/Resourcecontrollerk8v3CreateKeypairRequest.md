# Resourcecontrollerk8v3CreateKeypairRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controller_id** | **str** | The ID of the controller to get app tests for. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_create_keypair_request import Resourcecontrollerk8v3CreateKeypairRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3CreateKeypairRequest from a JSON string
resourcecontrollerk8v3_create_keypair_request_instance = Resourcecontrollerk8v3CreateKeypairRequest.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3CreateKeypairRequest.to_json())

# convert the object into a dict
resourcecontrollerk8v3_create_keypair_request_dict = resourcecontrollerk8v3_create_keypair_request_instance.to_dict()
# create an instance of Resourcecontrollerk8v3CreateKeypairRequest from a dict
resourcecontrollerk8v3_create_keypair_request_from_dict = Resourcecontrollerk8v3CreateKeypairRequest.from_dict(resourcecontrollerk8v3_create_keypair_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


