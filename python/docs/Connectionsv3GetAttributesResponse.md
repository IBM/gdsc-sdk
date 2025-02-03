# Connectionsv3GetAttributesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**List[Connectionsv3ConnectorAttribute]**](Connectionsv3ConnectorAttribute.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_get_attributes_response import Connectionsv3GetAttributesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GetAttributesResponse from a JSON string
connectionsv3_get_attributes_response_instance = Connectionsv3GetAttributesResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GetAttributesResponse.to_json())

# convert the object into a dict
connectionsv3_get_attributes_response_dict = connectionsv3_get_attributes_response_instance.to_dict()
# create an instance of Connectionsv3GetAttributesResponse from a dict
connectionsv3_get_attributes_response_from_dict = Connectionsv3GetAttributesResponse.from_dict(connectionsv3_get_attributes_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


