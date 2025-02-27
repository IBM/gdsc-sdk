# Reportsv3FieldName

FieldName represents a field name's translation key and its translated value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customized_value** | **str** | User-defined field name. | [optional] 
**nls_key** | **str** | Identifies the field&#39;s name NLS translated string. | [optional] 
**nls_value** | **str** | The field&#39;s name NLS translated string. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_field_name import Reportsv3FieldName

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3FieldName from a JSON string
reportsv3_field_name_instance = Reportsv3FieldName.from_json(json)
# print the JSON string representation of the object
print(Reportsv3FieldName.to_json())

# convert the object into a dict
reportsv3_field_name_dict = reportsv3_field_name_instance.to_dict()
# create an instance of Reportsv3FieldName from a dict
reportsv3_field_name_from_dict = Reportsv3FieldName.from_dict(reportsv3_field_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


