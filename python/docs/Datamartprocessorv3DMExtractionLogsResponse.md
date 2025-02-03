# Datamartprocessorv3DMExtractionLogsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response** | **str** | Response message for GDP. | [optional] 
**response_code** | **str** | Translatable response code or empty string if there is no response. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.datamartprocessorv3_dm_extraction_logs_response import Datamartprocessorv3DMExtractionLogsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Datamartprocessorv3DMExtractionLogsResponse from a JSON string
datamartprocessorv3_dm_extraction_logs_response_instance = Datamartprocessorv3DMExtractionLogsResponse.from_json(json)
# print the JSON string representation of the object
print(Datamartprocessorv3DMExtractionLogsResponse.to_json())

# convert the object into a dict
datamartprocessorv3_dm_extraction_logs_response_dict = datamartprocessorv3_dm_extraction_logs_response_instance.to_dict()
# create an instance of Datamartprocessorv3DMExtractionLogsResponse from a dict
datamartprocessorv3_dm_extraction_logs_response_from_dict = Datamartprocessorv3DMExtractionLogsResponse.from_dict(datamartprocessorv3_dm_extraction_logs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


