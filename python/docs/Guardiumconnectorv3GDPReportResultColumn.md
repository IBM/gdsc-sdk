# Guardiumconnectorv3GDPReportResultColumn

Represents a single cell of a result row.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**column_name** | **str** | Result column name. | [optional] 
**column_value** | **str** | Result column value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_gdp_report_result_column import Guardiumconnectorv3GDPReportResultColumn

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GDPReportResultColumn from a JSON string
guardiumconnectorv3_gdp_report_result_column_instance = Guardiumconnectorv3GDPReportResultColumn.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GDPReportResultColumn.to_json())

# convert the object into a dict
guardiumconnectorv3_gdp_report_result_column_dict = guardiumconnectorv3_gdp_report_result_column_instance.to_dict()
# create an instance of Guardiumconnectorv3GDPReportResultColumn from a dict
guardiumconnectorv3_gdp_report_result_column_from_dict = Guardiumconnectorv3GDPReportResultColumn.from_dict(guardiumconnectorv3_gdp_report_result_column_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


