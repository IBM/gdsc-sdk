# Templatesv3UpdateTemplateRequest

Request to update the specified template, the id must be specified and exist for the update to complete.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template** | [**Templatesv3Template**](Templatesv3Template.md) |  | [optional] 
**template_id** | **str** | The template id to update. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.templatesv3_update_template_request import Templatesv3UpdateTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3UpdateTemplateRequest from a JSON string
templatesv3_update_template_request_instance = Templatesv3UpdateTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(Templatesv3UpdateTemplateRequest.to_json())

# convert the object into a dict
templatesv3_update_template_request_dict = templatesv3_update_template_request_instance.to_dict()
# create an instance of Templatesv3UpdateTemplateRequest from a dict
templatesv3_update_template_request_from_dict = Templatesv3UpdateTemplateRequest.from_dict(templatesv3_update_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


