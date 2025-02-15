# TokenExpiryInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token_expiry_days** | **float** |  | [optional] 
**token_expiry_timestamp** | **float** |  | [optional] 
**auth_url** | **str** |  | [optional] 
**expired** | **bool** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.token_expiry_info import TokenExpiryInfo

# TODO update the JSON string below
json = "{}"
# create an instance of TokenExpiryInfo from a JSON string
token_expiry_info_instance = TokenExpiryInfo.from_json(json)
# print the JSON string representation of the object
print(TokenExpiryInfo.to_json())

# convert the object into a dict
token_expiry_info_dict = token_expiry_info_instance.to_dict()
# create an instance of TokenExpiryInfo from a dict
token_expiry_info_from_dict = TokenExpiryInfo.from_dict(token_expiry_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


