# IBM Guardium Data Security Center Typescript client

This SDK provides convenient access to the IBM Guardium Data Security Center API from TypeScript or JavaScript.

It is generated from the OpenAPI specification with OpenAPI code generator.

To learn how to use the SDK, check out our [Examples](https://github.com/IBM/gdsc-sdk/tree/release-v3.6.1/sdk-example/typescript/src).

## Requirements

- LTS versions of node.js

## Prerequisites

IBM Guardium Data Secruity center must be running. You need to get a API key or userID and password from there.

## Installation

```shell
npm install @ibm-gdsc/ibm-gdsc-sdk-software
```

### Usage

The full API of this library can be found in [sdk.md file](https://github.com/IBM/gdsc-sdk/blob/release-v3.6.1/typescript/sdk.md) along with many code [examples](https://github.com/IBM/gdsc-sdk/tree/REPLACE_VERSION_NUMBER/sdk-example/typescript/src). The code below shows how to get started using the JumboxServiceGetUsers.

```
import { AuthMethodsConfiguration, ServerConfiguration, Middleware, RequestContext, ResponseContext, createConfiguration, JumpboxServiceApi} from '@ibm-gdsc/ibm-gdsc-sdk-software';

// Go to the Guardium Security Center website and create an API key , copy the one start with "Basic" and then export here:
// export API_KEY="YOUR_API_KEY"
// Set the URL of your server as environment variable
//export URL=https://test.ibm.com:8443

const authConfig: AuthMethodsConfiguration = {
    'ApiKeyAuth': process.env.API_KEY
}

const url = process.env.URL ?? 'https://localhost:8443'
const variableConfiguration = {}
const serverConfig = new ServerConfiguration(url, variableConfiguration)
process.env.NODE_TLS_REJECT_UNAUTHORIZED = '0'

class Test implements Middleware {
    pre(context: RequestContext): Promise<RequestContext> {
        // Modify context here and return
        return Promise.resolve(context);
    }

    post(context: ResponseContext): Promise<ResponseContext> {
        return Promise.resolve(context);
    }

}

// Create configuration parameter object
const configurationParameters = {
    httpApi: undefined, // Can also be ignored - default is usually fine
    baseServer: serverConfig, // First server is default
    authMethods: authConfig, // No auth is default
    promiseMiddleware: [new Test()],
}

// Convert to actual configuration
const config = createConfiguration(configurationParameters);


// Use configuration 
const apiInstance = new JumpboxServiceApi(config)

const getUsers = async () => {
    const response = await apiInstance.jumpboxServiceGetUsers();
    console.log('API called successfully. Returned data: ' + JSON.stringify(response));
  
}

getUsers();
```