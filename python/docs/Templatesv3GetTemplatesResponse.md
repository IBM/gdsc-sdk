# Templatesv3GetTemplatesResponse

The templates that match the specified criteria; an empty array is returned if no templates match.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 
**template** | [**List[Templatesv3Template]**](Templatesv3Template.md) | List of templates that match the specified filters. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.templatesv3_get_templates_response import Templatesv3GetTemplatesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3GetTemplatesResponse from a JSON string
templatesv3_get_templates_response_instance = Templatesv3GetTemplatesResponse.from_json(json)
# print the JSON string representation of the object
print(Templatesv3GetTemplatesResponse.to_json())

# convert the object into a dict
templatesv3_get_templates_response_dict = templatesv3_get_templates_response_instance.to_dict()
# create an instance of Templatesv3GetTemplatesResponse from a dict
templatesv3_get_templates_response_from_dict = Templatesv3GetTemplatesResponse.from_dict(templatesv3_get_templates_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


