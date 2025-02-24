# Workflowv3ReportResultRow

ReportResultRow - contains one row of data mapped to header key.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**row** | **Dict[str, str]** | One row data from exported report csv file. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_report_result_row import Workflowv3ReportResultRow

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3ReportResultRow from a JSON string
workflowv3_report_result_row_instance = Workflowv3ReportResultRow.from_json(json)
# print the JSON string representation of the object
print(Workflowv3ReportResultRow.to_json())

# convert the object into a dict
workflowv3_report_result_row_dict = workflowv3_report_result_row_instance.to_dict()
# create an instance of Workflowv3ReportResultRow from a dict
workflowv3_report_result_row_from_dict = Workflowv3ReportResultRow.from_dict(workflowv3_report_result_row_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


