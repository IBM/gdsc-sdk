# Connectionsv3UpdateSettingsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settings** | [**List[Connectionsv3ConnectorSetting]**](Connectionsv3ConnectorSetting.md) | The list of settings to update. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_update_settings_request import Connectionsv3UpdateSettingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3UpdateSettingsRequest from a JSON string
connectionsv3_update_settings_request_instance = Connectionsv3UpdateSettingsRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3UpdateSettingsRequest.to_json())

# convert the object into a dict
connectionsv3_update_settings_request_dict = connectionsv3_update_settings_request_instance.to_dict()
# create an instance of Connectionsv3UpdateSettingsRequest from a dict
connectionsv3_update_settings_request_from_dict = Connectionsv3UpdateSettingsRequest.from_dict(connectionsv3_update_settings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


