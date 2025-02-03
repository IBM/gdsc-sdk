# Reportsv3CreateJoinRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**join_definition** | [**Reportsv3JoinDefinition**](Reportsv3JoinDefinition.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_create_join_request import Reportsv3CreateJoinRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateJoinRequest from a JSON string
reportsv3_create_join_request_instance = Reportsv3CreateJoinRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateJoinRequest.to_json())

# convert the object into a dict
reportsv3_create_join_request_dict = reportsv3_create_join_request_instance.to_dict()
# create an instance of Reportsv3CreateJoinRequest from a dict
reportsv3_create_join_request_from_dict = Reportsv3CreateJoinRequest.from_dict(reportsv3_create_join_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


