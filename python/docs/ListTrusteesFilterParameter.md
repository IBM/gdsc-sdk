# ListTrusteesFilterParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vendor_id** | **str** |  | [optional] 
**data_store_id** | **str** |  | [optional] 
**cloud_account_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.list_trustees_filter_parameter import ListTrusteesFilterParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListTrusteesFilterParameter from a JSON string
list_trustees_filter_parameter_instance = ListTrusteesFilterParameter.from_json(json)
# print the JSON string representation of the object
print(ListTrusteesFilterParameter.to_json())

# convert the object into a dict
list_trustees_filter_parameter_dict = list_trustees_filter_parameter_instance.to_dict()
# create an instance of ListTrusteesFilterParameter from a dict
list_trustees_filter_parameter_from_dict = ListTrusteesFilterParameter.from_dict(list_trustees_filter_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


