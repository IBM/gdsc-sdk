# Reportsv3ReportFilterBrackets

ReportFilterBrackets represents a report filter bracket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brackets_id** | **int** | Brackets ID. | [optional] 
**filter_name** | **str** | Optional: Allow for naming of custom filters. | [optional] 
**filters_array** | [**List[Reportsv3ReportFilter]**](Reportsv3ReportFilter.md) | Filters Array. | [optional] 
**having_array** | [**List[Reportsv3ReportAggFilter]**](Reportsv3ReportAggFilter.md) |  | [optional] 
**is_custom** | **bool** | Optional: Indicate if this is a custom filter in the UI. | [optional] 
**option_type** | [**Reportsv3OptionType**](Reportsv3OptionType.md) |  | [optional] [default to Reportsv3OptionType.UNDEFINED_OPTION_TYPE]
**sequence** | **int** | Filter sequence. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_report_filter_brackets import Reportsv3ReportFilterBrackets

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ReportFilterBrackets from a JSON string
reportsv3_report_filter_brackets_instance = Reportsv3ReportFilterBrackets.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ReportFilterBrackets.to_json())

# convert the object into a dict
reportsv3_report_filter_brackets_dict = reportsv3_report_filter_brackets_instance.to_dict()
# create an instance of Reportsv3ReportFilterBrackets from a dict
reportsv3_report_filter_brackets_from_dict = Reportsv3ReportFilterBrackets.from_dict(reportsv3_report_filter_brackets_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


