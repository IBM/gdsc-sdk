# Jumpboxv3AuthorizeResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cc_jwt** | **str** |  | [optional] 
**jwt** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.jumpboxv3_authorize_response import Jumpboxv3AuthorizeResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3AuthorizeResponse from a JSON string
jumpboxv3_authorize_response_instance = Jumpboxv3AuthorizeResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3AuthorizeResponse.to_json())

# convert the object into a dict
jumpboxv3_authorize_response_dict = jumpboxv3_authorize_response_instance.to_dict()
# create an instance of Jumpboxv3AuthorizeResponse from a dict
jumpboxv3_authorize_response_from_dict = Jumpboxv3AuthorizeResponse.from_dict(jumpboxv3_authorize_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


