# Reportsv3GetReportTimestampHeaderResponse

GetReportTimestampHeaderResponse is where to get the report timestamp from and is the return type of GetReportTimestampHeader().

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_timestamp** | [**Reportsv3Header**](Reportsv3Header.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_get_report_timestamp_header_response import Reportsv3GetReportTimestampHeaderResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetReportTimestampHeaderResponse from a JSON string
reportsv3_get_report_timestamp_header_response_instance = Reportsv3GetReportTimestampHeaderResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetReportTimestampHeaderResponse.to_json())

# convert the object into a dict
reportsv3_get_report_timestamp_header_response_dict = reportsv3_get_report_timestamp_header_response_instance.to_dict()
# create an instance of Reportsv3GetReportTimestampHeaderResponse from a dict
reportsv3_get_report_timestamp_header_response_from_dict = Reportsv3GetReportTimestampHeaderResponse.from_dict(reportsv3_get_report_timestamp_header_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


