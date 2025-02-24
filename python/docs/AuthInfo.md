# AuthInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** |  | 
**provider_id** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.auth_info import AuthInfo

# TODO update the JSON string below
json = "{}"
# create an instance of AuthInfo from a JSON string
auth_info_instance = AuthInfo.from_json(json)
# print the JSON string representation of the object
print(AuthInfo.to_json())

# convert the object into a dict
auth_info_dict = auth_info_instance.to_dict()
# create an instance of AuthInfo from a dict
auth_info_from_dict = AuthInfo.from_dict(auth_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


