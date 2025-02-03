# Workflowv3GetCasesCountRequest

Requests case count.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**Workflowv3Filter**](Workflowv3Filter.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_get_cases_count_request import Workflowv3GetCasesCountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3GetCasesCountRequest from a JSON string
workflowv3_get_cases_count_request_instance = Workflowv3GetCasesCountRequest.from_json(json)
# print the JSON string representation of the object
print(Workflowv3GetCasesCountRequest.to_json())

# convert the object into a dict
workflowv3_get_cases_count_request_dict = workflowv3_get_cases_count_request_instance.to_dict()
# create an instance of Workflowv3GetCasesCountRequest from a dict
workflowv3_get_cases_count_request_from_dict = Workflowv3GetCasesCountRequest.from_dict(workflowv3_get_cases_count_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


