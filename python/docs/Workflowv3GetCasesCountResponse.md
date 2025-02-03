# Workflowv3GetCasesCountResponse

Returns case count.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_records** | **int** | Total Rows Count. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_get_cases_count_response import Workflowv3GetCasesCountResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3GetCasesCountResponse from a JSON string
workflowv3_get_cases_count_response_instance = Workflowv3GetCasesCountResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3GetCasesCountResponse.to_json())

# convert the object into a dict
workflowv3_get_cases_count_response_dict = workflowv3_get_cases_count_response_instance.to_dict()
# create an instance of Workflowv3GetCasesCountResponse from a dict
workflowv3_get_cases_count_response_from_dict = Workflowv3GetCasesCountResponse.from_dict(workflowv3_get_cases_count_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


