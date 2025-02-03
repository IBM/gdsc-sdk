# StringKeyValue


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | 
**value** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.string_key_value import StringKeyValue

# TODO update the JSON string below
json = "{}"
# create an instance of StringKeyValue from a JSON string
string_key_value_instance = StringKeyValue.from_json(json)
# print the JSON string representation of the object
print(StringKeyValue.to_json())

# convert the object into a dict
string_key_value_dict = string_key_value_instance.to_dict()
# create an instance of StringKeyValue from a dict
string_key_value_from_dict = StringKeyValue.from_dict(string_key_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


