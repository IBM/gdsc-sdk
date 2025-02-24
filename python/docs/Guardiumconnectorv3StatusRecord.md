# Guardiumconnectorv3StatusRecord

StatusRecord is the streaming status for each Guardium unit returned by grdapi.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**List[Guardiumconnectorv3StatusAttribute]**](Guardiumconnectorv3StatusAttribute.md) | Attributes of the Guardium unit (version, unitType, isUnitOnline, etc). | [optional] 
**host_name** | **str** | Hostname as its being sent by GDP. | [optional] 
**message** | **str** | Message describing status. | [optional] 
**state** | **str** | Streaming state: enabled, disabled. | [optional] 
**status** | **str** | Current status of streaming (e.g sucess,failed,...). | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_status_record import Guardiumconnectorv3StatusRecord

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3StatusRecord from a JSON string
guardiumconnectorv3_status_record_instance = Guardiumconnectorv3StatusRecord.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3StatusRecord.to_json())

# convert the object into a dict
guardiumconnectorv3_status_record_dict = guardiumconnectorv3_status_record_instance.to_dict()
# create an instance of Guardiumconnectorv3StatusRecord from a dict
guardiumconnectorv3_status_record_from_dict = Guardiumconnectorv3StatusRecord.from_dict(guardiumconnectorv3_status_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


