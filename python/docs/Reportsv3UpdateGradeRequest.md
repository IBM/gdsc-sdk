# Reportsv3UpdateGradeRequest

UpdateGradeRequest is the argument type used to update a grade.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade** | [**Reportsv3Grade**](Reportsv3Grade.md) |  | [optional] 
**grade_id** | **int** | The id of the grade that was updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_grade_request import Reportsv3UpdateGradeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateGradeRequest from a JSON string
reportsv3_update_grade_request_instance = Reportsv3UpdateGradeRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateGradeRequest.to_json())

# convert the object into a dict
reportsv3_update_grade_request_dict = reportsv3_update_grade_request_instance.to_dict()
# create an instance of Reportsv3UpdateGradeRequest from a dict
reportsv3_update_grade_request_from_dict = Reportsv3UpdateGradeRequest.from_dict(reportsv3_update_grade_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


