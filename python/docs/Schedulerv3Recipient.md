# Schedulerv3Recipient

Recipient includes the receiver data for this job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integration_id** | **str** | Optional: The integration unique id (configuration object id). | [optional] 
**label** | **str** |  | [optional] 
**template_id** | **str** | Optional: Id of the template to use when sending e-mail. | [optional] 
**type** | [**Schedulerv3RecipientType**](Schedulerv3RecipientType.md) |  | [optional] 
**value** | **str** | Who to assign as the report result reviewer. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_recipient import Schedulerv3Recipient

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3Recipient from a JSON string
schedulerv3_recipient_instance = Schedulerv3Recipient.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3Recipient.to_json())

# convert the object into a dict
schedulerv3_recipient_dict = schedulerv3_recipient_instance.to_dict()
# create an instance of Schedulerv3Recipient from a dict
schedulerv3_recipient_from_dict = Schedulerv3Recipient.from_dict(schedulerv3_recipient_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


