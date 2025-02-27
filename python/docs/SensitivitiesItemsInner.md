# SensitivitiesItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sensitivity** | **str** |  | 
**count** | **float** |  | 
**category** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.sensitivities_items_inner import SensitivitiesItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of SensitivitiesItemsInner from a JSON string
sensitivities_items_inner_instance = SensitivitiesItemsInner.from_json(json)
# print the JSON string representation of the object
print(SensitivitiesItemsInner.to_json())

# convert the object into a dict
sensitivities_items_inner_dict = sensitivities_items_inner_instance.to_dict()
# create an instance of SensitivitiesItemsInner from a dict
sensitivities_items_inner_from_dict = SensitivitiesItemsInner.from_dict(sensitivities_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


