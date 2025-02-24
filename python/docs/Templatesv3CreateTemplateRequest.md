# Templatesv3CreateTemplateRequest

Request to create a template with the specified content.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template** | [**Templatesv3Template**](Templatesv3Template.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.templatesv3_create_template_request import Templatesv3CreateTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3CreateTemplateRequest from a JSON string
templatesv3_create_template_request_instance = Templatesv3CreateTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(Templatesv3CreateTemplateRequest.to_json())

# convert the object into a dict
templatesv3_create_template_request_dict = templatesv3_create_template_request_instance.to_dict()
# create an instance of Templatesv3CreateTemplateRequest from a dict
templatesv3_create_template_request_from_dict = Templatesv3CreateTemplateRequest.from_dict(templatesv3_create_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


