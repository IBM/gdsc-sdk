# Riskanalyticscontrollerv3GetUserUISettingsResponse

GetUserUISettingsResponse is the response object for GetUserUISettings API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_ui_settings** | [**Riskanalyticscontrollerv3UserUISettings**](Riskanalyticscontrollerv3UserUISettings.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_get_user_ui_settings_response import Riskanalyticscontrollerv3GetUserUISettingsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3GetUserUISettingsResponse from a JSON string
riskanalyticscontrollerv3_get_user_ui_settings_response_instance = Riskanalyticscontrollerv3GetUserUISettingsResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3GetUserUISettingsResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_get_user_ui_settings_response_dict = riskanalyticscontrollerv3_get_user_ui_settings_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3GetUserUISettingsResponse from a dict
riskanalyticscontrollerv3_get_user_ui_settings_response_from_dict = Riskanalyticscontrollerv3GetUserUISettingsResponse.from_dict(riskanalyticscontrollerv3_get_user_ui_settings_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


