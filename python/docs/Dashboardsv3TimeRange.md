# Dashboardsv3TimeRange

Time range.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end** | **str** | End. | [optional] 
**range** | **str** | Time range. | [optional] 
**start** | **str** | Start. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.dashboardsv3_time_range import Dashboardsv3TimeRange

# TODO update the JSON string below
json = "{}"
# create an instance of Dashboardsv3TimeRange from a JSON string
dashboardsv3_time_range_instance = Dashboardsv3TimeRange.from_json(json)
# print the JSON string representation of the object
print(Dashboardsv3TimeRange.to_json())

# convert the object into a dict
dashboardsv3_time_range_dict = dashboardsv3_time_range_instance.to_dict()
# create an instance of Dashboardsv3TimeRange from a dict
dashboardsv3_time_range_from_dict = Dashboardsv3TimeRange.from_dict(dashboardsv3_time_range_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


