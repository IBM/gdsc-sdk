# Reportsv3CreateReportRequest

CreateReportRequest is the argument type used to create a report with the CreateReport() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_definition** | [**Reportsv3ReportDefinition**](Reportsv3ReportDefinition.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_create_report_request import Reportsv3CreateReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateReportRequest from a JSON string
reportsv3_create_report_request_instance = Reportsv3CreateReportRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateReportRequest.to_json())

# convert the object into a dict
reportsv3_create_report_request_dict = reportsv3_create_report_request_instance.to_dict()
# create an instance of Reportsv3CreateReportRequest from a dict
reportsv3_create_report_request_from_dict = Reportsv3CreateReportRequest.from_dict(reportsv3_create_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


