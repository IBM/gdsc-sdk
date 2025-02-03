# CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_account_id** | **str** |  | 
**cloud_account_name** | **str** |  | 
**environment** | [**Environment**](Environment.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.cloud_accounts_cloud_providers_options_request_cloud_accounts_inner import CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner from a JSON string
cloud_accounts_cloud_providers_options_request_cloud_accounts_inner_instance = CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.from_json(json)
# print the JSON string representation of the object
print(CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.to_json())

# convert the object into a dict
cloud_accounts_cloud_providers_options_request_cloud_accounts_inner_dict = cloud_accounts_cloud_providers_options_request_cloud_accounts_inner_instance.to_dict()
# create an instance of CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner from a dict
cloud_accounts_cloud_providers_options_request_cloud_accounts_inner_from_dict = CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.from_dict(cloud_accounts_cloud_providers_options_request_cloud_accounts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


