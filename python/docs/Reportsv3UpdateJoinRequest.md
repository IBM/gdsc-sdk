# Reportsv3UpdateJoinRequest

UpdateJoinRequest is the argument type used to update a custom join.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**join_def** | [**Reportsv3JoinDefinition**](Reportsv3JoinDefinition.md) |  | [optional] 
**join_id** | **str** | Unique join ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_join_request import Reportsv3UpdateJoinRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateJoinRequest from a JSON string
reportsv3_update_join_request_instance = Reportsv3UpdateJoinRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateJoinRequest.to_json())

# convert the object into a dict
reportsv3_update_join_request_dict = reportsv3_update_join_request_instance.to_dict()
# create an instance of Reportsv3UpdateJoinRequest from a dict
reportsv3_update_join_request_from_dict = Reportsv3UpdateJoinRequest.from_dict(reportsv3_update_join_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


