# Notificationsv3TemplateProperty

A single property to be added or updated for data layout processing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of a property to be used in the notification data layout. | [optional] 
**value** | **str** | The value associated with the property name in the notifications data layout. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.notificationsv3_template_property import Notificationsv3TemplateProperty

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3TemplateProperty from a JSON string
notificationsv3_template_property_instance = Notificationsv3TemplateProperty.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3TemplateProperty.to_json())

# convert the object into a dict
notificationsv3_template_property_dict = notificationsv3_template_property_instance.to_dict()
# create an instance of Notificationsv3TemplateProperty from a dict
notificationsv3_template_property_from_dict = Notificationsv3TemplateProperty.from_dict(notificationsv3_template_property_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


