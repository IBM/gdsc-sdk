# Reportsv3Grade

Grade defines a given grade.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**control_id** | **int** |  | [optional] 
**create_user_id** | **str** |  | [optional] 
**create_user_name** | **str** |  | [optional] 
**date_created** | **datetime** |  | [optional] 
**date_updated** | **datetime** |  | [optional] 
**default_score** | **int** |  | [optional] 
**default_score_name** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**grade_id** | **int** |  | [optional] 
**grade_threshold** | [**List[Reportsv3GradeThreshold]**](Reportsv3GradeThreshold.md) |  | [optional] 
**is_percentage** | **bool** |  | [optional] 
**metric_id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**recommendation** | **str** |  | [optional] 
**update_user_id** | **str** |  | [optional] 
**update_user_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_grade import Reportsv3Grade

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3Grade from a JSON string
reportsv3_grade_instance = Reportsv3Grade.from_json(json)
# print the JSON string representation of the object
print(Reportsv3Grade.to_json())

# convert the object into a dict
reportsv3_grade_dict = reportsv3_grade_instance.to_dict()
# create an instance of Reportsv3Grade from a dict
reportsv3_grade_from_dict = Reportsv3Grade.from_dict(reportsv3_grade_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


