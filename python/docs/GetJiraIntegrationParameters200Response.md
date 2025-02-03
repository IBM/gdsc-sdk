# GetJiraIntegrationParameters200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company_domain_name** | **str** |  | 
**issue_type** | **str** |  | [optional] 
**project_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.get_jira_integration_parameters200_response import GetJiraIntegrationParameters200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetJiraIntegrationParameters200Response from a JSON string
get_jira_integration_parameters200_response_instance = GetJiraIntegrationParameters200Response.from_json(json)
# print the JSON string representation of the object
print(GetJiraIntegrationParameters200Response.to_json())

# convert the object into a dict
get_jira_integration_parameters200_response_dict = get_jira_integration_parameters200_response_instance.to_dict()
# create an instance of GetJiraIntegrationParameters200Response from a dict
get_jira_integration_parameters200_response_from_dict = GetJiraIntegrationParameters200Response.from_dict(get_jira_integration_parameters200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


