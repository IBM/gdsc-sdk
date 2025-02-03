# Universalconnectormanagerv3DatasourceType


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supported_versions** | **List[str]** | Collection of supported versions. | [optional] 
**type** | **str** | Datasource type. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_datasource_type import Universalconnectormanagerv3DatasourceType

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3DatasourceType from a JSON string
universalconnectormanagerv3_datasource_type_instance = Universalconnectormanagerv3DatasourceType.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3DatasourceType.to_json())

# convert the object into a dict
universalconnectormanagerv3_datasource_type_dict = universalconnectormanagerv3_datasource_type_instance.to_dict()
# create an instance of Universalconnectormanagerv3DatasourceType from a dict
universalconnectormanagerv3_datasource_type_from_dict = Universalconnectormanagerv3DatasourceType.from_dict(universalconnectormanagerv3_datasource_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


