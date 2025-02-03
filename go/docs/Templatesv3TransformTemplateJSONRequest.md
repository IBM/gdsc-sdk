# Templatesv3TransformTemplateJSONRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to **string** | Data used to transform the template. Data is in json string format. | [optional] 
**Integration** | Pointer to [**Templatesv3Integration**](Templatesv3Integration.md) |  | [optional] [default to UNDEFINED_INTEGRATION]
**MimeType** | Pointer to [**Templatesv3MIMEType**](Templatesv3MIMEType.md) |  | [optional] [default to PLAIN_TEXT]
**Origin** | Pointer to [**Templatesv3Origin**](Templatesv3Origin.md) |  | [optional] [default to UNDEFINED_ORIGIN]
**TemplateId** | Pointer to **string** | The ID of the template to be transformed. | [optional] 

## Methods

### NewTemplatesv3TransformTemplateJSONRequest

`func NewTemplatesv3TransformTemplateJSONRequest() *Templatesv3TransformTemplateJSONRequest`

NewTemplatesv3TransformTemplateJSONRequest instantiates a new Templatesv3TransformTemplateJSONRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTemplatesv3TransformTemplateJSONRequestWithDefaults

`func NewTemplatesv3TransformTemplateJSONRequestWithDefaults() *Templatesv3TransformTemplateJSONRequest`

NewTemplatesv3TransformTemplateJSONRequestWithDefaults instantiates a new Templatesv3TransformTemplateJSONRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *Templatesv3TransformTemplateJSONRequest) GetData() string`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *Templatesv3TransformTemplateJSONRequest) GetDataOk() (*string, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *Templatesv3TransformTemplateJSONRequest) SetData(v string)`

SetData sets Data field to given value.

### HasData

`func (o *Templatesv3TransformTemplateJSONRequest) HasData() bool`

HasData returns a boolean if a field has been set.

### GetIntegration

`func (o *Templatesv3TransformTemplateJSONRequest) GetIntegration() Templatesv3Integration`

GetIntegration returns the Integration field if non-nil, zero value otherwise.

### GetIntegrationOk

`func (o *Templatesv3TransformTemplateJSONRequest) GetIntegrationOk() (*Templatesv3Integration, bool)`

GetIntegrationOk returns a tuple with the Integration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntegration

`func (o *Templatesv3TransformTemplateJSONRequest) SetIntegration(v Templatesv3Integration)`

SetIntegration sets Integration field to given value.

### HasIntegration

`func (o *Templatesv3TransformTemplateJSONRequest) HasIntegration() bool`

HasIntegration returns a boolean if a field has been set.

### GetMimeType

`func (o *Templatesv3TransformTemplateJSONRequest) GetMimeType() Templatesv3MIMEType`

GetMimeType returns the MimeType field if non-nil, zero value otherwise.

### GetMimeTypeOk

`func (o *Templatesv3TransformTemplateJSONRequest) GetMimeTypeOk() (*Templatesv3MIMEType, bool)`

GetMimeTypeOk returns a tuple with the MimeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMimeType

`func (o *Templatesv3TransformTemplateJSONRequest) SetMimeType(v Templatesv3MIMEType)`

SetMimeType sets MimeType field to given value.

### HasMimeType

`func (o *Templatesv3TransformTemplateJSONRequest) HasMimeType() bool`

HasMimeType returns a boolean if a field has been set.

### GetOrigin

`func (o *Templatesv3TransformTemplateJSONRequest) GetOrigin() Templatesv3Origin`

GetOrigin returns the Origin field if non-nil, zero value otherwise.

### GetOriginOk

`func (o *Templatesv3TransformTemplateJSONRequest) GetOriginOk() (*Templatesv3Origin, bool)`

GetOriginOk returns a tuple with the Origin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrigin

`func (o *Templatesv3TransformTemplateJSONRequest) SetOrigin(v Templatesv3Origin)`

SetOrigin sets Origin field to given value.

### HasOrigin

`func (o *Templatesv3TransformTemplateJSONRequest) HasOrigin() bool`

HasOrigin returns a boolean if a field has been set.

### GetTemplateId

`func (o *Templatesv3TransformTemplateJSONRequest) GetTemplateId() string`

GetTemplateId returns the TemplateId field if non-nil, zero value otherwise.

### GetTemplateIdOk

`func (o *Templatesv3TransformTemplateJSONRequest) GetTemplateIdOk() (*string, bool)`

GetTemplateIdOk returns a tuple with the TemplateId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateId

`func (o *Templatesv3TransformTemplateJSONRequest) SetTemplateId(v string)`

SetTemplateId sets TemplateId field to given value.

### HasTemplateId

`func (o *Templatesv3TransformTemplateJSONRequest) HasTemplateId() bool`

HasTemplateId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


