# Complianceacceleratorv3Report

Report object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Report description. | [optional] 
**groups_needed** | [**List[Complianceacceleratorv3Group]**](Complianceacceleratorv3Group.md) |  | [optional] 
**groups_present** | [**List[Complianceacceleratorv3Group]**](Complianceacceleratorv3Group.md) | Groups present in the reports. | [optional] 
**report_id** | **str** | Id of the reports. | [optional] 
**report_tags** | [**List[Reportsv3ReportTag]**](Reportsv3ReportTag.md) | The report tags. | [optional] 
**status** | [**Complianceacceleratorv3ReportStatus**](Complianceacceleratorv3ReportStatus.md) |  | [optional] [default to Complianceacceleratorv3ReportStatus.POPULATED]
**title** | **str** | Title of the report. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.complianceacceleratorv3_report import Complianceacceleratorv3Report

# TODO update the JSON string below
json = "{}"
# create an instance of Complianceacceleratorv3Report from a JSON string
complianceacceleratorv3_report_instance = Complianceacceleratorv3Report.from_json(json)
# print the JSON string representation of the object
print(Complianceacceleratorv3Report.to_json())

# convert the object into a dict
complianceacceleratorv3_report_dict = complianceacceleratorv3_report_instance.to_dict()
# create an instance of Complianceacceleratorv3Report from a dict
complianceacceleratorv3_report_from_dict = Complianceacceleratorv3Report.from_dict(complianceacceleratorv3_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


