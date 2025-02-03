# Guardiumconnectorv3StreamingStatusRecord

Streaming status for a particular Managed Unit.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**List[Guardiumconnectorv3Attribute]**](Guardiumconnectorv3Attribute.md) | Name/value pair attributes stored in config db. | [optional] 
**message** | **str** | Message describing status. | [optional] 
**mu** | **str** | MU Name. | [optional] 
**state** | **str** | Streaming state : enabled, disabled. | [optional] 
**status** | **str** | Streaming configuration current status (e.g RUNNING,DONE,FAILED,...). | [optional] 
**unit_type** | **str** | Type of managed unit (Collector or Aggregator). | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_streaming_status_record import Guardiumconnectorv3StreamingStatusRecord

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3StreamingStatusRecord from a JSON string
guardiumconnectorv3_streaming_status_record_instance = Guardiumconnectorv3StreamingStatusRecord.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3StreamingStatusRecord.to_json())

# convert the object into a dict
guardiumconnectorv3_streaming_status_record_dict = guardiumconnectorv3_streaming_status_record_instance.to_dict()
# create an instance of Guardiumconnectorv3StreamingStatusRecord from a dict
guardiumconnectorv3_streaming_status_record_from_dict = Guardiumconnectorv3StreamingStatusRecord.from_dict(guardiumconnectorv3_streaming_status_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


