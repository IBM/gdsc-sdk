# Workflowv3GetReportResultResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**Workflowv3ReportResult**](Workflowv3ReportResult.md) |  | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_get_report_result_response import Workflowv3GetReportResultResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3GetReportResultResponse from a JSON string
workflowv3_get_report_result_response_instance = Workflowv3GetReportResultResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3GetReportResultResponse.to_json())

# convert the object into a dict
workflowv3_get_report_result_response_dict = workflowv3_get_report_result_response_instance.to_dict()
# create an instance of Workflowv3GetReportResultResponse from a dict
workflowv3_get_report_result_response_from_dict = Workflowv3GetReportResultResponse.from_dict(workflowv3_get_report_result_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


