# Dashboardsv3GetDashboardsResponse

GetDashboardsResponse is the return type which encapsulates a list of dashboards from the GetDashboards() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dashboards_list** | [**List[Dashboardsv3Dashboard]**](Dashboardsv3Dashboard.md) | List of dashboards. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.dashboardsv3_get_dashboards_response import Dashboardsv3GetDashboardsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Dashboardsv3GetDashboardsResponse from a JSON string
dashboardsv3_get_dashboards_response_instance = Dashboardsv3GetDashboardsResponse.from_json(json)
# print the JSON string representation of the object
print(Dashboardsv3GetDashboardsResponse.to_json())

# convert the object into a dict
dashboardsv3_get_dashboards_response_dict = dashboardsv3_get_dashboards_response_instance.to_dict()
# create an instance of Dashboardsv3GetDashboardsResponse from a dict
dashboardsv3_get_dashboards_response_from_dict = Dashboardsv3GetDashboardsResponse.from_dict(dashboardsv3_get_dashboards_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


