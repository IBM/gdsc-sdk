# Jumpboxv3DisableUsersBulkResponse

DisableUsersBulkResponse message for Delete v3/users api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_ids** | **List[str]** | List of userId of deleted users. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.jumpboxv3_disable_users_bulk_response import Jumpboxv3DisableUsersBulkResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3DisableUsersBulkResponse from a JSON string
jumpboxv3_disable_users_bulk_response_instance = Jumpboxv3DisableUsersBulkResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3DisableUsersBulkResponse.to_json())

# convert the object into a dict
jumpboxv3_disable_users_bulk_response_dict = jumpboxv3_disable_users_bulk_response_instance.to_dict()
# create an instance of Jumpboxv3DisableUsersBulkResponse from a dict
jumpboxv3_disable_users_bulk_response_from_dict = Jumpboxv3DisableUsersBulkResponse.from_dict(jumpboxv3_disable_users_bulk_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


