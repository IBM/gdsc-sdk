# AddCloudAccounts200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**installation_url** | **str** | Use this URL to download the installation script. | [optional] 
**installation_script** | **str** | Use this URL to download the installation script | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.add_cloud_accounts200_response import AddCloudAccounts200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AddCloudAccounts200Response from a JSON string
add_cloud_accounts200_response_instance = AddCloudAccounts200Response.from_json(json)
# print the JSON string representation of the object
print(AddCloudAccounts200Response.to_json())

# convert the object into a dict
add_cloud_accounts200_response_dict = add_cloud_accounts200_response_instance.to_dict()
# create an instance of AddCloudAccounts200Response from a dict
add_cloud_accounts200_response_from_dict = AddCloudAccounts200Response.from_dict(add_cloud_accounts200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


