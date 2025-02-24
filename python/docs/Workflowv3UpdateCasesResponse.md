# Workflowv3UpdateCasesResponse

Returns the ids of the cases updated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 
**updated** | **str** | Number of cases that were updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_update_cases_response import Workflowv3UpdateCasesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3UpdateCasesResponse from a JSON string
workflowv3_update_cases_response_instance = Workflowv3UpdateCasesResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3UpdateCasesResponse.to_json())

# convert the object into a dict
workflowv3_update_cases_response_dict = workflowv3_update_cases_response_instance.to_dict()
# create an instance of Workflowv3UpdateCasesResponse from a dict
workflowv3_update_cases_response_from_dict = Workflowv3UpdateCasesResponse.from_dict(workflowv3_update_cases_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


