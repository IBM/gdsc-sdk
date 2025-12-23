# Outliersenginev3SourceAttributesStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statistics** | [**List[Outliersenginev3AttributeStatistics]**](Outliersenginev3AttributeStatistics.md) |  | [optional] 
**total_number_of_attributes** | **int** |  | [optional] 
**type** | [**Outliersenginev3SourceAttributeType**](Outliersenginev3SourceAttributeType.md) |  | [optional] [default to Outliersenginev3SourceAttributeType.UNDEFINED_SOURCE_STATISTICS_TYPE]

## Example

```python
from ibm_gdsc_sdk_saas.models.outliersenginev3_source_attributes_statistics import Outliersenginev3SourceAttributesStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3SourceAttributesStatistics from a JSON string
outliersenginev3_source_attributes_statistics_instance = Outliersenginev3SourceAttributesStatistics.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3SourceAttributesStatistics.to_json())

# convert the object into a dict
outliersenginev3_source_attributes_statistics_dict = outliersenginev3_source_attributes_statistics_instance.to_dict()
# create an instance of Outliersenginev3SourceAttributesStatistics from a dict
outliersenginev3_source_attributes_statistics_from_dict = Outliersenginev3SourceAttributesStatistics.from_dict(outliersenginev3_source_attributes_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


