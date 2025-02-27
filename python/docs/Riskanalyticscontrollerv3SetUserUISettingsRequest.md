# Riskanalyticscontrollerv3SetUserUISettingsRequest

SetUserUISettingsRequest is the request object for SetUserUISettings API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_ui_settings** | [**Riskanalyticscontrollerv3UserUISettings**](Riskanalyticscontrollerv3UserUISettings.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_set_user_ui_settings_request import Riskanalyticscontrollerv3SetUserUISettingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3SetUserUISettingsRequest from a JSON string
riskanalyticscontrollerv3_set_user_ui_settings_request_instance = Riskanalyticscontrollerv3SetUserUISettingsRequest.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3SetUserUISettingsRequest.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_set_user_ui_settings_request_dict = riskanalyticscontrollerv3_set_user_ui_settings_request_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3SetUserUISettingsRequest from a dict
riskanalyticscontrollerv3_set_user_ui_settings_request_from_dict = Riskanalyticscontrollerv3SetUserUISettingsRequest.from_dict(riskanalyticscontrollerv3_set_user_ui_settings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


