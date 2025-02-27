# Datamartprocessorv3DatamartFileInfo

File object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **str** | Errors if any. | [optional] 
**failed_state** | **bool** | If the file is in failed state, usually means failed permanently. | [optional] 
**file_name** | **str** | Filename. | [optional] 
**file_status** | **int** | Status of the file. | [optional] 
**ingest_record_count** | **int** | Total numbers of records ingested for this file in Insights. | [optional] 
**retry_count** | **int** | Total number of times file has been retried. | [optional] 
**retry_end_time** | **datetime** | End time of last retry attempt. | [optional] 
**retry_start_time** | **datetime** | Start time of last retry attempt. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.datamartprocessorv3_datamart_file_info import Datamartprocessorv3DatamartFileInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Datamartprocessorv3DatamartFileInfo from a JSON string
datamartprocessorv3_datamart_file_info_instance = Datamartprocessorv3DatamartFileInfo.from_json(json)
# print the JSON string representation of the object
print(Datamartprocessorv3DatamartFileInfo.to_json())

# convert the object into a dict
datamartprocessorv3_datamart_file_info_dict = datamartprocessorv3_datamart_file_info_instance.to_dict()
# create an instance of Datamartprocessorv3DatamartFileInfo from a dict
datamartprocessorv3_datamart_file_info_from_dict = Datamartprocessorv3DatamartFileInfo.from_dict(datamartprocessorv3_datamart_file_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


