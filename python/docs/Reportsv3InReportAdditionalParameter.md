# Reportsv3InReportAdditionalParameter

InReportAdditionalParameter that holds dateRange information of subquery reports.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_range** | [**Reportsv3DateRange**](Reportsv3DateRange.md) |  | [optional] 
**header_name** | **str** | Header Name of subquery. | [optional] 
**report_id** | **str** | Report ID of subquery. | [optional] 
**table_name** | **str** | Table Name of subquery. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_in_report_additional_parameter import Reportsv3InReportAdditionalParameter

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3InReportAdditionalParameter from a JSON string
reportsv3_in_report_additional_parameter_instance = Reportsv3InReportAdditionalParameter.from_json(json)
# print the JSON string representation of the object
print(Reportsv3InReportAdditionalParameter.to_json())

# convert the object into a dict
reportsv3_in_report_additional_parameter_dict = reportsv3_in_report_additional_parameter_instance.to_dict()
# create an instance of Reportsv3InReportAdditionalParameter from a dict
reportsv3_in_report_additional_parameter_from_dict = Reportsv3InReportAdditionalParameter.from_dict(reportsv3_in_report_additional_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


