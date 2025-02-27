# Outliersenginev3OutlierTypeStats

Describes an outlier type: What characterizes it, and how many were found during a period of time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | The number outliers found with the same characterization. | [optional] 
**type_diff_messages** | **bool** |  | [optional] 
**type_fails** | **bool** | Outlier is characterized by a high rate of exceptions, or error types. | [optional] 
**type_new_messages** | **bool** | Outlier is characterized by high volume of new activity. | [optional] 
**type_ongoing** | **bool** | Outlier is characterized by an ongoing activity below the thresholds, in recent hours. | [optional] 
**type_volume** | **bool** | Outlier is characterized by high volume of activity, in general. | [optional] 
**type_vulnerable_objects** | **bool** | Outlier is characterized by a high activity rate on vulnerable object groups. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.outliersenginev3_outlier_type_stats import Outliersenginev3OutlierTypeStats

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3OutlierTypeStats from a JSON string
outliersenginev3_outlier_type_stats_instance = Outliersenginev3OutlierTypeStats.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3OutlierTypeStats.to_json())

# convert the object into a dict
outliersenginev3_outlier_type_stats_dict = outliersenginev3_outlier_type_stats_instance.to_dict()
# create an instance of Outliersenginev3OutlierTypeStats from a dict
outliersenginev3_outlier_type_stats_from_dict = Outliersenginev3OutlierTypeStats.from_dict(outliersenginev3_outlier_type_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


