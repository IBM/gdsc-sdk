# Outliersenginev3Source


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**database_name** | **str** |  | [optional] 
**db_user** | **str** |  | [optional] 
**server_ip** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.outliersenginev3_source import Outliersenginev3Source

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3Source from a JSON string
outliersenginev3_source_instance = Outliersenginev3Source.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3Source.to_json())

# convert the object into a dict
outliersenginev3_source_dict = outliersenginev3_source_instance.to_dict()
# create an instance of Outliersenginev3Source from a dict
outliersenginev3_source_from_dict = Outliersenginev3Source.from_dict(outliersenginev3_source_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


