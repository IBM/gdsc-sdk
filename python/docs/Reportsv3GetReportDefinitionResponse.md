# Reportsv3GetReportDefinitionResponse

GetReportDefinitionResponse is the return type which encapsulates a report definition from the GetReportDefinition() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_settings** | [**Reportsv3ChartSettings**](Reportsv3ChartSettings.md) |  | [optional] 
**report_definition** | [**Reportsv3ReportDefinition**](Reportsv3ReportDefinition.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_get_report_definition_response import Reportsv3GetReportDefinitionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetReportDefinitionResponse from a JSON string
reportsv3_get_report_definition_response_instance = Reportsv3GetReportDefinitionResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetReportDefinitionResponse.to_json())

# convert the object into a dict
reportsv3_get_report_definition_response_dict = reportsv3_get_report_definition_response_instance.to_dict()
# create an instance of Reportsv3GetReportDefinitionResponse from a dict
reportsv3_get_report_definition_response_from_dict = Reportsv3GetReportDefinitionResponse.from_dict(reportsv3_get_report_definition_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


