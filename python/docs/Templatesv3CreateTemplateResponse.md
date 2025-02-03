# Templatesv3CreateTemplateResponse

Response with the template id for the created template; empty string is returned if not created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 
**template_id** | **str** | Unique ID for the created template; empty string on failure. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.templatesv3_create_template_response import Templatesv3CreateTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3CreateTemplateResponse from a JSON string
templatesv3_create_template_response_instance = Templatesv3CreateTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(Templatesv3CreateTemplateResponse.to_json())

# convert the object into a dict
templatesv3_create_template_response_dict = templatesv3_create_template_response_instance.to_dict()
# create an instance of Templatesv3CreateTemplateResponse from a dict
templatesv3_create_template_response_from_dict = Templatesv3CreateTemplateResponse.from_dict(templatesv3_create_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


