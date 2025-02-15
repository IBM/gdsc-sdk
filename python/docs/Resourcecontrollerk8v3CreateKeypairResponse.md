# Resourcecontrollerk8v3CreateKeypairResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**private** | **str** | A PEM-encoded private key used to sign requests to the manager. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_create_keypair_response import Resourcecontrollerk8v3CreateKeypairResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3CreateKeypairResponse from a JSON string
resourcecontrollerk8v3_create_keypair_response_instance = Resourcecontrollerk8v3CreateKeypairResponse.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3CreateKeypairResponse.to_json())

# convert the object into a dict
resourcecontrollerk8v3_create_keypair_response_dict = resourcecontrollerk8v3_create_keypair_response_instance.to_dict()
# create an instance of Resourcecontrollerk8v3CreateKeypairResponse from a dict
resourcecontrollerk8v3_create_keypair_response_from_dict = Resourcecontrollerk8v3CreateKeypairResponse.from_dict(resourcecontrollerk8v3_create_keypair_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


