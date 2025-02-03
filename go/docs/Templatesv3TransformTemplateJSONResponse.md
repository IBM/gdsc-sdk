# Templatesv3TransformTemplateJSONResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | Pointer to **string** | Content is a fully formatted transformation of the template content based on supplied data; empty string on error. | [optional] 
**Status** | Pointer to [**RpcStatus**](RpcStatus.md) |  | [optional] 
**Title** | Pointer to **string** | Title is a fully formatted transformation of the template title based on supplied data; empty string on error. | [optional] 

## Methods

### NewTemplatesv3TransformTemplateJSONResponse

`func NewTemplatesv3TransformTemplateJSONResponse() *Templatesv3TransformTemplateJSONResponse`

NewTemplatesv3TransformTemplateJSONResponse instantiates a new Templatesv3TransformTemplateJSONResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTemplatesv3TransformTemplateJSONResponseWithDefaults

`func NewTemplatesv3TransformTemplateJSONResponseWithDefaults() *Templatesv3TransformTemplateJSONResponse`

NewTemplatesv3TransformTemplateJSONResponseWithDefaults instantiates a new Templatesv3TransformTemplateJSONResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *Templatesv3TransformTemplateJSONResponse) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *Templatesv3TransformTemplateJSONResponse) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *Templatesv3TransformTemplateJSONResponse) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *Templatesv3TransformTemplateJSONResponse) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetStatus

`func (o *Templatesv3TransformTemplateJSONResponse) GetStatus() RpcStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Templatesv3TransformTemplateJSONResponse) GetStatusOk() (*RpcStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Templatesv3TransformTemplateJSONResponse) SetStatus(v RpcStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Templatesv3TransformTemplateJSONResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTitle

`func (o *Templatesv3TransformTemplateJSONResponse) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *Templatesv3TransformTemplateJSONResponse) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *Templatesv3TransformTemplateJSONResponse) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *Templatesv3TransformTemplateJSONResponse) HasTitle() bool`

HasTitle returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


