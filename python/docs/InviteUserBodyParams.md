# InviteUserBodyParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.invite_user_body_params import InviteUserBodyParams

# TODO update the JSON string below
json = "{}"
# create an instance of InviteUserBodyParams from a JSON string
invite_user_body_params_instance = InviteUserBodyParams.from_json(json)
# print the JSON string representation of the object
print(InviteUserBodyParams.to_json())

# convert the object into a dict
invite_user_body_params_dict = invite_user_body_params_instance.to_dict()
# create an instance of InviteUserBodyParams from a dict
invite_user_body_params_from_dict = InviteUserBodyParams.from_dict(invite_user_body_params_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


