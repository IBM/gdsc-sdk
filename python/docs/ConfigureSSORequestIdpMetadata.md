# ConfigureSSORequestIdpMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idp_metadata_url** | **str** |  | 
**idp_metadata_content** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.configure_sso_request_idp_metadata import ConfigureSSORequestIdpMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of ConfigureSSORequestIdpMetadata from a JSON string
configure_sso_request_idp_metadata_instance = ConfigureSSORequestIdpMetadata.from_json(json)
# print the JSON string representation of the object
print(ConfigureSSORequestIdpMetadata.to_json())

# convert the object into a dict
configure_sso_request_idp_metadata_dict = configure_sso_request_idp_metadata_instance.to_dict()
# create an instance of ConfigureSSORequestIdpMetadata from a dict
configure_sso_request_idp_metadata_from_dict = ConfigureSSORequestIdpMetadata.from_dict(configure_sso_request_idp_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


