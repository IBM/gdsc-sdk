# Outliersenginev3OutliersStats

Statistics of the types of outliers found during various time periods.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outlier_type_stats_1h** | [**List[Outliersenginev3OutlierTypeStats]**](Outliersenginev3OutlierTypeStats.md) | Types of outliers found in the last hour. | [optional] 
**outlier_type_stats_24h** | [**List[Outliersenginev3OutlierTypeStats]**](Outliersenginev3OutlierTypeStats.md) | Types of outliers found in the past 24 hours. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.outliersenginev3_outliers_stats import Outliersenginev3OutliersStats

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3OutliersStats from a JSON string
outliersenginev3_outliers_stats_instance = Outliersenginev3OutliersStats.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3OutliersStats.to_json())

# convert the object into a dict
outliersenginev3_outliers_stats_dict = outliersenginev3_outliers_stats_instance.to_dict()
# create an instance of Outliersenginev3OutliersStats from a dict
outliersenginev3_outliers_stats_from_dict = Outliersenginev3OutliersStats.from_dict(outliersenginev3_outliers_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


