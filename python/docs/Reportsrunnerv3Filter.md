# Reportsrunnerv3Filter

Filter has the values and counts for value in a column.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | The number of times this item is included in the table. | [optional] 
**value** | **str** | The value of the column that will be filtered. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_filter import Reportsrunnerv3Filter

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3Filter from a JSON string
reportsrunnerv3_filter_instance = Reportsrunnerv3Filter.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3Filter.to_json())

# convert the object into a dict
reportsrunnerv3_filter_dict = reportsrunnerv3_filter_instance.to_dict()
# create an instance of Reportsrunnerv3Filter from a dict
reportsrunnerv3_filter_from_dict = Reportsrunnerv3Filter.from_dict(reportsrunnerv3_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


