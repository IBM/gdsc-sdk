# Workflowv3CreateCaseResponse

Returns the ids of the cases created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | **str** | Case_id that was created. | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_create_case_response import Workflowv3CreateCaseResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3CreateCaseResponse from a JSON string
workflowv3_create_case_response_instance = Workflowv3CreateCaseResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3CreateCaseResponse.to_json())

# convert the object into a dict
workflowv3_create_case_response_dict = workflowv3_create_case_response_instance.to_dict()
# create an instance of Workflowv3CreateCaseResponse from a dict
workflowv3_create_case_response_from_dict = Workflowv3CreateCaseResponse.from_dict(workflowv3_create_case_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


