# UpdateCustodianBody


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_store_id** | **str** |  | 
**custodian** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.update_custodian_body import UpdateCustodianBody

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateCustodianBody from a JSON string
update_custodian_body_instance = UpdateCustodianBody.from_json(json)
# print the JSON string representation of the object
print(UpdateCustodianBody.to_json())

# convert the object into a dict
update_custodian_body_dict = update_custodian_body_instance.to_dict()
# create an instance of UpdateCustodianBody from a dict
update_custodian_body_from_dict = UpdateCustodianBody.from_dict(update_custodian_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


