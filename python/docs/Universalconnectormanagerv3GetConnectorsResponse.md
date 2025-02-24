# Universalconnectormanagerv3GetConnectorsResponse

Response specification for Universal connector connectors.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectors** | [**List[Universalconnectormanagerv3ConnectorSummary]**](Universalconnectormanagerv3ConnectorSummary.md) | An array of connector definitions, with extended details about their plugins. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.universalconnectormanagerv3_get_connectors_response import Universalconnectormanagerv3GetConnectorsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3GetConnectorsResponse from a JSON string
universalconnectormanagerv3_get_connectors_response_instance = Universalconnectormanagerv3GetConnectorsResponse.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3GetConnectorsResponse.to_json())

# convert the object into a dict
universalconnectormanagerv3_get_connectors_response_dict = universalconnectormanagerv3_get_connectors_response_instance.to_dict()
# create an instance of Universalconnectormanagerv3GetConnectorsResponse from a dict
universalconnectormanagerv3_get_connectors_response_from_dict = Universalconnectormanagerv3GetConnectorsResponse.from_dict(universalconnectormanagerv3_get_connectors_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


