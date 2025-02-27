# Templatesv3TransformTemplateJSONRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **str** | Data used to transform the template. Data is in json string format. | [optional] 
**integration** | [**Templatesv3Integration**](Templatesv3Integration.md) |  | [optional] 
**mime_type** | [**Templatesv3MIMEType**](Templatesv3MIMEType.md) |  | [optional] 
**origin** | [**Templatesv3Origin**](Templatesv3Origin.md) |  | [optional] 
**template_id** | **str** | The ID of the template to be transformed. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.templatesv3_transform_template_json_request import Templatesv3TransformTemplateJSONRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3TransformTemplateJSONRequest from a JSON string
templatesv3_transform_template_json_request_instance = Templatesv3TransformTemplateJSONRequest.from_json(json)
# print the JSON string representation of the object
print(Templatesv3TransformTemplateJSONRequest.to_json())

# convert the object into a dict
templatesv3_transform_template_json_request_dict = templatesv3_transform_template_json_request_instance.to_dict()
# create an instance of Templatesv3TransformTemplateJSONRequest from a dict
templatesv3_transform_template_json_request_from_dict = Templatesv3TransformTemplateJSONRequest.from_dict(templatesv3_transform_template_json_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


