# Assetsv3SaveUpdateFilterTemplateRequest

SaveUpdateFilterTemplateRequest - Save Filter Template request for save filters query as template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_default** | **bool** |  | [optional] 
**template** | [**Assetsv3FilterTemplate**](Assetsv3FilterTemplate.md) |  | [optional] 
**template_ids_list** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_save_update_filter_template_request import Assetsv3SaveUpdateFilterTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3SaveUpdateFilterTemplateRequest from a JSON string
assetsv3_save_update_filter_template_request_instance = Assetsv3SaveUpdateFilterTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3SaveUpdateFilterTemplateRequest.to_json())

# convert the object into a dict
assetsv3_save_update_filter_template_request_dict = assetsv3_save_update_filter_template_request_instance.to_dict()
# create an instance of Assetsv3SaveUpdateFilterTemplateRequest from a dict
assetsv3_save_update_filter_template_request_from_dict = Assetsv3SaveUpdateFilterTemplateRequest.from_dict(assetsv3_save_update_filter_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


