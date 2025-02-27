# Workflowv3ReportResult

ReportResult - contains columns and rows in JSON format.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | [**List[Workflowv3ReportResultHeader]**](Workflowv3ReportResultHeader.md) | Header for exported report csv. | [optional] 
**rows** | [**List[Workflowv3ReportResultRow]**](Workflowv3ReportResultRow.md) | Data for exported report csv. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_report_result import Workflowv3ReportResult

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3ReportResult from a JSON string
workflowv3_report_result_instance = Workflowv3ReportResult.from_json(json)
# print the JSON string representation of the object
print(Workflowv3ReportResult.to_json())

# convert the object into a dict
workflowv3_report_result_dict = workflowv3_report_result_instance.to_dict()
# create an instance of Workflowv3ReportResult from a dict
workflowv3_report_result_from_dict = Workflowv3ReportResult.from_dict(workflowv3_report_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


