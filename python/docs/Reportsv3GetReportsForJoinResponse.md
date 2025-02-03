# Reportsv3GetReportsForJoinResponse

GetReportsForJoinResponse - Returns a small amount of information for each report used by a join. Includes the join-imported headers used by the report. Warning: use sparingly as this function requires fetching every report in a category and traversing their trees - it can be slow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reports_used_in_join** | [**List[Reportsv3ReportUsedInJoin]**](Reportsv3ReportUsedInJoin.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_get_reports_for_join_response import Reportsv3GetReportsForJoinResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetReportsForJoinResponse from a JSON string
reportsv3_get_reports_for_join_response_instance = Reportsv3GetReportsForJoinResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetReportsForJoinResponse.to_json())

# convert the object into a dict
reportsv3_get_reports_for_join_response_dict = reportsv3_get_reports_for_join_response_instance.to_dict()
# create an instance of Reportsv3GetReportsForJoinResponse from a dict
reportsv3_get_reports_for_join_response_from_dict = Reportsv3GetReportsForJoinResponse.from_dict(reportsv3_get_reports_for_join_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


