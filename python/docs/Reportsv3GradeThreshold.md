# Reportsv3GradeThreshold

GradeThreshold defines the threshold for a given grade.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**threshold_score** | **int** |  | [optional] 
**threshold_score_name** | **str** |  | [optional] 
**threshold_value** | **float** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_grade_threshold import Reportsv3GradeThreshold

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GradeThreshold from a JSON string
reportsv3_grade_threshold_instance = Reportsv3GradeThreshold.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GradeThreshold.to_json())

# convert the object into a dict
reportsv3_grade_threshold_dict = reportsv3_grade_threshold_instance.to_dict()
# create an instance of Reportsv3GradeThreshold from a dict
reportsv3_grade_threshold_from_dict = Reportsv3GradeThreshold.from_dict(reportsv3_grade_threshold_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


