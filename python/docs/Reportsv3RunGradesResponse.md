# Reportsv3RunGradesResponse

RunGradesResponse is the response to refresh metrics via grades.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_run_grades_response import Reportsv3RunGradesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3RunGradesResponse from a JSON string
reportsv3_run_grades_response_instance = Reportsv3RunGradesResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3RunGradesResponse.to_json())

# convert the object into a dict
reportsv3_run_grades_response_dict = reportsv3_run_grades_response_instance.to_dict()
# create an instance of Reportsv3RunGradesResponse from a dict
reportsv3_run_grades_response_from_dict = Reportsv3RunGradesResponse.from_dict(reportsv3_run_grades_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


