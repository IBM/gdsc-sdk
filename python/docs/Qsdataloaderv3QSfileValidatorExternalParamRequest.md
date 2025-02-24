# Qsdataloaderv3QSfileValidatorExternalParamRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_file_name** | **str** |  | [optional] 
**bucket_name** | **str** |  | [optional] 
**explorer_file_name** | **str** |  | [optional] 
**folder_name** | **str** |  | [optional] 
**network_file_name** | **str** |  | [optional] 
**policy_file_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qsdataloaderv3_q_sfile_validator_external_param_request import Qsdataloaderv3QSfileValidatorExternalParamRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Qsdataloaderv3QSfileValidatorExternalParamRequest from a JSON string
qsdataloaderv3_q_sfile_validator_external_param_request_instance = Qsdataloaderv3QSfileValidatorExternalParamRequest.from_json(json)
# print the JSON string representation of the object
print(Qsdataloaderv3QSfileValidatorExternalParamRequest.to_json())

# convert the object into a dict
qsdataloaderv3_q_sfile_validator_external_param_request_dict = qsdataloaderv3_q_sfile_validator_external_param_request_instance.to_dict()
# create an instance of Qsdataloaderv3QSfileValidatorExternalParamRequest from a dict
qsdataloaderv3_q_sfile_validator_external_param_request_from_dict = Qsdataloaderv3QSfileValidatorExternalParamRequest.from_dict(qsdataloaderv3_q_sfile_validator_external_param_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


