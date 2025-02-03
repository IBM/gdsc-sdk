# Reportsv3ChartDisplayLayout

ChartDisplayLayout has Chart matadata , rows and headers.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_headers** | [**List[Reportsv3DisplayHeader]**](Reportsv3DisplayHeader.md) | The Chart headers. | [optional] 
**chart_id** | **str** | The chart ID. | [optional] 
**report_id** | **str** | The report ID. | [optional] 
**results_limit** | **int** | Chart data results limit. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_chart_display_layout import Reportsv3ChartDisplayLayout

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ChartDisplayLayout from a JSON string
reportsv3_chart_display_layout_instance = Reportsv3ChartDisplayLayout.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ChartDisplayLayout.to_json())

# convert the object into a dict
reportsv3_chart_display_layout_dict = reportsv3_chart_display_layout_instance.to_dict()
# create an instance of Reportsv3ChartDisplayLayout from a dict
reportsv3_chart_display_layout_from_dict = Reportsv3ChartDisplayLayout.from_dict(reportsv3_chart_display_layout_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


