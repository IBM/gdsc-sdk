# Reportsv3GetJoinsResponse

GetJoinsResponse is the response for getting all custom joins.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**join_defs** | [**List[Reportsv3JoinDefinitionWithID]**](Reportsv3JoinDefinitionWithID.md) | List of objects including join ID and join definition. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_get_joins_response import Reportsv3GetJoinsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetJoinsResponse from a JSON string
reportsv3_get_joins_response_instance = Reportsv3GetJoinsResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetJoinsResponse.to_json())

# convert the object into a dict
reportsv3_get_joins_response_dict = reportsv3_get_joins_response_instance.to_dict()
# create an instance of Reportsv3GetJoinsResponse from a dict
reportsv3_get_joins_response_from_dict = Reportsv3GetJoinsResponse.from_dict(reportsv3_get_joins_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


