# Dashboardsv3DeleteDashboardRequest

DeleteDashboardRequest is the request for deleting a dashboard.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dashboard_id** | **str** | The id of the dashboard to be deleted. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.dashboardsv3_delete_dashboard_request import Dashboardsv3DeleteDashboardRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Dashboardsv3DeleteDashboardRequest from a JSON string
dashboardsv3_delete_dashboard_request_instance = Dashboardsv3DeleteDashboardRequest.from_json(json)
# print the JSON string representation of the object
print(Dashboardsv3DeleteDashboardRequest.to_json())

# convert the object into a dict
dashboardsv3_delete_dashboard_request_dict = dashboardsv3_delete_dashboard_request_instance.to_dict()
# create an instance of Dashboardsv3DeleteDashboardRequest from a dict
dashboardsv3_delete_dashboard_request_from_dict = Dashboardsv3DeleteDashboardRequest.from_dict(dashboardsv3_delete_dashboard_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


