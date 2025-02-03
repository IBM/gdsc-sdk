# SensitivityListItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sensitivity_id** | **str** |  | 
**tag** | **str** |  | 
**query** | **str** |  | 
**resource_id** | **str** |  | 
**quarantine_bucket_link** | **str** |  | 
**data_store_id** | **str** |  | 
**last_seen** | **str** |  | 
**category** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.sensitivity_list_item import SensitivityListItem

# TODO update the JSON string below
json = "{}"
# create an instance of SensitivityListItem from a JSON string
sensitivity_list_item_instance = SensitivityListItem.from_json(json)
# print the JSON string representation of the object
print(SensitivityListItem.to_json())

# convert the object into a dict
sensitivity_list_item_dict = sensitivity_list_item_instance.to_dict()
# create an instance of SensitivityListItem from a dict
sensitivity_list_item_from_dict = SensitivityListItem.from_dict(sensitivity_list_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


