# Reportsv3DeleteGradeRequest

DeleteGradeRequest is the request for deleting a grade.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade_id** | **int** | The id of the grade to be deleted. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_delete_grade_request import Reportsv3DeleteGradeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3DeleteGradeRequest from a JSON string
reportsv3_delete_grade_request_instance = Reportsv3DeleteGradeRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3DeleteGradeRequest.to_json())

# convert the object into a dict
reportsv3_delete_grade_request_dict = reportsv3_delete_grade_request_instance.to_dict()
# create an instance of Reportsv3DeleteGradeRequest from a dict
reportsv3_delete_grade_request_from_dict = Reportsv3DeleteGradeRequest.from_dict(reportsv3_delete_grade_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


