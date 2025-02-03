# Reportsv3CategoryVersion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**header_map** | **Dict[str, str]** |  | [optional] 
**name** | **str** |  | [optional] 
**primary** | **bool** |  | [optional] 
**skip_join_only** | **bool** |  | [optional] 
**table_map** | [**Dict[str, Reportsv3TableNames]**](Reportsv3TableNames.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_category_version import Reportsv3CategoryVersion

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CategoryVersion from a JSON string
reportsv3_category_version_instance = Reportsv3CategoryVersion.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CategoryVersion.to_json())

# convert the object into a dict
reportsv3_category_version_dict = reportsv3_category_version_instance.to_dict()
# create an instance of Reportsv3CategoryVersion from a dict
reportsv3_category_version_from_dict = Reportsv3CategoryVersion.from_dict(reportsv3_category_version_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


