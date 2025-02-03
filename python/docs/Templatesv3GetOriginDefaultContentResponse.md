# Templatesv3GetOriginDefaultContentResponse

The default template content for the specified origin.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_contents** | [**List[Templatesv3DefaultContent]**](Templatesv3DefaultContent.md) | Default contents associated with the origin and MIME type specified; empty string not available. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.templatesv3_get_origin_default_content_response import Templatesv3GetOriginDefaultContentResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3GetOriginDefaultContentResponse from a JSON string
templatesv3_get_origin_default_content_response_instance = Templatesv3GetOriginDefaultContentResponse.from_json(json)
# print the JSON string representation of the object
print(Templatesv3GetOriginDefaultContentResponse.to_json())

# convert the object into a dict
templatesv3_get_origin_default_content_response_dict = templatesv3_get_origin_default_content_response_instance.to_dict()
# create an instance of Templatesv3GetOriginDefaultContentResponse from a dict
templatesv3_get_origin_default_content_response_from_dict = Templatesv3GetOriginDefaultContentResponse.from_dict(templatesv3_get_origin_default_content_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


