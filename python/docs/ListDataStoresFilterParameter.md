# ListDataStoresFilterParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**store_types_family** | **List[str]** |  | [optional] 
**store_names** | **List[str]** |  | [optional] 
**store_types** | **List[str]** |  | [optional] 
**service_providers** | [**List[ServiceProvider]**](ServiceProvider.md) |  | [optional] 
**cloud_account_ids** | **List[str]** |  | [optional] 
**cloud_regions** | **List[str]** |  | [optional] 
**labels** | **List[str]** |  | [optional] 
**classification_statuses** | [**List[StoreClassificationStatus]**](StoreClassificationStatus.md) |  | [optional] 
**sensitivity_tags** | **List[str]** |  | [optional] 
**sensitivity_categories** | [**List[SensitivityCategory]**](SensitivityCategory.md) |  | [optional] 
**compliances** | [**List[Compliance]**](Compliance.md) |  | [optional] 
**cloud_tags** | **List[str]** |  | [optional] 
**encryption_statuses** | [**List[DataStoreEncryptionStatus]**](DataStoreEncryptionStatus.md) |  | [optional] 
**store_partial_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.list_data_stores_filter_parameter import ListDataStoresFilterParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListDataStoresFilterParameter from a JSON string
list_data_stores_filter_parameter_instance = ListDataStoresFilterParameter.from_json(json)
# print the JSON string representation of the object
print(ListDataStoresFilterParameter.to_json())

# convert the object into a dict
list_data_stores_filter_parameter_dict = list_data_stores_filter_parameter_instance.to_dict()
# create an instance of ListDataStoresFilterParameter from a dict
list_data_stores_filter_parameter_from_dict = ListDataStoresFilterParameter.from_dict(list_data_stores_filter_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


