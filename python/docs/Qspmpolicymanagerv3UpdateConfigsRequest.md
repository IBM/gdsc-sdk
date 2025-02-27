# Qspmpolicymanagerv3UpdateConfigsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**options** | **Dict[str, float]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_update_configs_request import Qspmpolicymanagerv3UpdateConfigsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmpolicymanagerv3UpdateConfigsRequest from a JSON string
qspmpolicymanagerv3_update_configs_request_instance = Qspmpolicymanagerv3UpdateConfigsRequest.from_json(json)
# print the JSON string representation of the object
print(Qspmpolicymanagerv3UpdateConfigsRequest.to_json())

# convert the object into a dict
qspmpolicymanagerv3_update_configs_request_dict = qspmpolicymanagerv3_update_configs_request_instance.to_dict()
# create an instance of Qspmpolicymanagerv3UpdateConfigsRequest from a dict
qspmpolicymanagerv3_update_configs_request_from_dict = Qspmpolicymanagerv3UpdateConfigsRequest.from_dict(qspmpolicymanagerv3_update_configs_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


