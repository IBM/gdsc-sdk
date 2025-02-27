# Reportsv3GetReportSynopsisResponse

GetReportSynopsisResponse containes a brief report and is the return type of GetReportSynopsis() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report** | [**Reportsv3BriefReport**](Reportsv3BriefReport.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_report_synopsis_response import Reportsv3GetReportSynopsisResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetReportSynopsisResponse from a JSON string
reportsv3_get_report_synopsis_response_instance = Reportsv3GetReportSynopsisResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetReportSynopsisResponse.to_json())

# convert the object into a dict
reportsv3_get_report_synopsis_response_dict = reportsv3_get_report_synopsis_response_instance.to_dict()
# create an instance of Reportsv3GetReportSynopsisResponse from a dict
reportsv3_get_report_synopsis_response_from_dict = Reportsv3GetReportSynopsisResponse.from_dict(reportsv3_get_report_synopsis_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


