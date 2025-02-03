# Guardiumconnectorv3GDPReportResultRow

Represents a single result row of a report.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | [**List[Guardiumconnectorv3GDPReportResultColumn]**](Guardiumconnectorv3GDPReportResultColumn.md) | Set of result row cells. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_gdp_report_result_row import Guardiumconnectorv3GDPReportResultRow

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GDPReportResultRow from a JSON string
guardiumconnectorv3_gdp_report_result_row_instance = Guardiumconnectorv3GDPReportResultRow.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GDPReportResultRow.to_json())

# convert the object into a dict
guardiumconnectorv3_gdp_report_result_row_dict = guardiumconnectorv3_gdp_report_result_row_instance.to_dict()
# create an instance of Guardiumconnectorv3GDPReportResultRow from a dict
guardiumconnectorv3_gdp_report_result_row_from_dict = Guardiumconnectorv3GDPReportResultRow.from_dict(guardiumconnectorv3_gdp_report_result_row_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


