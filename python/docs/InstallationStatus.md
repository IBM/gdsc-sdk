# InstallationStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discovery_permissions** | **bool** |  | [optional] 
**is_install_complete** | **bool** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.installation_status import InstallationStatus

# TODO update the JSON string below
json = "{}"
# create an instance of InstallationStatus from a JSON string
installation_status_instance = InstallationStatus.from_json(json)
# print the JSON string representation of the object
print(InstallationStatus.to_json())

# convert the object into a dict
installation_status_dict = installation_status_instance.to_dict()
# create an instance of InstallationStatus from a dict
installation_status_from_dict = InstallationStatus.from_dict(installation_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


