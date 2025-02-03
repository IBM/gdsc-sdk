# Reportsv3ReportFilter

ReportFilter represents a report filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brackets** | [**Reportsv3ReportFilterBrackets**](Reportsv3ReportFilterBrackets.md) |  | [optional] 
**condition** | [**Reportsv3ReportFilterCondition**](Reportsv3ReportFilterCondition.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_report_filter import Reportsv3ReportFilter

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ReportFilter from a JSON string
reportsv3_report_filter_instance = Reportsv3ReportFilter.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ReportFilter.to_json())

# convert the object into a dict
reportsv3_report_filter_dict = reportsv3_report_filter_instance.to_dict()
# create an instance of Reportsv3ReportFilter from a dict
reportsv3_report_filter_from_dict = Reportsv3ReportFilter.from_dict(reportsv3_report_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


