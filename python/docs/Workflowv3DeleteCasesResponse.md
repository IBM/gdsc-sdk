# Workflowv3DeleteCasesResponse

Returns the number of the cases and tasks deleted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleted** | **str** | Number of cases and tasks that were deleted. | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_delete_cases_response import Workflowv3DeleteCasesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3DeleteCasesResponse from a JSON string
workflowv3_delete_cases_response_instance = Workflowv3DeleteCasesResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3DeleteCasesResponse.to_json())

# convert the object into a dict
workflowv3_delete_cases_response_dict = workflowv3_delete_cases_response_instance.to_dict()
# create an instance of Workflowv3DeleteCasesResponse from a dict
workflowv3_delete_cases_response_from_dict = Workflowv3DeleteCasesResponse.from_dict(workflowv3_delete_cases_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


