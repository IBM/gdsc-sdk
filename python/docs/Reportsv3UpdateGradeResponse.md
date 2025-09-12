# Reportsv3UpdateGradeResponse

UpdateGradeResponse is the response after updating a grade.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade_id** | **int** | The id of the grade that was updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_grade_response import Reportsv3UpdateGradeResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateGradeResponse from a JSON string
reportsv3_update_grade_response_instance = Reportsv3UpdateGradeResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateGradeResponse.to_json())

# convert the object into a dict
reportsv3_update_grade_response_dict = reportsv3_update_grade_response_instance.to_dict()
# create an instance of Reportsv3UpdateGradeResponse from a dict
reportsv3_update_grade_response_from_dict = Reportsv3UpdateGradeResponse.from_dict(reportsv3_update_grade_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


