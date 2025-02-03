# Reportsrunnerv3WriteResultsToGroupResponse

WriteResultsToGroupResponse is the return type of the WriteResultsToGroupByReportID() and WriteResultsToGroupByDefinition() apis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **str** | Token that identifies the writing results to file job. | [optional] 
**message** | **str** | Return message after writing results to file job was scheduled. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_write_results_to_group_response import Reportsrunnerv3WriteResultsToGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3WriteResultsToGroupResponse from a JSON string
reportsrunnerv3_write_results_to_group_response_instance = Reportsrunnerv3WriteResultsToGroupResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3WriteResultsToGroupResponse.to_json())

# convert the object into a dict
reportsrunnerv3_write_results_to_group_response_dict = reportsrunnerv3_write_results_to_group_response_instance.to_dict()
# create an instance of Reportsrunnerv3WriteResultsToGroupResponse from a dict
reportsrunnerv3_write_results_to_group_response_from_dict = Reportsrunnerv3WriteResultsToGroupResponse.from_dict(reportsrunnerv3_write_results_to_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


