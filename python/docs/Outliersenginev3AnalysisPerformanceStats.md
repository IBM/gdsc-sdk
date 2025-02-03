# Outliersenginev3AnalysisPerformanceStats

Performance statistics about the events analyzed per second, usually constrained to a specific time period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_seconds** | **int** | Sum of seconds spent in analysis (net). | [optional] 
**events_analyzed** | **int** | Sum of events analyzed. | [optional] 
**events_per_second** | **float** | Average events per second (EPS). Equals to events_analyzed/duration_seconds. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.outliersenginev3_analysis_performance_stats import Outliersenginev3AnalysisPerformanceStats

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3AnalysisPerformanceStats from a JSON string
outliersenginev3_analysis_performance_stats_instance = Outliersenginev3AnalysisPerformanceStats.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3AnalysisPerformanceStats.to_json())

# convert the object into a dict
outliersenginev3_analysis_performance_stats_dict = outliersenginev3_analysis_performance_stats_instance.to_dict()
# create an instance of Outliersenginev3AnalysisPerformanceStats from a dict
outliersenginev3_analysis_performance_stats_from_dict = Outliersenginev3AnalysisPerformanceStats.from_dict(outliersenginev3_analysis_performance_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


