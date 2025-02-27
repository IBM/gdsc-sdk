# Outliersenginev3GetWorkingHoursPeriodsResponse

GetWorkingHoursPeriodsResponse is the response object for GetWorkingHoursPeriods API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periods** | [**List[Outliersenginev3WorkingHoursPeriod]**](Outliersenginev3WorkingHoursPeriod.md) | Periods is a list of WorkingHoursPeriod objects retrived from the database. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.outliersenginev3_get_working_hours_periods_response import Outliersenginev3GetWorkingHoursPeriodsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3GetWorkingHoursPeriodsResponse from a JSON string
outliersenginev3_get_working_hours_periods_response_instance = Outliersenginev3GetWorkingHoursPeriodsResponse.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3GetWorkingHoursPeriodsResponse.to_json())

# convert the object into a dict
outliersenginev3_get_working_hours_periods_response_dict = outliersenginev3_get_working_hours_periods_response_instance.to_dict()
# create an instance of Outliersenginev3GetWorkingHoursPeriodsResponse from a dict
outliersenginev3_get_working_hours_periods_response_from_dict = Outliersenginev3GetWorkingHoursPeriodsResponse.from_dict(outliersenginev3_get_working_hours_periods_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


