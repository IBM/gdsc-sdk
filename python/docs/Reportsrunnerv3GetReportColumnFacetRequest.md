# Reportsrunnerv3GetReportColumnFacetRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_range** | [**Reportsv3DateRange**](Reportsv3DateRange.md) |  | [optional] 
**facet_selected_header** | [**Reportsv3ReportHeader**](Reportsv3ReportHeader.md) |  | [optional] 
**model_type** | [**Reportsv3ModelType**](Reportsv3ModelType.md) |  | [optional] 
**report_definition** | [**Reportsv3ReportDefinition**](Reportsv3ReportDefinition.md) |  | [optional] 
**runtime_parameter_list** | [**List[Reportsv3RunTimeParameter]**](Reportsv3RunTimeParameter.md) | List of runtime parameter if needed. | [optional] 
**time_zone** | **str** | Time zone. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_report_column_facet_request import Reportsrunnerv3GetReportColumnFacetRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3GetReportColumnFacetRequest from a JSON string
reportsrunnerv3_get_report_column_facet_request_instance = Reportsrunnerv3GetReportColumnFacetRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3GetReportColumnFacetRequest.to_json())

# convert the object into a dict
reportsrunnerv3_get_report_column_facet_request_dict = reportsrunnerv3_get_report_column_facet_request_instance.to_dict()
# create an instance of Reportsrunnerv3GetReportColumnFacetRequest from a dict
reportsrunnerv3_get_report_column_facet_request_from_dict = Reportsrunnerv3GetReportColumnFacetRequest.from_dict(reportsrunnerv3_get_report_column_facet_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


