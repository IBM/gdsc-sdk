# Streamsv3CheckAWSCredentialsResponse

CheckAWSCredentialsResponse defines response of CheckAWSCredentialsRequest call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Streamsv3AWSCheckStreamStatus**](Streamsv3AWSCheckStreamStatus.md) |  | [optional] [default to Streamsv3AWSCheckStreamStatus.STREAM_OK]

## Example

```python
from ibm_gdsc_sdk_saas.models.streamsv3_check_aws_credentials_response import Streamsv3CheckAWSCredentialsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Streamsv3CheckAWSCredentialsResponse from a JSON string
streamsv3_check_aws_credentials_response_instance = Streamsv3CheckAWSCredentialsResponse.from_json(json)
# print the JSON string representation of the object
print(Streamsv3CheckAWSCredentialsResponse.to_json())

# convert the object into a dict
streamsv3_check_aws_credentials_response_dict = streamsv3_check_aws_credentials_response_instance.to_dict()
# create an instance of Streamsv3CheckAWSCredentialsResponse from a dict
streamsv3_check_aws_credentials_response_from_dict = Streamsv3CheckAWSCredentialsResponse.from_dict(streamsv3_check_aws_credentials_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


