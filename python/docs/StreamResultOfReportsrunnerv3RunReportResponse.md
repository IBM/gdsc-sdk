# StreamResultOfReportsrunnerv3RunReportResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**RuntimeStreamError**](RuntimeStreamError.md) |  | [optional] 
**result** | [**Reportsrunnerv3RunReportResponse**](Reportsrunnerv3RunReportResponse.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.stream_result_of_reportsrunnerv3_run_report_response import StreamResultOfReportsrunnerv3RunReportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of StreamResultOfReportsrunnerv3RunReportResponse from a JSON string
stream_result_of_reportsrunnerv3_run_report_response_instance = StreamResultOfReportsrunnerv3RunReportResponse.from_json(json)
# print the JSON string representation of the object
print(StreamResultOfReportsrunnerv3RunReportResponse.to_json())

# convert the object into a dict
stream_result_of_reportsrunnerv3_run_report_response_dict = stream_result_of_reportsrunnerv3_run_report_response_instance.to_dict()
# create an instance of StreamResultOfReportsrunnerv3RunReportResponse from a dict
stream_result_of_reportsrunnerv3_run_report_response_from_dict = StreamResultOfReportsrunnerv3RunReportResponse.from_dict(stream_result_of_reportsrunnerv3_run_report_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


