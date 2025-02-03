# Templatesv3TransformTemplateResponse

Returns the results of the template being transformed or empty string (with error) when not able to process.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | Content is a fully formatted transformation of the template content based on supplied data; empty string on error. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 
**title** | **str** | Title is a fully formatted transformation of the template title based on supplied data; empty string on error. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.templatesv3_transform_template_response import Templatesv3TransformTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3TransformTemplateResponse from a JSON string
templatesv3_transform_template_response_instance = Templatesv3TransformTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(Templatesv3TransformTemplateResponse.to_json())

# convert the object into a dict
templatesv3_transform_template_response_dict = templatesv3_transform_template_response_instance.to_dict()
# create an instance of Templatesv3TransformTemplateResponse from a dict
templatesv3_transform_template_response_from_dict = Templatesv3TransformTemplateResponse.from_dict(templatesv3_transform_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


