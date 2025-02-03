# Templatesv3Template

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | **string** | Content of the message with field substitution sequences. | [optional] [default to null]
**DefaultRecipient** | [***Templatesv3SimpleRecipient**](templatesv3SimpleRecipient.md) |  | [optional] [default to null]
**Integration** | [***Templatesv3Integration**](templatesv3Integration.md) |  | [optional] [default to null]
**IntegrationId** | **string** | Integration ID specifies the specific integration this template is associated. | [optional] [default to null]
**IntegrationName** | **string** | Name associated with the integration; optionally added based on need and performance. | [optional] [default to null]
**IsDefault** | **bool** | Specifies the default template for the associated data source. | [optional] [default to null]
**IsEnabled** | **bool** | Enabled defines the set of templates that are actively used. | [optional] [default to null]
**MimeType** | [***Templatesv3MimeType**](templatesv3MIMEType.md) |  | [optional] [default to null]
**Name** | **string** | User friendly name associated with the template. | [optional] [default to null]
**Order** | **int32** | Order by most significant origin. | [optional] [default to null]
**Origin** | [***Templatesv3Origin**](templatesv3Origin.md) |  | [optional] [default to null]
**Tags** | **[]string** | User defined tags that can be used to filter templates. | [optional] [default to null]
**TemplateId** | **string** | Template unique ID. | [optional] [default to null]
**Title** | **string** | Title is a brief summary of the data; may be empty based on integration type. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

