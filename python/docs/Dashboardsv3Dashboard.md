# Dashboardsv3Dashboard

Dashboard - a small-scale representation of a Dashboard.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cards** | [**List[Dashboardsv3Card]**](Dashboardsv3Card.md) | Dashboard cards. | [optional] 
**dashboard_description** | **str** | Dashboard description. | [optional] 
**dashboard_id** | **str** | Unique Dashboard ID. | [optional] 
**dashboard_title** | **str** | Dashboard title. | [optional] 
**global_time_filter** | [**Dashboardsv3TimeRange**](Dashboardsv3TimeRange.md) |  | [optional] 
**report_global_filter_list** | [**List[Dashboardsv3ReportGlobalFilter]**](Dashboardsv3ReportGlobalFilter.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.dashboardsv3_dashboard import Dashboardsv3Dashboard

# TODO update the JSON string below
json = "{}"
# create an instance of Dashboardsv3Dashboard from a JSON string
dashboardsv3_dashboard_instance = Dashboardsv3Dashboard.from_json(json)
# print the JSON string representation of the object
print(Dashboardsv3Dashboard.to_json())

# convert the object into a dict
dashboardsv3_dashboard_dict = dashboardsv3_dashboard_instance.to_dict()
# create an instance of Dashboardsv3Dashboard from a dict
dashboardsv3_dashboard_from_dict = Dashboardsv3Dashboard.from_dict(dashboardsv3_dashboard_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


