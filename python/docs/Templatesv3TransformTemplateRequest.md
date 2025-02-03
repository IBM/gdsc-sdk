# Templatesv3TransformTemplateRequest

Transforms a template into a fully resolved version with data substitution.  The template is defined by the specified  template id or is dynamically located base on the supplied Integration, Origin and MIMEType.  The data supplied  must match the substitution fields associated with the evaluated template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **Dict[str, str]** | Data used to transform the template. | [optional] 
**integration** | [**Templatesv3Integration**](Templatesv3Integration.md) |  | [optional] 
**mime_type** | [**Templatesv3MIMEType**](Templatesv3MIMEType.md) |  | [optional] 
**origin** | [**Templatesv3Origin**](Templatesv3Origin.md) |  | [optional] 
**template_id** | **str** | The ID of the template to be transformed. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.templatesv3_transform_template_request import Templatesv3TransformTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3TransformTemplateRequest from a JSON string
templatesv3_transform_template_request_instance = Templatesv3TransformTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(Templatesv3TransformTemplateRequest.to_json())

# convert the object into a dict
templatesv3_transform_template_request_dict = templatesv3_transform_template_request_instance.to_dict()
# create an instance of Templatesv3TransformTemplateRequest from a dict
templatesv3_transform_template_request_from_dict = Templatesv3TransformTemplateRequest.from_dict(templatesv3_transform_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


