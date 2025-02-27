# Authenticate200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_token** | **str** | Use this token for future API calls. | 
**refresh_token** | **str** |  | 
**expires_in** | **float** | Time of token expiry. | 

## Example

```python
from ibm_gdsc_sdk_saas.models.authenticate200_response import Authenticate200Response

# TODO update the JSON string below
json = "{}"
# create an instance of Authenticate200Response from a JSON string
authenticate200_response_instance = Authenticate200Response.from_json(json)
# print the JSON string representation of the object
print(Authenticate200Response.to_json())

# convert the object into a dict
authenticate200_response_dict = authenticate200_response_instance.to_dict()
# create an instance of Authenticate200Response from a dict
authenticate200_response_from_dict = Authenticate200Response.from_dict(authenticate200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


