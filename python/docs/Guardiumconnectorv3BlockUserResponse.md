# Guardiumconnectorv3BlockUserResponse

Returns the response of the block user action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**block_result** | **bool** | Result of block action. | [optional] 
**err** | **str** | Error message. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_block_user_response import Guardiumconnectorv3BlockUserResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3BlockUserResponse from a JSON string
guardiumconnectorv3_block_user_response_instance = Guardiumconnectorv3BlockUserResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3BlockUserResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_block_user_response_dict = guardiumconnectorv3_block_user_response_instance.to_dict()
# create an instance of Guardiumconnectorv3BlockUserResponse from a dict
guardiumconnectorv3_block_user_response_from_dict = Guardiumconnectorv3BlockUserResponse.from_dict(guardiumconnectorv3_block_user_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


