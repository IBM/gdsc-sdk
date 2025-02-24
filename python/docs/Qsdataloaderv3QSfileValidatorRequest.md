# Qsdataloaderv3QSfileValidatorRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_param** | [**Qsdataloaderv3QSfileValidatorExternalParamRequest**](Qsdataloaderv3QSfileValidatorExternalParamRequest.md) |  | [optional] 
**org_id** | **str** |  | [optional] 
**plugin_id** | **str** |  | [optional] 
**run_for_all_scans** | **bool** |  | [optional] 
**scan_desc** | **str** |  | [optional] 
**scan_id** | **str** |  | [optional] 
**user_email** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qsdataloaderv3_q_sfile_validator_request import Qsdataloaderv3QSfileValidatorRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Qsdataloaderv3QSfileValidatorRequest from a JSON string
qsdataloaderv3_q_sfile_validator_request_instance = Qsdataloaderv3QSfileValidatorRequest.from_json(json)
# print the JSON string representation of the object
print(Qsdataloaderv3QSfileValidatorRequest.to_json())

# convert the object into a dict
qsdataloaderv3_q_sfile_validator_request_dict = qsdataloaderv3_q_sfile_validator_request_instance.to_dict()
# create an instance of Qsdataloaderv3QSfileValidatorRequest from a dict
qsdataloaderv3_q_sfile_validator_request_from_dict = Qsdataloaderv3QSfileValidatorRequest.from_dict(qsdataloaderv3_q_sfile_validator_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


