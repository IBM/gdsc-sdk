# Connectionsv3GetDataSourcesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_sources** | [**List[Connectionsv3DataSource]**](Connectionsv3DataSource.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_get_data_sources_response import Connectionsv3GetDataSourcesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GetDataSourcesResponse from a JSON string
connectionsv3_get_data_sources_response_instance = Connectionsv3GetDataSourcesResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GetDataSourcesResponse.to_json())

# convert the object into a dict
connectionsv3_get_data_sources_response_dict = connectionsv3_get_data_sources_response_instance.to_dict()
# create an instance of Connectionsv3GetDataSourcesResponse from a dict
connectionsv3_get_data_sources_response_from_dict = Connectionsv3GetDataSourcesResponse.from_dict(connectionsv3_get_data_sources_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


