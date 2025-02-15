# CloudAccountInstallationStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discovery_permissions** | **bool** |  | 
**is_install_complete** | **bool** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.cloud_account_installation_status import CloudAccountInstallationStatus

# TODO update the JSON string below
json = "{}"
# create an instance of CloudAccountInstallationStatus from a JSON string
cloud_account_installation_status_instance = CloudAccountInstallationStatus.from_json(json)
# print the JSON string representation of the object
print(CloudAccountInstallationStatus.to_json())

# convert the object into a dict
cloud_account_installation_status_dict = cloud_account_installation_status_instance.to_dict()
# create an instance of CloudAccountInstallationStatus from a dict
cloud_account_installation_status_from_dict = CloudAccountInstallationStatus.from_dict(cloud_account_installation_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


