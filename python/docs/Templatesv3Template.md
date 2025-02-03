# Templatesv3Template

The contents of a specific template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | Content of the message with field substitution sequences. | [optional] 
**default_recipient** | [**Templatesv3SimpleRecipient**](Templatesv3SimpleRecipient.md) |  | [optional] 
**integration** | [**Templatesv3Integration**](Templatesv3Integration.md) |  | [optional] 
**integration_id** | **str** | Integration ID specifies the specific integration this template is associated. | [optional] 
**integration_name** | **str** | Name associated with the integration; optionally added based on need and performance. | [optional] 
**is_default** | **bool** | Specifies the default template for the associated data source. | [optional] 
**is_enabled** | **bool** | Enabled defines the set of templates that are actively used. | [optional] 
**mime_type** | [**Templatesv3MIMEType**](Templatesv3MIMEType.md) |  | [optional] 
**name** | **str** | User friendly name associated with the template. | [optional] 
**order** | **int** | Order by most significant origin. | [optional] 
**origin** | [**Templatesv3Origin**](Templatesv3Origin.md) |  | [optional] 
**tags** | **List[str]** | User defined tags that can be used to filter templates. | [optional] 
**template_id** | **str** | Template unique ID. | [optional] 
**title** | **str** | Title is a brief summary of the data; may be empty based on integration type. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.templatesv3_template import Templatesv3Template

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3Template from a JSON string
templatesv3_template_instance = Templatesv3Template.from_json(json)
# print the JSON string representation of the object
print(Templatesv3Template.to_json())

# convert the object into a dict
templatesv3_template_dict = templatesv3_template_instance.to_dict()
# create an instance of Templatesv3Template from a dict
templatesv3_template_from_dict = Templatesv3Template.from_dict(templatesv3_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


