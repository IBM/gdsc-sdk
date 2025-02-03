# Universalconnectormanagerv3DatasourcesResponse

List of datasources defined for Univesal Connector with their details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasources** | [**List[Universalconnectormanagerv3DatasourceDefinition]**](Universalconnectormanagerv3DatasourceDefinition.md) | Collection of datasource definitions. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_datasources_response import Universalconnectormanagerv3DatasourcesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3DatasourcesResponse from a JSON string
universalconnectormanagerv3_datasources_response_instance = Universalconnectormanagerv3DatasourcesResponse.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3DatasourcesResponse.to_json())

# convert the object into a dict
universalconnectormanagerv3_datasources_response_dict = universalconnectormanagerv3_datasources_response_instance.to_dict()
# create an instance of Universalconnectormanagerv3DatasourcesResponse from a dict
universalconnectormanagerv3_datasources_response_from_dict = Universalconnectormanagerv3DatasourcesResponse.from_dict(universalconnectormanagerv3_datasources_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


