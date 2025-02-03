# Reportsv3DeleteJoinResponse

DeleteJoinResponse is the response for deleting a custom join.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_delete_join_response import Reportsv3DeleteJoinResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3DeleteJoinResponse from a JSON string
reportsv3_delete_join_response_instance = Reportsv3DeleteJoinResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3DeleteJoinResponse.to_json())

# convert the object into a dict
reportsv3_delete_join_response_dict = reportsv3_delete_join_response_instance.to_dict()
# create an instance of Reportsv3DeleteJoinResponse from a dict
reportsv3_delete_join_response_from_dict = Reportsv3DeleteJoinResponse.from_dict(reportsv3_delete_join_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


