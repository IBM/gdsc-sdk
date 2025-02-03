# Reportsv3GetReportQueryResponse

GetReportQueryResponse is the return type of the GetQueryByReportID() and GetQueryByReportDefinition() apis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **str** | The report&#39;s query. | [optional] 
**report_layout** | [**Reportsv3ReportDisplayLayout**](Reportsv3ReportDisplayLayout.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_get_report_query_response import Reportsv3GetReportQueryResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetReportQueryResponse from a JSON string
reportsv3_get_report_query_response_instance = Reportsv3GetReportQueryResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetReportQueryResponse.to_json())

# convert the object into a dict
reportsv3_get_report_query_response_dict = reportsv3_get_report_query_response_instance.to_dict()
# create an instance of Reportsv3GetReportQueryResponse from a dict
reportsv3_get_report_query_response_from_dict = Reportsv3GetReportQueryResponse.from_dict(reportsv3_get_report_query_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


