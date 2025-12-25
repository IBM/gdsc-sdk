# Reportsv3ReportFilterCondition

ReportFilterCondition represents a report filter condition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**case_insensitive** | **bool** | Case Insensitive - Whether the condition is case insensitive or case sensitive. | [optional] 
**field_nls_translation_key** | **str** |  | [optional] 
**filter_id** | **int** |  | [optional] 
**group_type_id** | **int** |  | [optional] 
**header_id** | **str** |  | [optional] 
**header_name** | **str** |  | [optional] 
**header_type** | [**Reportsv3HeaderType**](Reportsv3HeaderType.md) |  | [optional] [default to Reportsv3HeaderType.UNDEFINED_TYPE]
**in_report_date_range** | [**Reportsv3DateRange**](Reportsv3DateRange.md) |  | [optional] 
**in_report_field_nls_key** | **str** |  | [optional] 
**in_report_header_id** | **str** |  | [optional] 
**in_report_header_name** | **str** |  | [optional] 
**in_report_id** | **str** |  | [optional] 
**in_report_name** | **str** |  | [optional] 
**in_report_table_name** | **str** |  | [optional] 
**is_tuple** | **bool** |  | [optional] 
**operator_type** | [**Reportsv3OperatorType**](Reportsv3OperatorType.md) |  | [optional] [default to Reportsv3OperatorType.UNDEFINED_OPERATOR_TYPE]
**parameter_type** | [**Reportsv3ParameterType**](Reportsv3ParameterType.md) |  | [optional] [default to Reportsv3ParameterType.UNDEFINED_PARAM_TYPE]
**schema_name** | **str** |  | [optional] 
**sequence** | **int** |  | [optional] 
**table_name** | **str** |  | [optional] 
**tuple_type** | **str** |  | [optional] 
**values** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_report_filter_condition import Reportsv3ReportFilterCondition

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ReportFilterCondition from a JSON string
reportsv3_report_filter_condition_instance = Reportsv3ReportFilterCondition.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ReportFilterCondition.to_json())

# convert the object into a dict
reportsv3_report_filter_condition_dict = reportsv3_report_filter_condition_instance.to_dict()
# create an instance of Reportsv3ReportFilterCondition from a dict
reportsv3_report_filter_condition_from_dict = Reportsv3ReportFilterCondition.from_dict(reportsv3_report_filter_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


