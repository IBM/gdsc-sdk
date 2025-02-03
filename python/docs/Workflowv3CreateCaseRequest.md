# Workflowv3CreateCaseRequest

Create a new case.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**case** | [**Workflowv3CaseEdit**](Workflowv3CaseEdit.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_create_case_request import Workflowv3CreateCaseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3CreateCaseRequest from a JSON string
workflowv3_create_case_request_instance = Workflowv3CreateCaseRequest.from_json(json)
# print the JSON string representation of the object
print(Workflowv3CreateCaseRequest.to_json())

# convert the object into a dict
workflowv3_create_case_request_dict = workflowv3_create_case_request_instance.to_dict()
# create an instance of Workflowv3CreateCaseRequest from a dict
workflowv3_create_case_request_from_dict = Workflowv3CreateCaseRequest.from_dict(workflowv3_create_case_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


