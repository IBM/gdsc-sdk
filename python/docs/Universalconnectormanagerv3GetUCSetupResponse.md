# Universalconnectormanagerv3GetUCSetupResponse

GetUCSetupResponse is the response object for getting the UC parameters of a specific Universal Connector.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**binaries** | [**List[Universalconnectormanagerv3File]**](Universalconnectormanagerv3File.md) | Binaries files (zip,rpm,jar, base64 encoded). | [optional] 
**certificates** | **Dict[str, str]** | Map of certificates (key is the name, value is the value itself). | [optional] 
**configurations** | [**List[Universalconnectormanagerv3File]**](Universalconnectormanagerv3File.md) | Configuration files for pipeline. | [optional] 
**credentials** | **Dict[str, str]** | Map of credentials (key is the name, value is the value itself). | [optional] 
**offline_packages** | [**List[Universalconnectormanagerv3File]**](Universalconnectormanagerv3File.md) |  | [optional] 
**pipeline_type** | **str** | Type of the pipeline (pull or push). | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_get_uc_setup_response import Universalconnectormanagerv3GetUCSetupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3GetUCSetupResponse from a JSON string
universalconnectormanagerv3_get_uc_setup_response_instance = Universalconnectormanagerv3GetUCSetupResponse.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3GetUCSetupResponse.to_json())

# convert the object into a dict
universalconnectormanagerv3_get_uc_setup_response_dict = universalconnectormanagerv3_get_uc_setup_response_instance.to_dict()
# create an instance of Universalconnectormanagerv3GetUCSetupResponse from a dict
universalconnectormanagerv3_get_uc_setup_response_from_dict = Universalconnectormanagerv3GetUCSetupResponse.from_dict(universalconnectormanagerv3_get_uc_setup_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


