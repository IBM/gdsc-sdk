# LinkedAccounts


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_account_id** | **str** |  | 
**cloud_account_name** | **str** |  | 
**is_main_cloud_account** | **bool** |  | 
**installation_status** | [**InstallationStatus**](InstallationStatus.md) |  | 
**service_provider** | [**ServiceProvider**](ServiceProvider.md) |  | 
**region_availability** | **Dict[str, bool]** |  | [optional] 
**regions** | [**List[AnalyzedRegion]**](AnalyzedRegion.md) |  | 
**creation_time** | **float** |  | [optional] 
**environment** | [**Environment**](Environment.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.linked_accounts import LinkedAccounts

# TODO update the JSON string below
json = "{}"
# create an instance of LinkedAccounts from a JSON string
linked_accounts_instance = LinkedAccounts.from_json(json)
# print the JSON string representation of the object
print(LinkedAccounts.to_json())

# convert the object into a dict
linked_accounts_dict = linked_accounts_instance.to_dict()
# create an instance of LinkedAccounts from a dict
linked_accounts_from_dict = LinkedAccounts.from_dict(linked_accounts_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


