# Dashboardsv3UpdateDashboardResponse

UpdateDashboardResponse is the response after updating a dashboard using the UpdateDashboard() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dashboard_id** | **str** | The id of the dashboard that was updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.dashboardsv3_update_dashboard_response import Dashboardsv3UpdateDashboardResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Dashboardsv3UpdateDashboardResponse from a JSON string
dashboardsv3_update_dashboard_response_instance = Dashboardsv3UpdateDashboardResponse.from_json(json)
# print the JSON string representation of the object
print(Dashboardsv3UpdateDashboardResponse.to_json())

# convert the object into a dict
dashboardsv3_update_dashboard_response_dict = dashboardsv3_update_dashboard_response_instance.to_dict()
# create an instance of Dashboardsv3UpdateDashboardResponse from a dict
dashboardsv3_update_dashboard_response_from_dict = Dashboardsv3UpdateDashboardResponse.from_dict(dashboardsv3_update_dashboard_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


