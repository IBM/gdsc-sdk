# Reportsrunnerv3GetActiveQueriesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**queries** | [**List[Reportsrunnerv3ActiveQuery]**](Reportsrunnerv3ActiveQuery.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_active_queries_response import Reportsrunnerv3GetActiveQueriesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3GetActiveQueriesResponse from a JSON string
reportsrunnerv3_get_active_queries_response_instance = Reportsrunnerv3GetActiveQueriesResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3GetActiveQueriesResponse.to_json())

# convert the object into a dict
reportsrunnerv3_get_active_queries_response_dict = reportsrunnerv3_get_active_queries_response_instance.to_dict()
# create an instance of Reportsrunnerv3GetActiveQueriesResponse from a dict
reportsrunnerv3_get_active_queries_response_from_dict = Reportsrunnerv3GetActiveQueriesResponse.from_dict(reportsrunnerv3_get_active_queries_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


