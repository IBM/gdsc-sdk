# Reportsv3PartialReportUpdateRequest

UpdatePartialReportRequest is the argument type used to update a report with partial information using the UpdatePartialReport() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_chart_expanded** | **bool** | The default_chart_expanded is a flag taken from the user settings collection per report and user. | [optional] 
**is_hidden** | **bool** | Flag to determine weather the report is hidden or not. | [optional] 
**is_pinned** | **bool** | Flag to determine weather the report is pinned or not. | [optional] 
**report_description** | **str** | The report description. | [optional] 
**report_id** | **str** | Unique Report ID. | [optional] 
**report_name** | **str** | The report name. | [optional] 
**report_tags** | [**List[Reportsv3ReportTag]**](Reportsv3ReportTag.md) | The report tags. | [optional] 
**update_mask** | [**ProtobufFieldMask**](ProtobufFieldMask.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_partial_report_update_request import Reportsv3PartialReportUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3PartialReportUpdateRequest from a JSON string
reportsv3_partial_report_update_request_instance = Reportsv3PartialReportUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3PartialReportUpdateRequest.to_json())

# convert the object into a dict
reportsv3_partial_report_update_request_dict = reportsv3_partial_report_update_request_instance.to_dict()
# create an instance of Reportsv3PartialReportUpdateRequest from a dict
reportsv3_partial_report_update_request_from_dict = Reportsv3PartialReportUpdateRequest.from_dict(reportsv3_partial_report_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


