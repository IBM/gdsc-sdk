# AddJiraIntegrationParametersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company_domain_name** | **str** |  | 
**issue_type** | **str** |  | [optional] [default to '501']
**project_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.add_jira_integration_parameters_request import AddJiraIntegrationParametersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AddJiraIntegrationParametersRequest from a JSON string
add_jira_integration_parameters_request_instance = AddJiraIntegrationParametersRequest.from_json(json)
# print the JSON string representation of the object
print(AddJiraIntegrationParametersRequest.to_json())

# convert the object into a dict
add_jira_integration_parameters_request_dict = add_jira_integration_parameters_request_instance.to_dict()
# create an instance of AddJiraIntegrationParametersRequest from a dict
add_jira_integration_parameters_request_from_dict = AddJiraIntegrationParametersRequest.from_dict(add_jira_integration_parameters_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


