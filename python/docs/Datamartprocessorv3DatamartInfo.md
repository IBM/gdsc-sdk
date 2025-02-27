# Datamartprocessorv3DatamartInfo

DatamartInfo is the object containing all info of a datamart.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current_ts** | **datetime** | Timestamp in UTC when the entry was made. | [optional] 
**data_type** | **str** | Type of datamart. | [optional] 
**error** | **str** | Errors if any. | [optional] 
**export_record_count** | **int** | Total records exported from GDP. | [optional] 
**export_status** | **int** | Export status of datamart. | [optional] 
**failure_file_count** | **int** | Total failed files in a datamart. | [optional] 
**files** | [**List[Datamartprocessorv3DatamartFileInfo]**](Datamartprocessorv3DatamartFileInfo.md) | File info inside a datamart. | [optional] 
**gdp_hostname** | **str** | GDP hostname. | [optional] 
**ingest_record_count** | **int** | Total numbers of records ingested for this datamart. | [optional] 
**ingest_status** | **int** | Ingest status of datamart. | [optional] 
**ingestion_id** | **str** | Ingestion id. | [optional] 
**period_end** | **datetime** | Wnding time period of data in datamart. | [optional] 
**period_start** | **datetime** | Starting time period of data in datamart. | [optional] 
**success_file_count** | **int** | Total successful files in a datamart. | [optional] 
**total_file_count** | **int** | Total file count inside a datamart. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.datamartprocessorv3_datamart_info import Datamartprocessorv3DatamartInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Datamartprocessorv3DatamartInfo from a JSON string
datamartprocessorv3_datamart_info_instance = Datamartprocessorv3DatamartInfo.from_json(json)
# print the JSON string representation of the object
print(Datamartprocessorv3DatamartInfo.to_json())

# convert the object into a dict
datamartprocessorv3_datamart_info_dict = datamartprocessorv3_datamart_info_instance.to_dict()
# create an instance of Datamartprocessorv3DatamartInfo from a dict
datamartprocessorv3_datamart_info_from_dict = Datamartprocessorv3DatamartInfo.from_dict(datamartprocessorv3_datamart_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


