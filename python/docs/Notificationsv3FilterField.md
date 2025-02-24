# Notificationsv3FilterField

The Filters that can be applied to the given notifications.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[Notificationsv3Filter]**](Notificationsv3Filter.md) | The filters that are eligable to be filtered on. | [optional] 
**name** | **str** | The name of the filter field. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_filter_field import Notificationsv3FilterField

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3FilterField from a JSON string
notificationsv3_filter_field_instance = Notificationsv3FilterField.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3FilterField.to_json())

# convert the object into a dict
notificationsv3_filter_field_dict = notificationsv3_filter_field_instance.to_dict()
# create an instance of Notificationsv3FilterField from a dict
notificationsv3_filter_field_from_dict = Notificationsv3FilterField.from_dict(notificationsv3_filter_field_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


