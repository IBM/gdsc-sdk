# Universalconnectormanagerv3ListConnectionsResponse

Structure for a Summary of [Universal connector] Connections.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connections** | [**List[Universalconnectormanagerv3ConnectionSummary]**](Universalconnectormanagerv3ConnectionSummary.md) | Summaries of Universal connector Connection cofigurations, along with their status. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.universalconnectormanagerv3_list_connections_response import Universalconnectormanagerv3ListConnectionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3ListConnectionsResponse from a JSON string
universalconnectormanagerv3_list_connections_response_instance = Universalconnectormanagerv3ListConnectionsResponse.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3ListConnectionsResponse.to_json())

# convert the object into a dict
universalconnectormanagerv3_list_connections_response_dict = universalconnectormanagerv3_list_connections_response_instance.to_dict()
# create an instance of Universalconnectormanagerv3ListConnectionsResponse from a dict
universalconnectormanagerv3_list_connections_response_from_dict = Universalconnectormanagerv3ListConnectionsResponse.from_dict(universalconnectormanagerv3_list_connections_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


