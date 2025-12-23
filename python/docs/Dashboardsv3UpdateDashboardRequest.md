# Dashboardsv3UpdateDashboardRequest

UpdateDashboardRequest is the argument type used to update a dashboard with the UpdateDashboard() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dashboard** | [**Dashboardsv3Dashboard**](Dashboardsv3Dashboard.md) |  | [optional] 
**dashboard_id** | **str** | The id of the dashboard that was updated. | [optional] 
**update_hint** | **str** | Optional: A hint describing the update used by the activity log. | [optional] 
**update_type** | [**Dashboardsv3UpdateType**](Dashboardsv3UpdateType.md) |  | [optional] [default to Dashboardsv3UpdateType.UNDEFINED_UPDATE_TYPE]

## Example

```python
from ibm_gdsc_sdk_saas.models.dashboardsv3_update_dashboard_request import Dashboardsv3UpdateDashboardRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Dashboardsv3UpdateDashboardRequest from a JSON string
dashboardsv3_update_dashboard_request_instance = Dashboardsv3UpdateDashboardRequest.from_json(json)
# print the JSON string representation of the object
print(Dashboardsv3UpdateDashboardRequest.to_json())

# convert the object into a dict
dashboardsv3_update_dashboard_request_dict = dashboardsv3_update_dashboard_request_instance.to_dict()
# create an instance of Dashboardsv3UpdateDashboardRequest from a dict
dashboardsv3_update_dashboard_request_from_dict = Dashboardsv3UpdateDashboardRequest.from_dict(dashboardsv3_update_dashboard_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


