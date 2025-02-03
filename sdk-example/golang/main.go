package main

// Load required packages
import (
	"context"

	guardiumsdkgo "github.ibm.com/Activity-Insights/guardium-sdk/go"
)

func main() {

	auth := context.WithValue(
		context.Background(),
		guardiumsdkgo.ContextAPIKeys,
		map[string]guardiumsdkgo.APIKey{
			"authorization": {Key: "Basic NDcwMzBhMGUtNmRjMi00OTNiLTkzNGMtOTgxOWQxNTE0NzA3OmVlYjBhNDE2LTA0YWYtNDJiOS1iNjBkLTdlNjViNjE5MjQ3MQ=="},
		},
	)
	r, err := client.Service.Operation(auth, args)
}
