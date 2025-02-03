# Jumpboxv3UpdateUsersBulkResponse

UpdateUsersBulkResponse message for Patch v3/users api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location** | **str** | Path for user get. | [optional] 
**message** | **str** | User update message. | [optional] 
**user_id** | **List[str]** | List of updated users. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.jumpboxv3_update_users_bulk_response import Jumpboxv3UpdateUsersBulkResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3UpdateUsersBulkResponse from a JSON string
jumpboxv3_update_users_bulk_response_instance = Jumpboxv3UpdateUsersBulkResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3UpdateUsersBulkResponse.to_json())

# convert the object into a dict
jumpboxv3_update_users_bulk_response_dict = jumpboxv3_update_users_bulk_response_instance.to_dict()
# create an instance of Jumpboxv3UpdateUsersBulkResponse from a dict
jumpboxv3_update_users_bulk_response_from_dict = Jumpboxv3UpdateUsersBulkResponse.from_dict(jumpboxv3_update_users_bulk_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


