

# Templatesv3TransformTemplateRequest

Transforms a template into a fully resolved version with data substitution.  The template is defined by the specified  template id or is dynamically located base on the supplied Integration, Origin and MIMEType.  The data supplied  must match the substitution fields associated with the evaluated template.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **Map&lt;String, String&gt;** | Data used to transform the template. |  [optional] |
|**integration** | **Templatesv3Integration** |  |  [optional] |
|**mimeType** | **Templatesv3MIMEType** |  |  [optional] |
|**origin** | **Templatesv3Origin** |  |  [optional] |
|**templateId** | **String** | The ID of the template to be transformed. |  [optional] |



