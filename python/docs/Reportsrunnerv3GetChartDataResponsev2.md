# Reportsrunnerv3GetChartDataResponsev2

GetChartDataResponsev2 is the return type of GetChartDatav2 API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_layout** | [**Reportsv3ChartDisplayLayout**](Reportsv3ChartDisplayLayout.md) |  | [optional] 
**data** | [**List[Reportsrunnerv3DataRow]**](Reportsrunnerv3DataRow.md) | Chart data. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_get_chart_data_responsev2 import Reportsrunnerv3GetChartDataResponsev2

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3GetChartDataResponsev2 from a JSON string
reportsrunnerv3_get_chart_data_responsev2_instance = Reportsrunnerv3GetChartDataResponsev2.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3GetChartDataResponsev2.to_json())

# convert the object into a dict
reportsrunnerv3_get_chart_data_responsev2_dict = reportsrunnerv3_get_chart_data_responsev2_instance.to_dict()
# create an instance of Reportsrunnerv3GetChartDataResponsev2 from a dict
reportsrunnerv3_get_chart_data_responsev2_from_dict = Reportsrunnerv3GetChartDataResponsev2.from_dict(reportsrunnerv3_get_chart_data_responsev2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


