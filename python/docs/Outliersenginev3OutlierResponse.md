# Outliersenginev3OutlierResponse

The response message and status for the GRDAPI.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Return message. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.outliersenginev3_outlier_response import Outliersenginev3OutlierResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3OutlierResponse from a JSON string
outliersenginev3_outlier_response_instance = Outliersenginev3OutlierResponse.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3OutlierResponse.to_json())

# convert the object into a dict
outliersenginev3_outlier_response_dict = outliersenginev3_outlier_response_instance.to_dict()
# create an instance of Outliersenginev3OutlierResponse from a dict
outliersenginev3_outlier_response_from_dict = Outliersenginev3OutlierResponse.from_dict(outliersenginev3_outlier_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


