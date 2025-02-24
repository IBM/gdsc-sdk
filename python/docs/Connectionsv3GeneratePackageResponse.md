# Connectionsv3GeneratePackageResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gdp_package_link** | **str** |  | [optional] 
**gi_package_link** | **str** |  | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_generate_package_response import Connectionsv3GeneratePackageResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GeneratePackageResponse from a JSON string
connectionsv3_generate_package_response_instance = Connectionsv3GeneratePackageResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GeneratePackageResponse.to_json())

# convert the object into a dict
connectionsv3_generate_package_response_dict = connectionsv3_generate_package_response_instance.to_dict()
# create an instance of Connectionsv3GeneratePackageResponse from a dict
connectionsv3_generate_package_response_from_dict = Connectionsv3GeneratePackageResponse.from_dict(connectionsv3_generate_package_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


