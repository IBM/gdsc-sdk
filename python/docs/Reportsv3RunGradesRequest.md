# Reportsv3RunGradesRequest

RunGradesRequest is the request to refresh metrics via grades.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from_date** | **str** |  | [optional] 
**grade_id** | **int** |  | [optional] 
**to_date** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_run_grades_request import Reportsv3RunGradesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3RunGradesRequest from a JSON string
reportsv3_run_grades_request_instance = Reportsv3RunGradesRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3RunGradesRequest.to_json())

# convert the object into a dict
reportsv3_run_grades_request_dict = reportsv3_run_grades_request_instance.to_dict()
# create an instance of Reportsv3RunGradesRequest from a dict
reportsv3_run_grades_request_from_dict = Reportsv3RunGradesRequest.from_dict(reportsv3_run_grades_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


