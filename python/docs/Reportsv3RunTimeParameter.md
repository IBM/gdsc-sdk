# Reportsv3RunTimeParameter

RunTimeParameter object define all necessary data for a report runtime parameter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | The run time parameter key (ReportFilter.value). | [optional] 
**label** | **str** | The run time parameter label. | [optional] 
**operator_type** | [**Reportsv3OperatorType**](Reportsv3OperatorType.md) |  | [optional] [default to Reportsv3OperatorType.UNDEFINED_OPERATOR_TYPE]
**runtime_parameter_type** | [**Reportsv3HeaderType**](Reportsv3HeaderType.md) |  | [optional] [default to Reportsv3HeaderType.UNDEFINED_TYPE]
**runtime_parameter_type_length** | **int** | Runtime parameter&#39;s field type length. | [optional] 
**value** | **str** | Run time parameter values. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_run_time_parameter import Reportsv3RunTimeParameter

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3RunTimeParameter from a JSON string
reportsv3_run_time_parameter_instance = Reportsv3RunTimeParameter.from_json(json)
# print the JSON string representation of the object
print(Reportsv3RunTimeParameter.to_json())

# convert the object into a dict
reportsv3_run_time_parameter_dict = reportsv3_run_time_parameter_instance.to_dict()
# create an instance of Reportsv3RunTimeParameter from a dict
reportsv3_run_time_parameter_from_dict = Reportsv3RunTimeParameter.from_dict(reportsv3_run_time_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


