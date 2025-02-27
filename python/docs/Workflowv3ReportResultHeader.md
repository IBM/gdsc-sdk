# Workflowv3ReportResultHeader

ReportResultHeader - column header information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**header** | **str** | Name for report header. | [optional] 
**key** | **str** | Key for report header. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_report_result_header import Workflowv3ReportResultHeader

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3ReportResultHeader from a JSON string
workflowv3_report_result_header_instance = Workflowv3ReportResultHeader.from_json(json)
# print the JSON string representation of the object
print(Workflowv3ReportResultHeader.to_json())

# convert the object into a dict
workflowv3_report_result_header_dict = workflowv3_report_result_header_instance.to_dict()
# create an instance of Workflowv3ReportResultHeader from a dict
workflowv3_report_result_header_from_dict = Workflowv3ReportResultHeader.from_dict(workflowv3_report_result_header_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


