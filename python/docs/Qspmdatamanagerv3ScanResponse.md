# Qspmdatamanagerv3ScanResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plugin_id** | **str** |  | [optional] 
**scan_cbom_id** | **str** |  | [optional] 
**scan_data_ts** | **datetime** |  | [optional] 
**scan_data_update_ts** | **datetime** |  | [optional] 
**scan_desc** | **str** |  | [optional] 
**scan_failure_message** | **str** |  | [optional] 
**scan_id** | **str** |  | [optional] 
**scan_percentage_completion** | **str** |  | [optional] 
**scan_reg_ts** | **datetime** |  | [optional] 
**scan_status** | **str** |  | [optional] 
**scan_type** | **str** |  | [optional] 
**user_email** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_scan_response import Qspmdatamanagerv3ScanResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmdatamanagerv3ScanResponse from a JSON string
qspmdatamanagerv3_scan_response_instance = Qspmdatamanagerv3ScanResponse.from_json(json)
# print the JSON string representation of the object
print(Qspmdatamanagerv3ScanResponse.to_json())

# convert the object into a dict
qspmdatamanagerv3_scan_response_dict = qspmdatamanagerv3_scan_response_instance.to_dict()
# create an instance of Qspmdatamanagerv3ScanResponse from a dict
qspmdatamanagerv3_scan_response_from_dict = Qspmdatamanagerv3ScanResponse.from_dict(qspmdatamanagerv3_scan_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


