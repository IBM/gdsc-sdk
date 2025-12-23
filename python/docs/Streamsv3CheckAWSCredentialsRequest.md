# Streamsv3CheckAWSCredentialsRequest

CheckAWSCredentialsRequest defines a request to verify AWS credentials.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_key_id** | **str** | AWS access key ID. | [optional] 
**auth_type** | [**Streamsv3AuthType**](Streamsv3AuthType.md) |  | [optional] [default to Streamsv3AuthType.SECURITY_CREDENTIALS]
**id** | **str** | Indetifier. | [optional] 
**region** | **str** | AWS region. | [optional] 
**role_arn** | **str** | IAM role ARN. | [optional] 
**secret_key_id** | **str** | AWS secret key ID. | [optional] 
**stream_name** | **str** | Name of stream. | [optional] 
**stream_type** | [**Streamsv3StreamType**](Streamsv3StreamType.md) |  | [optional] [default to Streamsv3StreamType.AWS_KINESIS]

## Example

```python
from ibm_gdsc_sdk_saas.models.streamsv3_check_aws_credentials_request import Streamsv3CheckAWSCredentialsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Streamsv3CheckAWSCredentialsRequest from a JSON string
streamsv3_check_aws_credentials_request_instance = Streamsv3CheckAWSCredentialsRequest.from_json(json)
# print the JSON string representation of the object
print(Streamsv3CheckAWSCredentialsRequest.to_json())

# convert the object into a dict
streamsv3_check_aws_credentials_request_dict = streamsv3_check_aws_credentials_request_instance.to_dict()
# create an instance of Streamsv3CheckAWSCredentialsRequest from a dict
streamsv3_check_aws_credentials_request_from_dict = Streamsv3CheckAWSCredentialsRequest.from_dict(streamsv3_check_aws_credentials_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


