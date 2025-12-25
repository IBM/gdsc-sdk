# Reportsv3ReportAggFilterCondition

ReportAggFilterCondition represents a report aggregate filter condition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation_type** | [**Reportsv3AggregationType**](Reportsv3AggregationType.md) |  | [optional] [default to Reportsv3AggregationType.UNDEFINED_AGG_TYPE]
**header_id** | **str** |  | [optional] 
**header_name** | **str** |  | [optional] 
**operator_type** | [**Reportsv3OperatorType**](Reportsv3OperatorType.md) |  | [optional] [default to Reportsv3OperatorType.UNDEFINED_OPERATOR_TYPE]
**table_name** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_report_agg_filter_condition import Reportsv3ReportAggFilterCondition

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ReportAggFilterCondition from a JSON string
reportsv3_report_agg_filter_condition_instance = Reportsv3ReportAggFilterCondition.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ReportAggFilterCondition.to_json())

# convert the object into a dict
reportsv3_report_agg_filter_condition_dict = reportsv3_report_agg_filter_condition_instance.to_dict()
# create an instance of Reportsv3ReportAggFilterCondition from a dict
reportsv3_report_agg_filter_condition_from_dict = Reportsv3ReportAggFilterCondition.from_dict(reportsv3_report_agg_filter_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


