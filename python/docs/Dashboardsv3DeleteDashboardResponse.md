# Dashboardsv3DeleteDashboardResponse

DeleteDashboardResponse is the response for deleting a dashboard.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Success or error message. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.dashboardsv3_delete_dashboard_response import Dashboardsv3DeleteDashboardResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Dashboardsv3DeleteDashboardResponse from a JSON string
dashboardsv3_delete_dashboard_response_instance = Dashboardsv3DeleteDashboardResponse.from_json(json)
# print the JSON string representation of the object
print(Dashboardsv3DeleteDashboardResponse.to_json())

# convert the object into a dict
dashboardsv3_delete_dashboard_response_dict = dashboardsv3_delete_dashboard_response_instance.to_dict()
# create an instance of Dashboardsv3DeleteDashboardResponse from a dict
dashboardsv3_delete_dashboard_response_from_dict = Dashboardsv3DeleteDashboardResponse.from_dict(dashboardsv3_delete_dashboard_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


