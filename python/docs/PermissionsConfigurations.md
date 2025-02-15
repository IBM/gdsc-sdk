# PermissionsConfigurations


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**permissions_configurations_id** | **str** |  | 
**permissions_configurations_name** | **str** |  | 
**permissions_configurations_url** | **str** |  | 
**permissions_configurations_type** | **str** |  | 
**assigned_via_id** | **str** |  | 
**assigned_via_name** | **str** |  | 
**assigned_via_url** | **str** |  | 
**assigned_via_type** | **str** |  | 
**assigned_to** | **float** |  | 
**cloud_account_details** | [**CloudAccountDetails**](CloudAccountDetails.md) |  | 
**permissions** | [**List[AccessType]**](AccessType.md) |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.permissions_configurations import PermissionsConfigurations

# TODO update the JSON string below
json = "{}"
# create an instance of PermissionsConfigurations from a JSON string
permissions_configurations_instance = PermissionsConfigurations.from_json(json)
# print the JSON string representation of the object
print(PermissionsConfigurations.to_json())

# convert the object into a dict
permissions_configurations_dict = permissions_configurations_instance.to_dict()
# create an instance of PermissionsConfigurations from a dict
permissions_configurations_from_dict = PermissionsConfigurations.from_dict(permissions_configurations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


