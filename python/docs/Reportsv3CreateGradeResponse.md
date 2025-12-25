# Reportsv3CreateGradeResponse

CreateGradeResponse is the response after creating a grade .

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade_id** | **int** | Unique grade ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_create_grade_response import Reportsv3CreateGradeResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateGradeResponse from a JSON string
reportsv3_create_grade_response_instance = Reportsv3CreateGradeResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateGradeResponse.to_json())

# convert the object into a dict
reportsv3_create_grade_response_dict = reportsv3_create_grade_response_instance.to_dict()
# create an instance of Reportsv3CreateGradeResponse from a dict
reportsv3_create_grade_response_from_dict = Reportsv3CreateGradeResponse.from_dict(reportsv3_create_grade_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


