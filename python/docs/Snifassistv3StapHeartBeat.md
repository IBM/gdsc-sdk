# Snifassistv3StapHeartBeat

StapHeartBeat defines the message structure for STAP heartbeat.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **str** | Heartbeat timestamp that sniffer receives from STAP. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.snifassistv3_stap_heart_beat import Snifassistv3StapHeartBeat

# TODO update the JSON string below
json = "{}"
# create an instance of Snifassistv3StapHeartBeat from a JSON string
snifassistv3_stap_heart_beat_instance = Snifassistv3StapHeartBeat.from_json(json)
# print the JSON string representation of the object
print(Snifassistv3StapHeartBeat.to_json())

# convert the object into a dict
snifassistv3_stap_heart_beat_dict = snifassistv3_stap_heart_beat_instance.to_dict()
# create an instance of Snifassistv3StapHeartBeat from a dict
snifassistv3_stap_heart_beat_from_dict = Snifassistv3StapHeartBeat.from_dict(snifassistv3_stap_heart_beat_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


