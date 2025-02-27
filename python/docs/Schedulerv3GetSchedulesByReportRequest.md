# Schedulerv3GetSchedulesByReportRequest

GetSchedulesByReportIdRequest - pass the report_id you wish to query for.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_id** | **str** | Report ID for the scheduled report. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_get_schedules_by_report_request import Schedulerv3GetSchedulesByReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3GetSchedulesByReportRequest from a JSON string
schedulerv3_get_schedules_by_report_request_instance = Schedulerv3GetSchedulesByReportRequest.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3GetSchedulesByReportRequest.to_json())

# convert the object into a dict
schedulerv3_get_schedules_by_report_request_dict = schedulerv3_get_schedules_by_report_request_instance.to_dict()
# create an instance of Schedulerv3GetSchedulesByReportRequest from a dict
schedulerv3_get_schedules_by_report_request_from_dict = Schedulerv3GetSchedulesByReportRequest.from_dict(schedulerv3_get_schedules_by_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


