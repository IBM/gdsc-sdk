# Connectionsv3ConnectorSummary

Connector summary.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status_green** | **int** | The number of connections with a green status. | [optional] 
**status_red** | **int** | The number of connections with a red status. | [optional] 
**status_yellow** | **int** | The number of connections with a yellow status. | [optional] 
**type** | [**Connectionsv3ConnectorType**](Connectionsv3ConnectorType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_connector_summary import Connectionsv3ConnectorSummary

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3ConnectorSummary from a JSON string
connectionsv3_connector_summary_instance = Connectionsv3ConnectorSummary.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3ConnectorSummary.to_json())

# convert the object into a dict
connectionsv3_connector_summary_dict = connectionsv3_connector_summary_instance.to_dict()
# create an instance of Connectionsv3ConnectorSummary from a dict
connectionsv3_connector_summary_from_dict = Connectionsv3ConnectorSummary.from_dict(connectionsv3_connector_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


