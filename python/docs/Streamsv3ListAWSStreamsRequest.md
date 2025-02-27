# Streamsv3ListAWSStreamsRequest

ListAWSStreamsRequest defines a request to list AWS Kinesis streams.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_key_id** | **str** | AWS access key ID. | [optional] 
**auth_type** | [**Streamsv3AuthType**](Streamsv3AuthType.md) |  | [optional] 
**id** | **str** | Identifier. | [optional] 
**region** | **List[str]** | AWS region. | [optional] 
**role_arn** | **str** | IAM role ARN. | [optional] 
**secret_key_id** | **str** | AWS secret key ID. | [optional] 
**stream_type** | [**Streamsv3StreamType**](Streamsv3StreamType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.streamsv3_list_aws_streams_request import Streamsv3ListAWSStreamsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Streamsv3ListAWSStreamsRequest from a JSON string
streamsv3_list_aws_streams_request_instance = Streamsv3ListAWSStreamsRequest.from_json(json)
# print the JSON string representation of the object
print(Streamsv3ListAWSStreamsRequest.to_json())

# convert the object into a dict
streamsv3_list_aws_streams_request_dict = streamsv3_list_aws_streams_request_instance.to_dict()
# create an instance of Streamsv3ListAWSStreamsRequest from a dict
streamsv3_list_aws_streams_request_from_dict = Streamsv3ListAWSStreamsRequest.from_dict(streamsv3_list_aws_streams_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


