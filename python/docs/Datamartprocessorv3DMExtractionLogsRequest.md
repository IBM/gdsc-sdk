# Datamartprocessorv3DMExtractionLogsRequest

DMExtractionLogsRequest request object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **str** | Report data. | [optional] 
**request_id** | **str** | Request id which co-relates to request. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.datamartprocessorv3_dm_extraction_logs_request import Datamartprocessorv3DMExtractionLogsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Datamartprocessorv3DMExtractionLogsRequest from a JSON string
datamartprocessorv3_dm_extraction_logs_request_instance = Datamartprocessorv3DMExtractionLogsRequest.from_json(json)
# print the JSON string representation of the object
print(Datamartprocessorv3DMExtractionLogsRequest.to_json())

# convert the object into a dict
datamartprocessorv3_dm_extraction_logs_request_dict = datamartprocessorv3_dm_extraction_logs_request_instance.to_dict()
# create an instance of Datamartprocessorv3DMExtractionLogsRequest from a dict
datamartprocessorv3_dm_extraction_logs_request_from_dict = Datamartprocessorv3DMExtractionLogsRequest.from_dict(datamartprocessorv3_dm_extraction_logs_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


