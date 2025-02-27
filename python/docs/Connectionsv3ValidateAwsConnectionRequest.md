# Connectionsv3ValidateAwsConnectionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_key** | **str** |  | [optional] 
**group_name** | **str** |  | [optional] 
**input_plugin_type** | **str** | aws connection input type as Cloudwatch, SQS, ... | [optional] 
**log_stream** | **str** |  | [optional] 
**queue_url** | **str** |  | [optional] 
**region** | **str** |  | [optional] 
**secret_key** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_validate_aws_connection_request import Connectionsv3ValidateAwsConnectionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3ValidateAwsConnectionRequest from a JSON string
connectionsv3_validate_aws_connection_request_instance = Connectionsv3ValidateAwsConnectionRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3ValidateAwsConnectionRequest.to_json())

# convert the object into a dict
connectionsv3_validate_aws_connection_request_dict = connectionsv3_validate_aws_connection_request_instance.to_dict()
# create an instance of Connectionsv3ValidateAwsConnectionRequest from a dict
connectionsv3_validate_aws_connection_request_from_dict = Connectionsv3ValidateAwsConnectionRequest.from_dict(connectionsv3_validate_aws_connection_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


