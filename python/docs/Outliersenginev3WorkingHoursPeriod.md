# Outliersenginev3WorkingHoursPeriod

WorkingHoursPeriod represents a classification of hours of the day.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contiguous** | **bool** | Specify whether the period is contiguous or not. | [optional] 
**datetime_code_description** | **str** | Period description. | [optional] 
**datetime_code_id** | **int** | Period id. | [optional] 
**hour_from** | **str** | The hour that the period starts, format HH:mm. | [optional] 
**hour_to** | **str** | The hour that the period ends, format HH:mm. | [optional] 
**weekday_from** | **int** | The number of day that the period starts. | [optional] 
**weekday_to** | **int** | The number of day that the period ends. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.outliersenginev3_working_hours_period import Outliersenginev3WorkingHoursPeriod

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3WorkingHoursPeriod from a JSON string
outliersenginev3_working_hours_period_instance = Outliersenginev3WorkingHoursPeriod.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3WorkingHoursPeriod.to_json())

# convert the object into a dict
outliersenginev3_working_hours_period_dict = outliersenginev3_working_hours_period_instance.to_dict()
# create an instance of Outliersenginev3WorkingHoursPeriod from a dict
outliersenginev3_working_hours_period_from_dict = Outliersenginev3WorkingHoursPeriod.from_dict(outliersenginev3_working_hours_period_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


