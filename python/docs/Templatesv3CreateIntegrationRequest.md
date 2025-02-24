# Templatesv3CreateIntegrationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integration** | [**Templatesv3Integration**](Templatesv3Integration.md) |  | [optional] 
**integration_id** | **str** | Create a new integration with the specified integration id. | [optional] 
**tags** | **str** | The tags help refine the default content of the integrations templates. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.templatesv3_create_integration_request import Templatesv3CreateIntegrationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3CreateIntegrationRequest from a JSON string
templatesv3_create_integration_request_instance = Templatesv3CreateIntegrationRequest.from_json(json)
# print the JSON string representation of the object
print(Templatesv3CreateIntegrationRequest.to_json())

# convert the object into a dict
templatesv3_create_integration_request_dict = templatesv3_create_integration_request_instance.to_dict()
# create an instance of Templatesv3CreateIntegrationRequest from a dict
templatesv3_create_integration_request_from_dict = Templatesv3CreateIntegrationRequest.from_dict(templatesv3_create_integration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


