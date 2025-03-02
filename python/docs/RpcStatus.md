# RpcStatus

- Simple to use and understand for most users - Flexible enough to meet unexpected needs  # Overview  The `Status` message contains three pieces of data: error code, error message, and error details. The error code should be an enum value of [google.rpc.Code][google.rpc.Code], but it may accept additional error codes if needed.  The error message should be a developer-facing English message that helps developers *understand* and *resolve* the error. If a localized user-facing error message is needed, put the localized message in the error details or localize it in the client. The optional error details may contain arbitrary information about the error. There is a predefined set of error detail types in the package `google.rpc` that can be used for common error conditions.  # Language mapping  The `Status` message is the logical representation of the error model, but it is not necessarily the actual wire format. When the `Status` message is exposed in different client libraries and different wire protocols, it can be mapped differently. For example, it will likely be mapped to some exceptions in Java, but more likely mapped to some error codes in C.  # Other uses  The error model and the `Status` message can be used in a variety of environments, either with or without APIs, to provide a consistent developer experience across different environments.  Example uses of this error model include:  - Partial errors. If a service needs to return partial errors to the client,     it may embed the `Status` in the normal response to indicate the partial     errors.  - Workflow errors. A typical workflow has multiple steps. Each step may     have a `Status` message for error reporting.  - Batch operations. If a client uses batch request and batch response, the     `Status` message should be used directly inside batch response, one for     each error sub-response.  - Asynchronous operations. If an API call embeds asynchronous operation     results in its response, the status of those operations should be     represented directly using the `Status` message.  - Logging. If some API errors are stored in logs, the message `Status` could     be used directly after any stripping needed for security/privacy reasons.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** | The status code, which should be an enum value of [google.rpc.Code][google.rpc.Code]. | [optional] 
**details** | [**List[ProtobufAny]**](ProtobufAny.md) | A list of messages that carry the error details.  There is a common set of message types for APIs to use. | [optional] 
**message** | **str** | A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the [google.rpc.Status.details][google.rpc.Status.details] field, or localized by the client. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.rpc_status import RpcStatus

# TODO update the JSON string below
json = "{}"
# create an instance of RpcStatus from a JSON string
rpc_status_instance = RpcStatus.from_json(json)
# print the JSON string representation of the object
print(RpcStatus.to_json())

# convert the object into a dict
rpc_status_dict = rpc_status_instance.to_dict()
# create an instance of RpcStatus from a dict
rpc_status_from_dict = RpcStatus.from_dict(rpc_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


