# Templatesv3TestTemplateResponse

Returns the results of the template being processed or empty string (with error) when not able to process.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **str** | Result is a fully formatted example of the template; empty string on error. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.templatesv3_test_template_response import Templatesv3TestTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3TestTemplateResponse from a JSON string
templatesv3_test_template_response_instance = Templatesv3TestTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(Templatesv3TestTemplateResponse.to_json())

# convert the object into a dict
templatesv3_test_template_response_dict = templatesv3_test_template_response_instance.to_dict()
# create an instance of Templatesv3TestTemplateResponse from a dict
templatesv3_test_template_response_from_dict = Templatesv3TestTemplateResponse.from_dict(templatesv3_test_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


