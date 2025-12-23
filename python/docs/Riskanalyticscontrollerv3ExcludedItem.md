# Riskanalyticscontrollerv3ExcludedItem

Excluded item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**excluded_item_type** | [**Riskanalyticscontrollerv3ExcludedItemType**](Riskanalyticscontrollerv3ExcludedItemType.md) |  | [optional] [default to Riskanalyticscontrollerv3ExcludedItemType.UNDEFINED_EXCLUDED_ITEM_TYPE]
**key** | **str** | Excluded key. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_excluded_item import Riskanalyticscontrollerv3ExcludedItem

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3ExcludedItem from a JSON string
riskanalyticscontrollerv3_excluded_item_instance = Riskanalyticscontrollerv3ExcludedItem.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3ExcludedItem.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_excluded_item_dict = riskanalyticscontrollerv3_excluded_item_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3ExcludedItem from a dict
riskanalyticscontrollerv3_excluded_item_from_dict = Riskanalyticscontrollerv3ExcludedItem.from_dict(riskanalyticscontrollerv3_excluded_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


