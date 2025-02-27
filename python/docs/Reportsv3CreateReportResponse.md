# Reportsv3CreateReportResponse

CreateReportResponse containes the report id of the newly created report from the CreateReport() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_id** | **str** | Unique Report ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_create_report_response import Reportsv3CreateReportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateReportResponse from a JSON string
reportsv3_create_report_response_instance = Reportsv3CreateReportResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateReportResponse.to_json())

# convert the object into a dict
reportsv3_create_report_response_dict = reportsv3_create_report_response_instance.to_dict()
# create an instance of Reportsv3CreateReportResponse from a dict
reportsv3_create_report_response_from_dict = Reportsv3CreateReportResponse.from_dict(reportsv3_create_report_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


