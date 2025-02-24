# Templatesv3CreateIntegrationResponse

Response with the generated templates for the new integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 
**templates** | [**List[Templatesv3Template]**](Templatesv3Template.md) | New templates created with default values for the new integration. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.templatesv3_create_integration_response import Templatesv3CreateIntegrationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3CreateIntegrationResponse from a JSON string
templatesv3_create_integration_response_instance = Templatesv3CreateIntegrationResponse.from_json(json)
# print the JSON string representation of the object
print(Templatesv3CreateIntegrationResponse.to_json())

# convert the object into a dict
templatesv3_create_integration_response_dict = templatesv3_create_integration_response_instance.to_dict()
# create an instance of Templatesv3CreateIntegrationResponse from a dict
templatesv3_create_integration_response_from_dict = Templatesv3CreateIntegrationResponse.from_dict(templatesv3_create_integration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


