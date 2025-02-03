# Schedulerv3ReportParameter

ReportParameter includes all the parameters needed to run a report.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**extra_detail** | **str** |  | [optional] 
**report_id** | **str** | Report ID for the scheduled report. | [optional] 
**report_name** | **str** | Optional: Report Name for the scheduled report. | [optional] 
**runtime_parameters** | [**List[Reportsv3RunTimeParameter]**](Reportsv3RunTimeParameter.md) | Optional: Runtime parameters for this report. | [optional] 
**sync_execution_date** | **bool** | Optional: Flag if sync query_from_date when running this report. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_report_parameter import Schedulerv3ReportParameter

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3ReportParameter from a JSON string
schedulerv3_report_parameter_instance = Schedulerv3ReportParameter.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3ReportParameter.to_json())

# convert the object into a dict
schedulerv3_report_parameter_dict = schedulerv3_report_parameter_instance.to_dict()
# create an instance of Schedulerv3ReportParameter from a dict
schedulerv3_report_parameter_from_dict = Schedulerv3ReportParameter.from_dict(schedulerv3_report_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


