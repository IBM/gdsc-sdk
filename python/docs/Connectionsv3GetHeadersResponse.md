# Connectionsv3GetHeadersResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | [**List[Connectionsv3ConnectorHeader]**](Connectionsv3ConnectorHeader.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_get_headers_response import Connectionsv3GetHeadersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GetHeadersResponse from a JSON string
connectionsv3_get_headers_response_instance = Connectionsv3GetHeadersResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GetHeadersResponse.to_json())

# convert the object into a dict
connectionsv3_get_headers_response_dict = connectionsv3_get_headers_response_instance.to_dict()
# create an instance of Connectionsv3GetHeadersResponse from a dict
connectionsv3_get_headers_response_from_dict = Connectionsv3GetHeadersResponse.from_dict(connectionsv3_get_headers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


