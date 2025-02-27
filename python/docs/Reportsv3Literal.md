# Reportsv3Literal

Literal represents a field name's translation key and its translated value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customized_value** | **str** | User-defined field name. | [optional] 
**nls_key** | **str** | Identifies the literal&#39;s name NLS translated string. | [optional] 
**nls_value** | **str** | The literal&#39;s name NLS translated string. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_literal import Reportsv3Literal

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3Literal from a JSON string
reportsv3_literal_instance = Reportsv3Literal.from_json(json)
# print the JSON string representation of the object
print(Reportsv3Literal.to_json())

# convert the object into a dict
reportsv3_literal_dict = reportsv3_literal_instance.to_dict()
# create an instance of Reportsv3Literal from a dict
reportsv3_literal_from_dict = Reportsv3Literal.from_dict(reportsv3_literal_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


