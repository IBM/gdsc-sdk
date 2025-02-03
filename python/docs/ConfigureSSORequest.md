# ConfigureSSORequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_domain** | **str** | The domain from where your SSO emails are provided. | 
**idp_metadata** | [**ConfigureSSORequestIdpMetadata**](ConfigureSSORequestIdpMetadata.md) |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.configure_sso_request import ConfigureSSORequest

# TODO update the JSON string below
json = "{}"
# create an instance of ConfigureSSORequest from a JSON string
configure_sso_request_instance = ConfigureSSORequest.from_json(json)
# print the JSON string representation of the object
print(ConfigureSSORequest.to_json())

# convert the object into a dict
configure_sso_request_dict = configure_sso_request_instance.to_dict()
# create an instance of ConfigureSSORequest from a dict
configure_sso_request_from_dict = ConfigureSSORequest.from_dict(configure_sso_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


