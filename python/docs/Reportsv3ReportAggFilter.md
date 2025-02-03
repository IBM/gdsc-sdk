# Reportsv3ReportAggFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**condition** | [**Reportsv3ReportAggFilterCondition**](Reportsv3ReportAggFilterCondition.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_report_agg_filter import Reportsv3ReportAggFilter

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ReportAggFilter from a JSON string
reportsv3_report_agg_filter_instance = Reportsv3ReportAggFilter.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ReportAggFilter.to_json())

# convert the object into a dict
reportsv3_report_agg_filter_dict = reportsv3_report_agg_filter_instance.to_dict()
# create an instance of Reportsv3ReportAggFilter from a dict
reportsv3_report_agg_filter_from_dict = Reportsv3ReportAggFilter.from_dict(reportsv3_report_agg_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


