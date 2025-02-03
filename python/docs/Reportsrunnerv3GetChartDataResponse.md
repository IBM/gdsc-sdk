# Reportsrunnerv3GetChartDataResponse

GetChartDataResponse is the return type of GetChartData API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_layout** | [**Reportsv3ChartDisplayLayout**](Reportsv3ChartDisplayLayout.md) |  | [optional] 
**data** | [**List[Reportsrunnerv3DataRow]**](Reportsrunnerv3DataRow.md) | Chart data. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_get_chart_data_response import Reportsrunnerv3GetChartDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3GetChartDataResponse from a JSON string
reportsrunnerv3_get_chart_data_response_instance = Reportsrunnerv3GetChartDataResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3GetChartDataResponse.to_json())

# convert the object into a dict
reportsrunnerv3_get_chart_data_response_dict = reportsrunnerv3_get_chart_data_response_instance.to_dict()
# create an instance of Reportsrunnerv3GetChartDataResponse from a dict
reportsrunnerv3_get_chart_data_response_from_dict = Reportsrunnerv3GetChartDataResponse.from_dict(reportsrunnerv3_get_chart_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


