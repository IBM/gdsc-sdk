# Universalconnectormanagerv3DatasourceDefinition

Datasource Definition encapsulates all data necessary for a handling datasource in Universal Connector.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasource_filter** | **str** | Datasource configuration filter section text. | [optional] 
**datasource_id** | **str** | The datasource ID. | [optional] 
**datasource_input** | **str** | Datasource configuration input section text. | [optional] 
**datasource_name** | **str** | Datasource name. | [optional] 
**owner_user_id** | **str** | The name of the user created datasource. | [optional] 
**update_time** | **datetime** | The datasource update time. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_datasource_definition import Universalconnectormanagerv3DatasourceDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3DatasourceDefinition from a JSON string
universalconnectormanagerv3_datasource_definition_instance = Universalconnectormanagerv3DatasourceDefinition.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3DatasourceDefinition.to_json())

# convert the object into a dict
universalconnectormanagerv3_datasource_definition_dict = universalconnectormanagerv3_datasource_definition_instance.to_dict()
# create an instance of Universalconnectormanagerv3DatasourceDefinition from a dict
universalconnectormanagerv3_datasource_definition_from_dict = Universalconnectormanagerv3DatasourceDefinition.from_dict(universalconnectormanagerv3_datasource_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


