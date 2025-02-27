# Templatesv3GetTemplatesForEdgeResponse

The templates that match the specified criteria; an empty array is returned if no templates match.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 
**template** | [**List[Templatesv3Template]**](Templatesv3Template.md) | List of templates that match the specified filters. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.templatesv3_get_templates_for_edge_response import Templatesv3GetTemplatesForEdgeResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3GetTemplatesForEdgeResponse from a JSON string
templatesv3_get_templates_for_edge_response_instance = Templatesv3GetTemplatesForEdgeResponse.from_json(json)
# print the JSON string representation of the object
print(Templatesv3GetTemplatesForEdgeResponse.to_json())

# convert the object into a dict
templatesv3_get_templates_for_edge_response_dict = templatesv3_get_templates_for_edge_response_instance.to_dict()
# create an instance of Templatesv3GetTemplatesForEdgeResponse from a dict
templatesv3_get_templates_for_edge_response_from_dict = Templatesv3GetTemplatesForEdgeResponse.from_dict(templatesv3_get_templates_for_edge_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


