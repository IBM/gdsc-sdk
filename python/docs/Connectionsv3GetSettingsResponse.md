# Connectionsv3GetSettingsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settings** | [**List[Connectionsv3ConnectorSetting]**](Connectionsv3ConnectorSetting.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_get_settings_response import Connectionsv3GetSettingsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GetSettingsResponse from a JSON string
connectionsv3_get_settings_response_instance = Connectionsv3GetSettingsResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GetSettingsResponse.to_json())

# convert the object into a dict
connectionsv3_get_settings_response_dict = connectionsv3_get_settings_response_instance.to_dict()
# create an instance of Connectionsv3GetSettingsResponse from a dict
connectionsv3_get_settings_response_from_dict = Connectionsv3GetSettingsResponse.from_dict(connectionsv3_get_settings_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


