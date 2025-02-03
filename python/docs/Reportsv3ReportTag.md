# Reportsv3ReportTag

ReportTag represents a report type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nls_key** | **str** | Report tag&#39;s nls translation key. | [optional] 
**nls_value** | **str** | Translated tag name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_report_tag import Reportsv3ReportTag

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ReportTag from a JSON string
reportsv3_report_tag_instance = Reportsv3ReportTag.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ReportTag.to_json())

# convert the object into a dict
reportsv3_report_tag_dict = reportsv3_report_tag_instance.to_dict()
# create an instance of Reportsv3ReportTag from a dict
reportsv3_report_tag_from_dict = Reportsv3ReportTag.from_dict(reportsv3_report_tag_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


