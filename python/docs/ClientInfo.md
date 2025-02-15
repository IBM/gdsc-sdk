# ClientInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** |  | 
**client_secret** | **str** |  | 
**auth_endpoint** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.client_info import ClientInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ClientInfo from a JSON string
client_info_instance = ClientInfo.from_json(json)
# print the JSON string representation of the object
print(ClientInfo.to_json())

# convert the object into a dict
client_info_dict = client_info_instance.to_dict()
# create an instance of ClientInfo from a dict
client_info_from_dict = ClientInfo.from_dict(client_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


