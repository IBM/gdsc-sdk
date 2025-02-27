# Universalconnectormanagerv3DatasourceResponse

DatasourceResponse is a return type of CRUD operation on UC datasource configuration (as it saved in mongo / configuration service).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasource_id** | **str** | Configuration id of datasource. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.universalconnectormanagerv3_datasource_response import Universalconnectormanagerv3DatasourceResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3DatasourceResponse from a JSON string
universalconnectormanagerv3_datasource_response_instance = Universalconnectormanagerv3DatasourceResponse.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3DatasourceResponse.to_json())

# convert the object into a dict
universalconnectormanagerv3_datasource_response_dict = universalconnectormanagerv3_datasource_response_instance.to_dict()
# create an instance of Universalconnectormanagerv3DatasourceResponse from a dict
universalconnectormanagerv3_datasource_response_from_dict = Universalconnectormanagerv3DatasourceResponse.from_dict(universalconnectormanagerv3_datasource_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


