# Jumpboxv3PostUsersBulkRequest

PostUsersBulkRequest message for POST v3/users api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[Jumpboxv3User]**](Jumpboxv3User.md) | Array of users to be imported into Insights. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.jumpboxv3_post_users_bulk_request import Jumpboxv3PostUsersBulkRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3PostUsersBulkRequest from a JSON string
jumpboxv3_post_users_bulk_request_instance = Jumpboxv3PostUsersBulkRequest.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3PostUsersBulkRequest.to_json())

# convert the object into a dict
jumpboxv3_post_users_bulk_request_dict = jumpboxv3_post_users_bulk_request_instance.to_dict()
# create an instance of Jumpboxv3PostUsersBulkRequest from a dict
jumpboxv3_post_users_bulk_request_from_dict = Jumpboxv3PostUsersBulkRequest.from_dict(jumpboxv3_post_users_bulk_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


