# Workflowv3FilterColumn

FilterColumn represents a column field filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**header_name** | **str** |  | [optional] 
**operator_type** | [**Workflowv3OperatorType**](Workflowv3OperatorType.md) |  | [optional] 
**values** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_filter_column import Workflowv3FilterColumn

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3FilterColumn from a JSON string
workflowv3_filter_column_instance = Workflowv3FilterColumn.from_json(json)
# print the JSON string representation of the object
print(Workflowv3FilterColumn.to_json())

# convert the object into a dict
workflowv3_filter_column_dict = workflowv3_filter_column_instance.to_dict()
# create an instance of Workflowv3FilterColumn from a dict
workflowv3_filter_column_from_dict = Workflowv3FilterColumn.from_dict(workflowv3_filter_column_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


