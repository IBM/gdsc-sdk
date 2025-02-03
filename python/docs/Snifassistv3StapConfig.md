# Snifassistv3StapConfig

StapConfig defines the message structure for STAP configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crc** | **int** | CRC value of STAP configuration. | [optional] 
**data** | **bytearray** | Configuration data field. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.snifassistv3_stap_config import Snifassistv3StapConfig

# TODO update the JSON string below
json = "{}"
# create an instance of Snifassistv3StapConfig from a JSON string
snifassistv3_stap_config_instance = Snifassistv3StapConfig.from_json(json)
# print the JSON string representation of the object
print(Snifassistv3StapConfig.to_json())

# convert the object into a dict
snifassistv3_stap_config_dict = snifassistv3_stap_config_instance.to_dict()
# create an instance of Snifassistv3StapConfig from a dict
snifassistv3_stap_config_from_dict = Snifassistv3StapConfig.from_dict(snifassistv3_stap_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


