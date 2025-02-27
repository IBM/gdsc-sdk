# Connectionsv3UpdateBannerStateRequest

UpdateBannerStateRequest - Set state of object verb banner.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hide_object_verb_banner** | **bool** | bool to set if banner to hidden or not. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_update_banner_state_request import Connectionsv3UpdateBannerStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3UpdateBannerStateRequest from a JSON string
connectionsv3_update_banner_state_request_instance = Connectionsv3UpdateBannerStateRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3UpdateBannerStateRequest.to_json())

# convert the object into a dict
connectionsv3_update_banner_state_request_dict = connectionsv3_update_banner_state_request_instance.to_dict()
# create an instance of Connectionsv3UpdateBannerStateRequest from a dict
connectionsv3_update_banner_state_request_from_dict = Connectionsv3UpdateBannerStateRequest.from_dict(connectionsv3_update_banner_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


