# Guardiumconnectorv3GDPReportParameter

Report parameter definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter_value** | **str** | Parameter value. | [optional] 
**paremeter_name** | **str** | Parameter name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_gdp_report_parameter import Guardiumconnectorv3GDPReportParameter

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GDPReportParameter from a JSON string
guardiumconnectorv3_gdp_report_parameter_instance = Guardiumconnectorv3GDPReportParameter.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GDPReportParameter.to_json())

# convert the object into a dict
guardiumconnectorv3_gdp_report_parameter_dict = guardiumconnectorv3_gdp_report_parameter_instance.to_dict()
# create an instance of Guardiumconnectorv3GDPReportParameter from a dict
guardiumconnectorv3_gdp_report_parameter_from_dict = Guardiumconnectorv3GDPReportParameter.from_dict(guardiumconnectorv3_gdp_report_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


