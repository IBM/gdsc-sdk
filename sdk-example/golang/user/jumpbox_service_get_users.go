package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	//Defining the host is optional and defaults to http://localhost
	os.Setenv("HTTP_PROXY",  "https://insightsdev11.fyre.ibm.com")
	os.Setenv("API_KEY_AUTH", "Basic NDcwMzBhMGUtNmRjMi00OTNiLTkzNGMtOTgxOWQxNTE0NzA3OmVlYjBhNDE2LTA0YWYtNDJiOS1iNjBkLTdlNjViNjE5MjQ3MQ==")
	
	configuration := openapiclient.NewConfiguration()
	configuration.Host = os.Getenv("HTTP_PROXY")
	apiKeyAuth := os.Getenv("API_KEY_AUTH")
    // header := map[string]string{
	// 	"Accept":       "application/json",
	// 	"Content-Type": "application/json",
	// 	"Authorization": apiKeyAuth,
	// }

	configuration.AddDefaultHeader("Authorization", apiKeyAuth)
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.JumpboxServiceAPI.JumpboxServiceGetUsers(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `JumpboxServiceAPI.JumpboxServiceGetUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `JumpboxServiceGetUsers`: Jumpboxv3GetUsersResponse
	fmt.Fprintf(os.Stdout, "Response from `JumpboxServiceAPI.JumpboxServiceGetUsers`: %v\n", resp)
    // configuration.verify_ssl = False
}