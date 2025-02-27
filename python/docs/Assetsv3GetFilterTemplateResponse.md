# Assetsv3GetFilterTemplateResponse

GetFilterTemplateResponse - Get all filters query template as list.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hide_assets_banner** | **bool** | bool to control if asests banner is going to be hidden. | [optional] 
**templates** | [**List[Assetsv3FilterTemplate]**](Assetsv3FilterTemplate.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_get_filter_template_response import Assetsv3GetFilterTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3GetFilterTemplateResponse from a JSON string
assetsv3_get_filter_template_response_instance = Assetsv3GetFilterTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3GetFilterTemplateResponse.to_json())

# convert the object into a dict
assetsv3_get_filter_template_response_dict = assetsv3_get_filter_template_response_instance.to_dict()
# create an instance of Assetsv3GetFilterTemplateResponse from a dict
assetsv3_get_filter_template_response_from_dict = Assetsv3GetFilterTemplateResponse.from_dict(assetsv3_get_filter_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


