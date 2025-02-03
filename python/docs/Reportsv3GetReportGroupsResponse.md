# Reportsv3GetReportGroupsResponse

GetGroupsInUseResponse is the return type for the GetGroupsInUse API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | [**List[GetReportGroupsResponseReportGroups]**](GetReportGroupsResponseReportGroups.md) | Contains all the provided group ID&#39;s along with the name and ID of reports using that group id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_get_report_groups_response import Reportsv3GetReportGroupsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetReportGroupsResponse from a JSON string
reportsv3_get_report_groups_response_instance = Reportsv3GetReportGroupsResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetReportGroupsResponse.to_json())

# convert the object into a dict
reportsv3_get_report_groups_response_dict = reportsv3_get_report_groups_response_instance.to_dict()
# create an instance of Reportsv3GetReportGroupsResponse from a dict
reportsv3_get_report_groups_response_from_dict = Reportsv3GetReportGroupsResponse.from_dict(reportsv3_get_report_groups_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


