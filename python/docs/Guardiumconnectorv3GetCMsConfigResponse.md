# Guardiumconnectorv3GetCMsConfigResponse

Retrieves the list of Central Managers registered to Guardium.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cms** | [**List[Guardiumconnectorv3CM]**](Guardiumconnectorv3CM.md) | List of Central Managers. | [optional] 
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_cms_config_response import Guardiumconnectorv3GetCMsConfigResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetCMsConfigResponse from a JSON string
guardiumconnectorv3_get_cms_config_response_instance = Guardiumconnectorv3GetCMsConfigResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetCMsConfigResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_cms_config_response_dict = guardiumconnectorv3_get_cms_config_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetCMsConfigResponse from a dict
guardiumconnectorv3_get_cms_config_response_from_dict = Guardiumconnectorv3GetCMsConfigResponse.from_dict(guardiumconnectorv3_get_cms_config_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


