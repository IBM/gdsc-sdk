# Reportsv3GetChartQueryResponse

GetChartQueryResponse is the return type of the GetQueryByChartID() api and GetQueryByReportChartSettings() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chart_layout** | [**Reportsv3ChartDisplayLayout**](Reportsv3ChartDisplayLayout.md) |  | [optional] 
**model_type** | [**Reportsv3ModelType**](Reportsv3ModelType.md) |  | [optional] [default to Reportsv3ModelType.UNDEFINED_MODEL_TYPE]
**query** | **str** | The chart&#39;s query. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_chart_query_response import Reportsv3GetChartQueryResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetChartQueryResponse from a JSON string
reportsv3_get_chart_query_response_instance = Reportsv3GetChartQueryResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetChartQueryResponse.to_json())

# convert the object into a dict
reportsv3_get_chart_query_response_dict = reportsv3_get_chart_query_response_instance.to_dict()
# create an instance of Reportsv3GetChartQueryResponse from a dict
reportsv3_get_chart_query_response_from_dict = Reportsv3GetChartQueryResponse.from_dict(reportsv3_get_chart_query_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


