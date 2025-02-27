# Schedulerv3GetSchedulesByReportResponse

GetSchedulesByReportIdReponse - array of scheduled job IDs that the requested report_id is part of.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schedule_ids** | **List[str]** | List of schedule ids for this report id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_get_schedules_by_report_response import Schedulerv3GetSchedulesByReportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3GetSchedulesByReportResponse from a JSON string
schedulerv3_get_schedules_by_report_response_instance = Schedulerv3GetSchedulesByReportResponse.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3GetSchedulesByReportResponse.to_json())

# convert the object into a dict
schedulerv3_get_schedules_by_report_response_dict = schedulerv3_get_schedules_by_report_response_instance.to_dict()
# create an instance of Schedulerv3GetSchedulesByReportResponse from a dict
schedulerv3_get_schedules_by_report_response_from_dict = Schedulerv3GetSchedulesByReportResponse.from_dict(schedulerv3_get_schedules_by_report_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


