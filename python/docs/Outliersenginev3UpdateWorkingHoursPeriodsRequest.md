# Outliersenginev3UpdateWorkingHoursPeriodsRequest

UpdateWorkingHoursPeriodsRequest is the request object for UpdateWorkingHoursPeriods API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**period** | [**Outliersenginev3WorkingHoursPeriod**](Outliersenginev3WorkingHoursPeriod.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.outliersenginev3_update_working_hours_periods_request import Outliersenginev3UpdateWorkingHoursPeriodsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3UpdateWorkingHoursPeriodsRequest from a JSON string
outliersenginev3_update_working_hours_periods_request_instance = Outliersenginev3UpdateWorkingHoursPeriodsRequest.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3UpdateWorkingHoursPeriodsRequest.to_json())

# convert the object into a dict
outliersenginev3_update_working_hours_periods_request_dict = outliersenginev3_update_working_hours_periods_request_instance.to_dict()
# create an instance of Outliersenginev3UpdateWorkingHoursPeriodsRequest from a dict
outliersenginev3_update_working_hours_periods_request_from_dict = Outliersenginev3UpdateWorkingHoursPeriodsRequest.from_dict(outliersenginev3_update_working_hours_periods_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


