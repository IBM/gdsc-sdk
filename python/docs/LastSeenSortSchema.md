# LastSeenSortSchema

Descending order by default.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sort_by** | **str** |  | 
**sort_order** | [**SortOrder**](SortOrder.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.last_seen_sort_schema import LastSeenSortSchema

# TODO update the JSON string below
json = "{}"
# create an instance of LastSeenSortSchema from a JSON string
last_seen_sort_schema_instance = LastSeenSortSchema.from_json(json)
# print the JSON string representation of the object
print(LastSeenSortSchema.to_json())

# convert the object into a dict
last_seen_sort_schema_dict = last_seen_sort_schema_instance.to_dict()
# create an instance of LastSeenSortSchema from a dict
last_seen_sort_schema_from_dict = LastSeenSortSchema.from_dict(last_seen_sort_schema_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


