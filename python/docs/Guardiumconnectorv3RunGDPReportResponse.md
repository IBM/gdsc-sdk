# Guardiumconnectorv3RunGDPReportResponse

Returns the data from report run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_data** | [**List[Guardiumconnectorv3GDPReportResultRow]**](Guardiumconnectorv3GDPReportResultRow.md) | Report data. | [optional] 
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_run_gdp_report_response import Guardiumconnectorv3RunGDPReportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3RunGDPReportResponse from a JSON string
guardiumconnectorv3_run_gdp_report_response_instance = Guardiumconnectorv3RunGDPReportResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3RunGDPReportResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_run_gdp_report_response_dict = guardiumconnectorv3_run_gdp_report_response_instance.to_dict()
# create an instance of Guardiumconnectorv3RunGDPReportResponse from a dict
guardiumconnectorv3_run_gdp_report_response_from_dict = Guardiumconnectorv3RunGDPReportResponse.from_dict(guardiumconnectorv3_run_gdp_report_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


