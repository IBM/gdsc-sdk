# Connectionsv3DataSource

Data source.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | The key of the data source. | [optional] 
**last_used** | **datetime** | The last time it was used. | [optional] 
**name** | **str** | The name of the data source. | [optional] 
**other_types** | **List[str]** | Other types. | [optional] 
**stream_type** | **str** | The stream type of the data source. | [optional] 
**types** | [**List[Connectionsv3ConnectorType]**](Connectionsv3ConnectorType.md) | The type of the environment. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_data_source import Connectionsv3DataSource

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3DataSource from a JSON string
connectionsv3_data_source_instance = Connectionsv3DataSource.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3DataSource.to_json())

# convert the object into a dict
connectionsv3_data_source_dict = connectionsv3_data_source_instance.to_dict()
# create an instance of Connectionsv3DataSource from a dict
connectionsv3_data_source_from_dict = Connectionsv3DataSource.from_dict(connectionsv3_data_source_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


