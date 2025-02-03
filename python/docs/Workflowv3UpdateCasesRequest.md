# Workflowv3UpdateCasesRequest

Update existing cases.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cases** | [**List[Workflowv3CaseEdit]**](Workflowv3CaseEdit.md) | Update multiple cases in one request. | [optional] 
**update_fields** | **List[str]** | Only update these fields in the backend records. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_update_cases_request import Workflowv3UpdateCasesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3UpdateCasesRequest from a JSON string
workflowv3_update_cases_request_instance = Workflowv3UpdateCasesRequest.from_json(json)
# print the JSON string representation of the object
print(Workflowv3UpdateCasesRequest.to_json())

# convert the object into a dict
workflowv3_update_cases_request_dict = workflowv3_update_cases_request_instance.to_dict()
# create an instance of Workflowv3UpdateCasesRequest from a dict
workflowv3_update_cases_request_from_dict = Workflowv3UpdateCasesRequest.from_dict(workflowv3_update_cases_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


