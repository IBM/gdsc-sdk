# Assetsv3AssetFilterTemplateRequest

AssetFilterTemplateRequest - Request parameters for deleteing filter template or getting filter templates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_asset_filter_template_request import Assetsv3AssetFilterTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetFilterTemplateRequest from a JSON string
assetsv3_asset_filter_template_request_instance = Assetsv3AssetFilterTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetFilterTemplateRequest.to_json())

# convert the object into a dict
assetsv3_asset_filter_template_request_dict = assetsv3_asset_filter_template_request_instance.to_dict()
# create an instance of Assetsv3AssetFilterTemplateRequest from a dict
assetsv3_asset_filter_template_request_from_dict = Assetsv3AssetFilterTemplateRequest.from_dict(assetsv3_asset_filter_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


