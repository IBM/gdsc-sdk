# Reportsv3TimestampMapping

TimestampMapping represents category related tables with level and timestamp.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**level** | **int** | Level of the table. | [optional] 
**table_name** | **str** | Table name. | [optional] 
**timestamp_header_id** | **str** | The header id. | [optional] 
**timestamp_header_name** | **str** | The table timestamp column. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_timestamp_mapping import Reportsv3TimestampMapping

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3TimestampMapping from a JSON string
reportsv3_timestamp_mapping_instance = Reportsv3TimestampMapping.from_json(json)
# print the JSON string representation of the object
print(Reportsv3TimestampMapping.to_json())

# convert the object into a dict
reportsv3_timestamp_mapping_dict = reportsv3_timestamp_mapping_instance.to_dict()
# create an instance of Reportsv3TimestampMapping from a dict
reportsv3_timestamp_mapping_from_dict = Reportsv3TimestampMapping.from_dict(reportsv3_timestamp_mapping_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


