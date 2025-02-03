# Workflowv3CaseListResponse

Returns just cases with associated tasks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cases** | [**List[Workflowv3Case]**](Workflowv3Case.md) | Filtered list of cases. | [optional] 
**filter** | [**Workflowv3Filter**](Workflowv3Filter.md) |  | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_case_list_response import Workflowv3CaseListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3CaseListResponse from a JSON string
workflowv3_case_list_response_instance = Workflowv3CaseListResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3CaseListResponse.to_json())

# convert the object into a dict
workflowv3_case_list_response_dict = workflowv3_case_list_response_instance.to_dict()
# create an instance of Workflowv3CaseListResponse from a dict
workflowv3_case_list_response_from_dict = Workflowv3CaseListResponse.from_dict(workflowv3_case_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


