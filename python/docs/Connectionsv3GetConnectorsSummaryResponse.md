# Connectionsv3GetConnectorsSummaryResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectors** | [**List[Connectionsv3ConnectorSummary]**](Connectionsv3ConnectorSummary.md) |  | [optional] 
**status** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_get_connectors_summary_response import Connectionsv3GetConnectorsSummaryResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GetConnectorsSummaryResponse from a JSON string
connectionsv3_get_connectors_summary_response_instance = Connectionsv3GetConnectorsSummaryResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GetConnectorsSummaryResponse.to_json())

# convert the object into a dict
connectionsv3_get_connectors_summary_response_dict = connectionsv3_get_connectors_summary_response_instance.to_dict()
# create an instance of Connectionsv3GetConnectorsSummaryResponse from a dict
connectionsv3_get_connectors_summary_response_from_dict = Connectionsv3GetConnectorsSummaryResponse.from_dict(connectionsv3_get_connectors_summary_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


