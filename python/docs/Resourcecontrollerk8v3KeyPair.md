# Resourcecontrollerk8v3KeyPair

KeyPair contains the information about a keypair.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**private** | **str** | Optional: A PEM-encoded private key used to sign requests to the manager. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_key_pair import Resourcecontrollerk8v3KeyPair

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3KeyPair from a JSON string
resourcecontrollerk8v3_key_pair_instance = Resourcecontrollerk8v3KeyPair.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3KeyPair.to_json())

# convert the object into a dict
resourcecontrollerk8v3_key_pair_dict = resourcecontrollerk8v3_key_pair_instance.to_dict()
# create an instance of Resourcecontrollerk8v3KeyPair from a dict
resourcecontrollerk8v3_key_pair_from_dict = Resourcecontrollerk8v3KeyPair.from_dict(resourcecontrollerk8v3_key_pair_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


