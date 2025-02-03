# Reportsv3UpdateReportResponse

UpdateReportResponse contains the report id and schedule flag of the updated report from the UpdateReport() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_scheduled** | **bool** | The is_scheduled is a flag says is report scheduled. | [optional] 
**report_id** | **str** | Unique Report ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_update_report_response import Reportsv3UpdateReportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateReportResponse from a JSON string
reportsv3_update_report_response_instance = Reportsv3UpdateReportResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateReportResponse.to_json())

# convert the object into a dict
reportsv3_update_report_response_dict = reportsv3_update_report_response_instance.to_dict()
# create an instance of Reportsv3UpdateReportResponse from a dict
reportsv3_update_report_response_from_dict = Reportsv3UpdateReportResponse.from_dict(reportsv3_update_report_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


