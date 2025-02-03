# Guardiumconnectorv3BlockUserRequest

Block a database user on Guardium Data Protection or a DBaaS instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination** | [**Guardiumconnectorv3BlockWhere**](Guardiumconnectorv3BlockWhere.md) |  | [optional] 
**details** | [**Guardiumconnectorv3BlockWhat**](Guardiumconnectorv3BlockWhat.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_block_user_request import Guardiumconnectorv3BlockUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3BlockUserRequest from a JSON string
guardiumconnectorv3_block_user_request_instance = Guardiumconnectorv3BlockUserRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3BlockUserRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_block_user_request_dict = guardiumconnectorv3_block_user_request_instance.to_dict()
# create an instance of Guardiumconnectorv3BlockUserRequest from a dict
guardiumconnectorv3_block_user_request_from_dict = Guardiumconnectorv3BlockUserRequest.from_dict(guardiumconnectorv3_block_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


