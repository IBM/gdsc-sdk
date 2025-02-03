# Connectionsv3PartialUpdateConnectorsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**status** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_partial_update_connectors_response import Connectionsv3PartialUpdateConnectorsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3PartialUpdateConnectorsResponse from a JSON string
connectionsv3_partial_update_connectors_response_instance = Connectionsv3PartialUpdateConnectorsResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3PartialUpdateConnectorsResponse.to_json())

# convert the object into a dict
connectionsv3_partial_update_connectors_response_dict = connectionsv3_partial_update_connectors_response_instance.to_dict()
# create an instance of Connectionsv3PartialUpdateConnectorsResponse from a dict
connectionsv3_partial_update_connectors_response_from_dict = Connectionsv3PartialUpdateConnectorsResponse.from_dict(connectionsv3_partial_update_connectors_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


