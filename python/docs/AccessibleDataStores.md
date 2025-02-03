# AccessibleDataStores


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**name** | **str** |  | 
**type** | **str** |  | 
**cloud_provider** | [**CloudServiceProvider**](CloudServiceProvider.md) |  | 
**cloud_location** | **str** |  | 
**permissions** | [**List[AccessType]**](AccessType.md) |  | 
**sensitivities_summary** | [**List[SensitivitySummary]**](SensitivitySummary.md) |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.accessible_data_stores import AccessibleDataStores

# TODO update the JSON string below
json = "{}"
# create an instance of AccessibleDataStores from a JSON string
accessible_data_stores_instance = AccessibleDataStores.from_json(json)
# print the JSON string representation of the object
print(AccessibleDataStores.to_json())

# convert the object into a dict
accessible_data_stores_dict = accessible_data_stores_instance.to_dict()
# create an instance of AccessibleDataStores from a dict
accessible_data_stores_from_dict = AccessibleDataStores.from_dict(accessible_data_stores_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


