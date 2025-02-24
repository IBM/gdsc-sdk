# Templatesv3SimpleRecipient

SimpleRecipient is specified for integrations that require a default contact when one is not explicitly defined.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipient_type** | [**SimpleRecipientSimpleRecipientType**](SimpleRecipientSimpleRecipientType.md) |  | [optional] 
**value** | **str** | Value is a comma separated list of Insights USER ids or EMAIL addresses or a single GROUP name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.templatesv3_simple_recipient import Templatesv3SimpleRecipient

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3SimpleRecipient from a JSON string
templatesv3_simple_recipient_instance = Templatesv3SimpleRecipient.from_json(json)
# print the JSON string representation of the object
print(Templatesv3SimpleRecipient.to_json())

# convert the object into a dict
templatesv3_simple_recipient_dict = templatesv3_simple_recipient_instance.to_dict()
# create an instance of Templatesv3SimpleRecipient from a dict
templatesv3_simple_recipient_from_dict = Templatesv3SimpleRecipient.from_dict(templatesv3_simple_recipient_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


