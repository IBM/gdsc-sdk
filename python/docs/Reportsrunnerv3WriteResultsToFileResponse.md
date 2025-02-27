# Reportsrunnerv3WriteResultsToFileResponse

WriteResultsToFileResponse is the return type of the WriteResultsToFileByIDRequest() and WriteResultsToFileByDefinition() apis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_name** | **str** | File name. | [optional] 
**job_id** | **str** | Token that identifies the writing results to file job. | [optional] 
**message** | **str** | Return message after writing results to file job was scheduled. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_write_results_to_file_response import Reportsrunnerv3WriteResultsToFileResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3WriteResultsToFileResponse from a JSON string
reportsrunnerv3_write_results_to_file_response_instance = Reportsrunnerv3WriteResultsToFileResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3WriteResultsToFileResponse.to_json())

# convert the object into a dict
reportsrunnerv3_write_results_to_file_response_dict = reportsrunnerv3_write_results_to_file_response_instance.to_dict()
# create an instance of Reportsrunnerv3WriteResultsToFileResponse from a dict
reportsrunnerv3_write_results_to_file_response_from_dict = Reportsrunnerv3WriteResultsToFileResponse.from_dict(reportsrunnerv3_write_results_to_file_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


