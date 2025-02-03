# Templatesv3UpdateTemplateResponse

Success when the specified template has been updated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.templatesv3_update_template_response import Templatesv3UpdateTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3UpdateTemplateResponse from a JSON string
templatesv3_update_template_response_instance = Templatesv3UpdateTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(Templatesv3UpdateTemplateResponse.to_json())

# convert the object into a dict
templatesv3_update_template_response_dict = templatesv3_update_template_response_instance.to_dict()
# create an instance of Templatesv3UpdateTemplateResponse from a dict
templatesv3_update_template_response_from_dict = Templatesv3UpdateTemplateResponse.from_dict(templatesv3_update_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


