# Reportsv3UpdateJoinResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**join_id** | **str** |  | [optional] 
**message** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_join_response import Reportsv3UpdateJoinResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateJoinResponse from a JSON string
reportsv3_update_join_response_instance = Reportsv3UpdateJoinResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateJoinResponse.to_json())

# convert the object into a dict
reportsv3_update_join_response_dict = reportsv3_update_join_response_instance.to_dict()
# create an instance of Reportsv3UpdateJoinResponse from a dict
reportsv3_update_join_response_from_dict = Reportsv3UpdateJoinResponse.from_dict(reportsv3_update_join_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


