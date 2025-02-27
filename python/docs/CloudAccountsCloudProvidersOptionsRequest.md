# CloudAccountsCloudProvidersOptionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_provider** | [**CloudServiceProvider**](CloudServiceProvider.md) |  | 
**cloud_accounts** | [**List[CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner]**](CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.md) |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.cloud_accounts_cloud_providers_options_request import CloudAccountsCloudProvidersOptionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CloudAccountsCloudProvidersOptionsRequest from a JSON string
cloud_accounts_cloud_providers_options_request_instance = CloudAccountsCloudProvidersOptionsRequest.from_json(json)
# print the JSON string representation of the object
print(CloudAccountsCloudProvidersOptionsRequest.to_json())

# convert the object into a dict
cloud_accounts_cloud_providers_options_request_dict = cloud_accounts_cloud_providers_options_request_instance.to_dict()
# create an instance of CloudAccountsCloudProvidersOptionsRequest from a dict
cloud_accounts_cloud_providers_options_request_from_dict = CloudAccountsCloudProvidersOptionsRequest.from_dict(cloud_accounts_cloud_providers_options_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


