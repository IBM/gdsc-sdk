# Templatesv3GetTemplateResponse

The template with the specified id or nil if not found.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 
**template** | [**Templatesv3Template**](Templatesv3Template.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.templatesv3_get_template_response import Templatesv3GetTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3GetTemplateResponse from a JSON string
templatesv3_get_template_response_instance = Templatesv3GetTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(Templatesv3GetTemplateResponse.to_json())

# convert the object into a dict
templatesv3_get_template_response_dict = templatesv3_get_template_response_instance.to_dict()
# create an instance of Templatesv3GetTemplateResponse from a dict
templatesv3_get_template_response_from_dict = Templatesv3GetTemplateResponse.from_dict(templatesv3_get_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


