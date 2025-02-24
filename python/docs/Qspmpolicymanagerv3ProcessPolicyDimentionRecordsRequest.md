# Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**provison_id_list** | **List[str]** |  | [optional] 
**scan_id_list** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_process_policy_dimention_records_request import Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest from a JSON string
qspmpolicymanagerv3_process_policy_dimention_records_request_instance = Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.from_json(json)
# print the JSON string representation of the object
print(Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.to_json())

# convert the object into a dict
qspmpolicymanagerv3_process_policy_dimention_records_request_dict = qspmpolicymanagerv3_process_policy_dimention_records_request_instance.to_dict()
# create an instance of Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest from a dict
qspmpolicymanagerv3_process_policy_dimention_records_request_from_dict = Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.from_dict(qspmpolicymanagerv3_process_policy_dimention_records_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


