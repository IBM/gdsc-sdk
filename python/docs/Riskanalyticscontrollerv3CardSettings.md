# Riskanalyticscontrollerv3CardSettings

CardSettings a object to display each card of risks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[Riskanalyticscontrollerv3Filter]**](Riskanalyticscontrollerv3Filter.md) | Filters - list if filters to view the risk. | [optional] 
**headers** | **List[str]** | Headers - list of headers to view the risks. | [optional] 
**id** | **str** | Id of the settings. | [optional] 
**name** | **str** | Name of the view - nls value in case its first time for user. | [optional] 
**order_by** | [**Riskanalyticscontrollerv3OrderBy**](Riskanalyticscontrollerv3OrderBy.md) |  | [optional] 
**sequence_order** | **int** | Sequence  order of the view(box) of the risks. | [optional] 
**sorted_by** | **str** | Sorted by header_id to sort the risks in the view by. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_card_settings import Riskanalyticscontrollerv3CardSettings

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3CardSettings from a JSON string
riskanalyticscontrollerv3_card_settings_instance = Riskanalyticscontrollerv3CardSettings.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3CardSettings.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_card_settings_dict = riskanalyticscontrollerv3_card_settings_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3CardSettings from a dict
riskanalyticscontrollerv3_card_settings_from_dict = Riskanalyticscontrollerv3CardSettings.from_dict(riskanalyticscontrollerv3_card_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


