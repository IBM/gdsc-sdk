# Healthcollectorv3StatusResponseBase

StatusReponseBase is the default message from the Guardium connector.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Optional message field. | [optional] 
**status** | **str** | Status code returned by the Guardium connector. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_status_response_base import Healthcollectorv3StatusResponseBase

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3StatusResponseBase from a JSON string
healthcollectorv3_status_response_base_instance = Healthcollectorv3StatusResponseBase.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3StatusResponseBase.to_json())

# convert the object into a dict
healthcollectorv3_status_response_base_dict = healthcollectorv3_status_response_base_instance.to_dict()
# create an instance of Healthcollectorv3StatusResponseBase from a dict
healthcollectorv3_status_response_base_from_dict = Healthcollectorv3StatusResponseBase.from_dict(healthcollectorv3_status_response_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


