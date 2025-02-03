/*
IBM Guardium Data Security Center

Testing AuthServerServiceAPIService

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

func Test_guardiumsdkgo_AuthServerServiceAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test AuthServerServiceAPIService AuthServerServiceCreateOauthClient", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.AuthServerServiceAPI.AuthServerServiceCreateOauthClient(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AuthServerServiceAPIService AuthServerServiceDeleteOauthClient", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var clientId string

		resp, httpRes, err := apiClient.AuthServerServiceAPI.AuthServerServiceDeleteOauthClient(context.Background(), clientId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AuthServerServiceAPIService AuthServerServiceGetAccessToken", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.AuthServerServiceAPI.AuthServerServiceGetAccessToken(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AuthServerServiceAPIService AuthServerServiceGetOauthClient", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var clientId string

		resp, httpRes, err := apiClient.AuthServerServiceAPI.AuthServerServiceGetOauthClient(context.Background(), clientId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AuthServerServiceAPIService AuthServerServiceGetUser", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.AuthServerServiceAPI.AuthServerServiceGetUser(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test AuthServerServiceAPIService AuthServerServiceListOauthClient", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.AuthServerServiceAPI.AuthServerServiceListOauthClient(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
