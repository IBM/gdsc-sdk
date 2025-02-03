# CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_provider** | [**CloudServiceProvider**](CloudServiceProvider.md) |  | 
**region** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.cloud_accounts_cloud_providers_analyzed_regions_options_request import CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest from a JSON string
cloud_accounts_cloud_providers_analyzed_regions_options_request_instance = CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.from_json(json)
# print the JSON string representation of the object
print(CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.to_json())

# convert the object into a dict
cloud_accounts_cloud_providers_analyzed_regions_options_request_dict = cloud_accounts_cloud_providers_analyzed_regions_options_request_instance.to_dict()
# create an instance of CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest from a dict
cloud_accounts_cloud_providers_analyzed_regions_options_request_from_dict = CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.from_dict(cloud_accounts_cloud_providers_analyzed_regions_options_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


