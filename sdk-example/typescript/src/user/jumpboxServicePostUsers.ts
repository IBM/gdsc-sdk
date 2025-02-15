import { AuthMethodsConfiguration, ServerConfiguration, Middleware, RequestContext, ResponseContext, createConfiguration, JumpboxServiceApi, Jumpboxv3PostUsersBulkRequest, Jumpboxv3User } from '@ibm-gdsc/ibm-gdsc-sdk-software';

// Covers all auth methods included in your OpenAPI yaml definition
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

// Implements a simple middleware to modify requests before (`pre`) they are sent
// and after (`post`) they have been received 
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
const apiInstance = new JumpboxServiceApi(config);
 
const user: Jumpboxv3User = {
    distinguishedName: 'uid=2J9097897,c=us,ou=bluepages,o=ibm.com',
    roles: ['admin', 'default'],
}

const request:Jumpboxv3PostUsersBulkRequest = {
    users: [ user], 
} 

const postUsers = async (request: Jumpboxv3PostUsersBulkRequest) => {
    const response = await apiInstance.jumpboxServicePostUsers(request);
    console.log('API called successfully. Returned data: ' + JSON.stringify(response));
  
}

postUsers(request);