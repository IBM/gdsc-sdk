# Assetsv3SetBannerStateRequest

SetBannerStateRequest - Set state of asset inventory banner.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hide_assets_banner** | **bool** | bool to set if banner to hidden or not. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_set_banner_state_request import Assetsv3SetBannerStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3SetBannerStateRequest from a JSON string
assetsv3_set_banner_state_request_instance = Assetsv3SetBannerStateRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3SetBannerStateRequest.to_json())

# convert the object into a dict
assetsv3_set_banner_state_request_dict = assetsv3_set_banner_state_request_instance.to_dict()
# create an instance of Assetsv3SetBannerStateRequest from a dict
assetsv3_set_banner_state_request_from_dict = Assetsv3SetBannerStateRequest.from_dict(assetsv3_set_banner_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


