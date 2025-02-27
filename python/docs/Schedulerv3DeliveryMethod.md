# Schedulerv3DeliveryMethod

DeliveryMethod configures who receives the report and how they receive it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_format** | [**Schedulerv3FileFormat**](Schedulerv3FileFormat.md) |  | [optional] 
**report_time_zone** | **str** | Optional: Preferred time zone to have all timestamps in. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_delivery_method import Schedulerv3DeliveryMethod

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3DeliveryMethod from a JSON string
schedulerv3_delivery_method_instance = Schedulerv3DeliveryMethod.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3DeliveryMethod.to_json())

# convert the object into a dict
schedulerv3_delivery_method_dict = schedulerv3_delivery_method_instance.to_dict()
# create an instance of Schedulerv3DeliveryMethod from a dict
schedulerv3_delivery_method_from_dict = Schedulerv3DeliveryMethod.from_dict(schedulerv3_delivery_method_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


