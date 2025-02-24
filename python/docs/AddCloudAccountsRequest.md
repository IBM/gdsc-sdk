# AddCloudAccountsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_provider** | [**CloudServiceProvider**](CloudServiceProvider.md) |  | 
**cloud_accounts** | [**List[AddCloudAccountsRequestCloudAccountsInner]**](AddCloudAccountsRequestCloudAccountsInner.md) |  | 
**main_account_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.add_cloud_accounts_request import AddCloudAccountsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AddCloudAccountsRequest from a JSON string
add_cloud_accounts_request_instance = AddCloudAccountsRequest.from_json(json)
# print the JSON string representation of the object
print(AddCloudAccountsRequest.to_json())

# convert the object into a dict
add_cloud_accounts_request_dict = add_cloud_accounts_request_instance.to_dict()
# create an instance of AddCloudAccountsRequest from a dict
add_cloud_accounts_request_from_dict = AddCloudAccountsRequest.from_dict(add_cloud_accounts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


