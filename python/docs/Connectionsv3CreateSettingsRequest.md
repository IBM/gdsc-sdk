# Connectionsv3CreateSettingsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settings** | [**List[Connectionsv3ConnectorSetting]**](Connectionsv3ConnectorSetting.md) | The list of settings to create. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_create_settings_request import Connectionsv3CreateSettingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3CreateSettingsRequest from a JSON string
connectionsv3_create_settings_request_instance = Connectionsv3CreateSettingsRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3CreateSettingsRequest.to_json())

# convert the object into a dict
connectionsv3_create_settings_request_dict = connectionsv3_create_settings_request_instance.to_dict()
# create an instance of Connectionsv3CreateSettingsRequest from a dict
connectionsv3_create_settings_request_from_dict = Connectionsv3CreateSettingsRequest.from_dict(connectionsv3_create_settings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


