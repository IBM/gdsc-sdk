# Riskanalyticscontrollerv3SetUserUISettingsResponse

SetUserUISettingsResponse is the response object for SetUserUISettings API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Response message. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_set_user_ui_settings_response import Riskanalyticscontrollerv3SetUserUISettingsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3SetUserUISettingsResponse from a JSON string
riskanalyticscontrollerv3_set_user_ui_settings_response_instance = Riskanalyticscontrollerv3SetUserUISettingsResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3SetUserUISettingsResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_set_user_ui_settings_response_dict = riskanalyticscontrollerv3_set_user_ui_settings_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3SetUserUISettingsResponse from a dict
riskanalyticscontrollerv3_set_user_ui_settings_response_from_dict = Riskanalyticscontrollerv3SetUserUISettingsResponse.from_dict(riskanalyticscontrollerv3_set_user_ui_settings_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


