# Reportsrunnerv3GetReportColumnFacetResponse

GetReportDataCountResponse is the argument get counts for given column.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**facet** | [**List[Reportsrunnerv3Filter]**](Reportsrunnerv3Filter.md) |  | [optional] 
**facet_selected_header** | [**Reportsv3ReportHeader**](Reportsv3ReportHeader.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_get_report_column_facet_response import Reportsrunnerv3GetReportColumnFacetResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3GetReportColumnFacetResponse from a JSON string
reportsrunnerv3_get_report_column_facet_response_instance = Reportsrunnerv3GetReportColumnFacetResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3GetReportColumnFacetResponse.to_json())

# convert the object into a dict
reportsrunnerv3_get_report_column_facet_response_dict = reportsrunnerv3_get_report_column_facet_response_instance.to_dict()
# create an instance of Reportsrunnerv3GetReportColumnFacetResponse from a dict
reportsrunnerv3_get_report_column_facet_response_from_dict = Reportsrunnerv3GetReportColumnFacetResponse.from_dict(reportsrunnerv3_get_report_column_facet_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


