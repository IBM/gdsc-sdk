# Workflowv3SearchReportsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reports** | [**List[Workflowv3ReportMetadata]**](Workflowv3ReportMetadata.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_search_reports_response import Workflowv3SearchReportsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3SearchReportsResponse from a JSON string
workflowv3_search_reports_response_instance = Workflowv3SearchReportsResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3SearchReportsResponse.to_json())

# convert the object into a dict
workflowv3_search_reports_response_dict = workflowv3_search_reports_response_instance.to_dict()
# create an instance of Workflowv3SearchReportsResponse from a dict
workflowv3_search_reports_response_from_dict = Workflowv3SearchReportsResponse.from_dict(workflowv3_search_reports_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


