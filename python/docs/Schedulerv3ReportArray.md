# Schedulerv3ReportArray

ReportArray is an array of report names for ScheduledJobSummaryResponse.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_name** | **List[str]** | Array of the name needed. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_report_array import Schedulerv3ReportArray

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3ReportArray from a JSON string
schedulerv3_report_array_instance = Schedulerv3ReportArray.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3ReportArray.to_json())

# convert the object into a dict
schedulerv3_report_array_dict = schedulerv3_report_array_instance.to_dict()
# create an instance of Schedulerv3ReportArray from a dict
schedulerv3_report_array_from_dict = Schedulerv3ReportArray.from_dict(schedulerv3_report_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


