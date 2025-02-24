# Riskanalyticscontrollerv3UserUISettings

UserUISettings an object contains settings per user to display in the UI.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**card_settings** | [**List[Riskanalyticscontrollerv3CardSettings]**](Riskanalyticscontrollerv3CardSettings.md) | A list of card settings for each view(box) of risks. | [optional] 
**show_banner** | **bool** | Show_banner a flag to show additional info in the top of screen or to hide it. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_user_ui_settings import Riskanalyticscontrollerv3UserUISettings

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3UserUISettings from a JSON string
riskanalyticscontrollerv3_user_ui_settings_instance = Riskanalyticscontrollerv3UserUISettings.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3UserUISettings.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_user_ui_settings_dict = riskanalyticscontrollerv3_user_ui_settings_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3UserUISettings from a dict
riskanalyticscontrollerv3_user_ui_settings_from_dict = Riskanalyticscontrollerv3UserUISettings.from_dict(riskanalyticscontrollerv3_user_ui_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


