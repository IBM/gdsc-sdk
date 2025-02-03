# AddCloudAccountsRequestCloudAccountsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_account_id** | **str** |  | 
**cloud_account_name** | **str** |  | 
**environment** | [**Environment**](Environment.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.add_cloud_accounts_request_cloud_accounts_inner import AddCloudAccountsRequestCloudAccountsInner

# TODO update the JSON string below
json = "{}"
# create an instance of AddCloudAccountsRequestCloudAccountsInner from a JSON string
add_cloud_accounts_request_cloud_accounts_inner_instance = AddCloudAccountsRequestCloudAccountsInner.from_json(json)
# print the JSON string representation of the object
print(AddCloudAccountsRequestCloudAccountsInner.to_json())

# convert the object into a dict
add_cloud_accounts_request_cloud_accounts_inner_dict = add_cloud_accounts_request_cloud_accounts_inner_instance.to_dict()
# create an instance of AddCloudAccountsRequestCloudAccountsInner from a dict
add_cloud_accounts_request_cloud_accounts_inner_from_dict = AddCloudAccountsRequestCloudAccountsInner.from_dict(add_cloud_accounts_request_cloud_accounts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


