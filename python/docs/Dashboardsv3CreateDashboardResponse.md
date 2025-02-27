# Dashboardsv3CreateDashboardResponse

CreateDashboardResponse is the response after creating a dashboard using the CreateDashboard() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dashboard_id** | **str** | Unique Dashboard ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.dashboardsv3_create_dashboard_response import Dashboardsv3CreateDashboardResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Dashboardsv3CreateDashboardResponse from a JSON string
dashboardsv3_create_dashboard_response_instance = Dashboardsv3CreateDashboardResponse.from_json(json)
# print the JSON string representation of the object
print(Dashboardsv3CreateDashboardResponse.to_json())

# convert the object into a dict
dashboardsv3_create_dashboard_response_dict = dashboardsv3_create_dashboard_response_instance.to_dict()
# create an instance of Dashboardsv3CreateDashboardResponse from a dict
dashboardsv3_create_dashboard_response_from_dict = Dashboardsv3CreateDashboardResponse.from_dict(dashboardsv3_create_dashboard_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


