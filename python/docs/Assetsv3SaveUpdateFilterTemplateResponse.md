# Assetsv3SaveUpdateFilterTemplateResponse

SaveUpdateFilterTemplateResponse - Save/Update Filter Template response for save filters query as template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template_id** | **str** | Template ID which was inserted/updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_save_update_filter_template_response import Assetsv3SaveUpdateFilterTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3SaveUpdateFilterTemplateResponse from a JSON string
assetsv3_save_update_filter_template_response_instance = Assetsv3SaveUpdateFilterTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3SaveUpdateFilterTemplateResponse.to_json())

# convert the object into a dict
assetsv3_save_update_filter_template_response_dict = assetsv3_save_update_filter_template_response_instance.to_dict()
# create an instance of Assetsv3SaveUpdateFilterTemplateResponse from a dict
assetsv3_save_update_filter_template_response_from_dict = Assetsv3SaveUpdateFilterTemplateResponse.from_dict(assetsv3_save_update_filter_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


