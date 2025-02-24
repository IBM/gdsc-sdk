# Reportsv3GetChartQueryResponsev2

GetChartQueryResponsev2 is the return type of the GetQueryByChartIDv2() api and GetQueryByReportChartSettingsv2() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **str** | The chart&#39;s query. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_chart_query_responsev2 import Reportsv3GetChartQueryResponsev2

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetChartQueryResponsev2 from a JSON string
reportsv3_get_chart_query_responsev2_instance = Reportsv3GetChartQueryResponsev2.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetChartQueryResponsev2.to_json())

# convert the object into a dict
reportsv3_get_chart_query_responsev2_dict = reportsv3_get_chart_query_responsev2_instance.to_dict()
# create an instance of Reportsv3GetChartQueryResponsev2 from a dict
reportsv3_get_chart_query_responsev2_from_dict = Reportsv3GetChartQueryResponsev2.from_dict(reportsv3_get_chart_query_responsev2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


