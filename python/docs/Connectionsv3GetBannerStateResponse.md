# Connectionsv3GetBannerStateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hide_object_verb_banner** | **bool** |  | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_get_banner_state_response import Connectionsv3GetBannerStateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GetBannerStateResponse from a JSON string
connectionsv3_get_banner_state_response_instance = Connectionsv3GetBannerStateResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GetBannerStateResponse.to_json())

# convert the object into a dict
connectionsv3_get_banner_state_response_dict = connectionsv3_get_banner_state_response_instance.to_dict()
# create an instance of Connectionsv3GetBannerStateResponse from a dict
connectionsv3_get_banner_state_response_from_dict = Connectionsv3GetBannerStateResponse.from_dict(connectionsv3_get_banner_state_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


