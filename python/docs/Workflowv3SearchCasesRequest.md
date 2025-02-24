# Workflowv3SearchCasesRequest

Request cases by filtering on specific values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**Workflowv3Filter**](Workflowv3Filter.md) |  | [optional] 
**limit** | **int** | Optional: The max amount of cases to return for pagination. | [optional] 
**offset** | **int** | Optional: The amount to offset the cases for pagination. | [optional] 
**with_latest** | **bool** | Optional: Cases that runs most latestly. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_search_cases_request import Workflowv3SearchCasesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3SearchCasesRequest from a JSON string
workflowv3_search_cases_request_instance = Workflowv3SearchCasesRequest.from_json(json)
# print the JSON string representation of the object
print(Workflowv3SearchCasesRequest.to_json())

# convert the object into a dict
workflowv3_search_cases_request_dict = workflowv3_search_cases_request_instance.to_dict()
# create an instance of Workflowv3SearchCasesRequest from a dict
workflowv3_search_cases_request_from_dict = Workflowv3SearchCasesRequest.from_dict(workflowv3_search_cases_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


