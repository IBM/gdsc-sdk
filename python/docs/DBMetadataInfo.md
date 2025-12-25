# DBMetadataInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** |  | [optional] 
**is_transient** | **str** |  | [optional] 
**creation_time** | **float** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.db_metadata_info import DBMetadataInfo

# TODO update the JSON string below
json = "{}"
# create an instance of DBMetadataInfo from a JSON string
db_metadata_info_instance = DBMetadataInfo.from_json(json)
# print the JSON string representation of the object
print(DBMetadataInfo.to_json())

# convert the object into a dict
db_metadata_info_dict = db_metadata_info_instance.to_dict()
# create an instance of DBMetadataInfo from a dict
db_metadata_info_from_dict = DBMetadataInfo.from_dict(db_metadata_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


