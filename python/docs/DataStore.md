# DataStore


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_store_id** | **str** |  | 
**data_store_type** | **str** |  | 
**data_store_name** | **str** |  | 
**cloud_account_details** | [**CloudAccountDetails**](CloudAccountDetails.md) |  | 
**cloud_region** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**classification_status** | [**ClassificationStatus**](ClassificationStatus.md) |  | [optional] 
**encryption_status** | [**DataStoreEncryptionStatus**](DataStoreEncryptionStatus.md) |  | [optional] 
**custom_data** | [**List[StringKeyValue]**](StringKeyValue.md) |  | [optional] 
**label** | **str** |  | [optional] 
**data_custodian** | **str** |  | [optional] 
**cloud_tags** | [**List[StringKeyValue]**](StringKeyValue.md) |  | [optional] 
**is_backed_up** | **bool** |  | [optional] 
**managed** | **bool** |  | [optional] 
**vpc_id** | **str** |  | [optional] 
**stats** | [**DataStoreStats**](DataStoreStats.md) |  | [optional] 
**source** | [**DataStoreSource**](DataStoreSource.md) |  | [optional] 
**data_store_url** | **str** |  | [optional] 
**classification_error_message** | **str** |  | [optional] 
**last_classification_date** | **float** |  | [optional] 
**unsupported_reason** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.data_store import DataStore

# TODO update the JSON string below
json = "{}"
# create an instance of DataStore from a JSON string
data_store_instance = DataStore.from_json(json)
# print the JSON string representation of the object
print(DataStore.to_json())

# convert the object into a dict
data_store_dict = data_store_instance.to_dict()
# create an instance of DataStore from a dict
data_store_from_dict = DataStore.from_dict(data_store_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


