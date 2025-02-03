# Trustee


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** |  | 
**name** | **str** |  | 
**asset_type** | **str** |  | 
**link** | **str** |  | 
**permissions** | [**List[AccessType]**](AccessType.md) |  | [optional] 
**cloud_account_details** | [**CloudAccountDetails**](CloudAccountDetails.md) |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.trustee import Trustee

# TODO update the JSON string below
json = "{}"
# create an instance of Trustee from a JSON string
trustee_instance = Trustee.from_json(json)
# print the JSON string representation of the object
print(Trustee.to_json())

# convert the object into a dict
trustee_dict = trustee_instance.to_dict()
# create an instance of Trustee from a dict
trustee_from_dict = Trustee.from_dict(trustee_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


