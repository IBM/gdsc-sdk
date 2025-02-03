# Reportsv3Filter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | The number of times this item is included in the table. | [optional] 
**value** | **str** | The value of the column that will be filtered. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_filter import Reportsv3Filter

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3Filter from a JSON string
reportsv3_filter_instance = Reportsv3Filter.from_json(json)
# print the JSON string representation of the object
print(Reportsv3Filter.to_json())

# convert the object into a dict
reportsv3_filter_dict = reportsv3_filter_instance.to_dict()
# create an instance of Reportsv3Filter from a dict
reportsv3_filter_from_dict = Reportsv3Filter.from_dict(reportsv3_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


