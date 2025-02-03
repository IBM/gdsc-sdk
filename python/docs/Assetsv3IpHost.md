# Assetsv3IpHost

IP addresses and hosts associated with each.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **List[str]** |  | [optional] 
**ip** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_ip_host import Assetsv3IpHost

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3IpHost from a JSON string
assetsv3_ip_host_instance = Assetsv3IpHost.from_json(json)
# print the JSON string representation of the object
print(Assetsv3IpHost.to_json())

# convert the object into a dict
assetsv3_ip_host_dict = assetsv3_ip_host_instance.to_dict()
# create an instance of Assetsv3IpHost from a dict
assetsv3_ip_host_from_dict = Assetsv3IpHost.from_dict(assetsv3_ip_host_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


