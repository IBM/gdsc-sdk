# Jumpboxv3PostUsersBulkResponse

PostUsersBulkResponse message for POST v3/users api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location** | **str** | Path for user get. | [optional] 
**message** | **str** | User creation message. | [optional] 
**user_ids** | **List[str]** | List of created users. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_post_users_bulk_response import Jumpboxv3PostUsersBulkResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3PostUsersBulkResponse from a JSON string
jumpboxv3_post_users_bulk_response_instance = Jumpboxv3PostUsersBulkResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3PostUsersBulkResponse.to_json())

# convert the object into a dict
jumpboxv3_post_users_bulk_response_dict = jumpboxv3_post_users_bulk_response_instance.to_dict()
# create an instance of Jumpboxv3PostUsersBulkResponse from a dict
jumpboxv3_post_users_bulk_response_from_dict = Jumpboxv3PostUsersBulkResponse.from_dict(jumpboxv3_post_users_bulk_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


