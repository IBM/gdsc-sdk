/*
IBM Guardium Data Security Center

Testing TemplatesServiceAPIService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package guardiumsdkgo

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func Test_guardiumsdkgo_TemplatesServiceAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test TemplatesServiceAPIService TemplatesServiceCreateIntegration", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.TemplatesServiceAPI.TemplatesServiceCreateIntegration(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TemplatesServiceAPIService TemplatesServiceCreateTemplate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.TemplatesServiceAPI.TemplatesServiceCreateTemplate(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TemplatesServiceAPIService TemplatesServiceDeleteIntegration", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var integrationId string

		resp, httpRes, err := apiClient.TemplatesServiceAPI.TemplatesServiceDeleteIntegration(context.Background(), integrationId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TemplatesServiceAPIService TemplatesServiceDeleteTemplate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var templateId string

		resp, httpRes, err := apiClient.TemplatesServiceAPI.TemplatesServiceDeleteTemplate(context.Background(), templateId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TemplatesServiceAPIService TemplatesServiceGetOriginDefaultContent", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var origin string

		resp, httpRes, err := apiClient.TemplatesServiceAPI.TemplatesServiceGetOriginDefaultContent(context.Background(), origin).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TemplatesServiceAPIService TemplatesServiceGetOriginFields", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var origin string

		resp, httpRes, err := apiClient.TemplatesServiceAPI.TemplatesServiceGetOriginFields(context.Background(), origin).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TemplatesServiceAPIService TemplatesServiceGetTemplate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var templateId string

		resp, httpRes, err := apiClient.TemplatesServiceAPI.TemplatesServiceGetTemplate(context.Background(), templateId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TemplatesServiceAPIService TemplatesServiceGetTemplates", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.TemplatesServiceAPI.TemplatesServiceGetTemplates(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TemplatesServiceAPIService TemplatesServiceTestTemplate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.TemplatesServiceAPI.TemplatesServiceTestTemplate(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TemplatesServiceAPIService TemplatesServiceTransformTemplate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.TemplatesServiceAPI.TemplatesServiceTransformTemplate(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TemplatesServiceAPIService TemplatesServiceTransformTemplateJSON", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.TemplatesServiceAPI.TemplatesServiceTransformTemplateJSON(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TemplatesServiceAPIService TemplatesServiceUpdateTemplate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var templateId string

		resp, httpRes, err := apiClient.TemplatesServiceAPI.TemplatesServiceUpdateTemplate(context.Background(), templateId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
