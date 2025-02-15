# AuthenticateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **str** | Name of the user to log in to Guardium DSPM. | 
**password** | **str** | Password of the user to log in to Guardium DSPM. | 

## Example

```python
from ibm_gdsc_sdk_software.models.authenticate_request import AuthenticateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AuthenticateRequest from a JSON string
authenticate_request_instance = AuthenticateRequest.from_json(json)
# print the JSON string representation of the object
print(AuthenticateRequest.to_json())

# convert the object into a dict
authenticate_request_dict = authenticate_request_instance.to_dict()
# create an instance of AuthenticateRequest from a dict
authenticate_request_from_dict = AuthenticateRequest.from_dict(authenticate_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


