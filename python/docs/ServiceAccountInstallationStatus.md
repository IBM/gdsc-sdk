# ServiceAccountInstallationStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**installation_status** | **bool** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.service_account_installation_status import ServiceAccountInstallationStatus

# TODO update the JSON string below
json = "{}"
# create an instance of ServiceAccountInstallationStatus from a JSON string
service_account_installation_status_instance = ServiceAccountInstallationStatus.from_json(json)
# print the JSON string representation of the object
print(ServiceAccountInstallationStatus.to_json())

# convert the object into a dict
service_account_installation_status_dict = service_account_installation_status_instance.to_dict()
# create an instance of ServiceAccountInstallationStatus from a dict
service_account_installation_status_from_dict = ServiceAccountInstallationStatus.from_dict(service_account_installation_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


