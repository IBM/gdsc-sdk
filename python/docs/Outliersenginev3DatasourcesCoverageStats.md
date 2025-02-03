# Outliersenginev3DatasourcesCoverageStats

Describes how many data sources are incoming for outlier analytics compared to the overall data sources seen in GI.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasources_coverage** | **str** |  | [optional] 
**datasources_in_gi** | **int** |  | [optional] 
**datasources_in_queue** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.outliersenginev3_datasources_coverage_stats import Outliersenginev3DatasourcesCoverageStats

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3DatasourcesCoverageStats from a JSON string
outliersenginev3_datasources_coverage_stats_instance = Outliersenginev3DatasourcesCoverageStats.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3DatasourcesCoverageStats.to_json())

# convert the object into a dict
outliersenginev3_datasources_coverage_stats_dict = outliersenginev3_datasources_coverage_stats_instance.to_dict()
# create an instance of Outliersenginev3DatasourcesCoverageStats from a dict
outliersenginev3_datasources_coverage_stats_from_dict = Outliersenginev3DatasourcesCoverageStats.from_dict(outliersenginev3_datasources_coverage_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


