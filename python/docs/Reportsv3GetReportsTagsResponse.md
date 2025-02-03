# Reportsv3GetReportsTagsResponse

GetReportsTagsResponse containes all distinct tags list and is the return type of GetReportsTags() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_tags** | [**List[Reportsv3ReportTag]**](Reportsv3ReportTag.md) | The reports tags. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_get_reports_tags_response import Reportsv3GetReportsTagsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetReportsTagsResponse from a JSON string
reportsv3_get_reports_tags_response_instance = Reportsv3GetReportsTagsResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetReportsTagsResponse.to_json())

# convert the object into a dict
reportsv3_get_reports_tags_response_dict = reportsv3_get_reports_tags_response_instance.to_dict()
# create an instance of Reportsv3GetReportsTagsResponse from a dict
reportsv3_get_reports_tags_response_from_dict = Reportsv3GetReportsTagsResponse.from_dict(reportsv3_get_reports_tags_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


