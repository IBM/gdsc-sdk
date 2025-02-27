# Ecosystemv3DataEntry

Single date entry format.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entry** | **Dict[str, str]** | Column name and value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.ecosystemv3_data_entry import Ecosystemv3DataEntry

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3DataEntry from a JSON string
ecosystemv3_data_entry_instance = Ecosystemv3DataEntry.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3DataEntry.to_json())

# convert the object into a dict
ecosystemv3_data_entry_dict = ecosystemv3_data_entry_instance.to_dict()
# create an instance of Ecosystemv3DataEntry from a dict
ecosystemv3_data_entry_from_dict = Ecosystemv3DataEntry.from_dict(ecosystemv3_data_entry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


