# Jumpboxv3UpdateUsersBulkRequest

UpdateUsersBulkRequest message for Patch v3/users api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** |  | [optional] 
**metadata_only** | **bool** | Boolean to update metadata only or not. | [optional] 
**users** | [**List[Jumpboxv3User]**](Jumpboxv3User.md) | List of users to get updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.jumpboxv3_update_users_bulk_request import Jumpboxv3UpdateUsersBulkRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3UpdateUsersBulkRequest from a JSON string
jumpboxv3_update_users_bulk_request_instance = Jumpboxv3UpdateUsersBulkRequest.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3UpdateUsersBulkRequest.to_json())

# convert the object into a dict
jumpboxv3_update_users_bulk_request_dict = jumpboxv3_update_users_bulk_request_instance.to_dict()
# create an instance of Jumpboxv3UpdateUsersBulkRequest from a dict
jumpboxv3_update_users_bulk_request_from_dict = Jumpboxv3UpdateUsersBulkRequest.from_dict(jumpboxv3_update_users_bulk_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


