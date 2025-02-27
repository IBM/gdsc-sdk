

# Templatesv3Template

The contents of a specific template.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** | Content of the message with field substitution sequences. |  [optional] |
|**defaultRecipient** | [**Templatesv3SimpleRecipient**](Templatesv3SimpleRecipient.md) |  |  [optional] |
|**integration** | **Templatesv3Integration** |  |  [optional] |
|**integrationId** | **String** | Integration ID specifies the specific integration this template is associated. |  [optional] |
|**integrationName** | **String** | Name associated with the integration; optionally added based on need and performance. |  [optional] |
|**isDefault** | **Boolean** | Specifies the default template for the associated data source. |  [optional] |
|**isEnabled** | **Boolean** | Enabled defines the set of templates that are actively used. |  [optional] |
|**mimeType** | **Templatesv3MIMEType** |  |  [optional] |
|**name** | **String** | User friendly name associated with the template. |  [optional] |
|**order** | **Integer** | Order by most significant origin. |  [optional] |
|**origin** | **Templatesv3Origin** |  |  [optional] |
|**tags** | **List&lt;String&gt;** | User defined tags that can be used to filter templates. |  [optional] |
|**templateId** | **String** | Template unique ID. |  [optional] |
|**title** | **String** | Title is a brief summary of the data; may be empty based on integration type. |  [optional] |



