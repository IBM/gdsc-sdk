# Templatesv3DeleteIntegrationResponse

Success when the templates associated with the integration id have been deleted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.templatesv3_delete_integration_response import Templatesv3DeleteIntegrationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3DeleteIntegrationResponse from a JSON string
templatesv3_delete_integration_response_instance = Templatesv3DeleteIntegrationResponse.from_json(json)
# print the JSON string representation of the object
print(Templatesv3DeleteIntegrationResponse.to_json())

# convert the object into a dict
templatesv3_delete_integration_response_dict = templatesv3_delete_integration_response_instance.to_dict()
# create an instance of Templatesv3DeleteIntegrationResponse from a dict
templatesv3_delete_integration_response_from_dict = Templatesv3DeleteIntegrationResponse.from_dict(templatesv3_delete_integration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


