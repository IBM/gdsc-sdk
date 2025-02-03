# Reportsrunnerv3ActiveQuery


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**can_stop** | **bool** |  | [optional] 
**detail** | **str** |  | [optional] 
**elapsed_time** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**query_id** | **str** |  | [optional] 
**start_time** | **datetime** |  | [optional] 
**status** | **str** |  | [optional] 
**type** | **str** |  | [optional] 
**user** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_active_query import Reportsrunnerv3ActiveQuery

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3ActiveQuery from a JSON string
reportsrunnerv3_active_query_instance = Reportsrunnerv3ActiveQuery.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3ActiveQuery.to_json())

# convert the object into a dict
reportsrunnerv3_active_query_dict = reportsrunnerv3_active_query_instance.to_dict()
# create an instance of Reportsrunnerv3ActiveQuery from a dict
reportsrunnerv3_active_query_from_dict = Reportsrunnerv3ActiveQuery.from_dict(reportsrunnerv3_active_query_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


