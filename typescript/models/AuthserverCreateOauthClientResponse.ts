/**
 * IBM Guardium Data Security Center
 * Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { AuthserverOauthClient } from '../models/AuthserverOauthClient';
import { HttpFile } from '../http/http';

/**
* Response parameters for create oauth client.
*/
export class AuthserverCreateOauthClientResponse {
    'oauthClient'?: AuthserverOauthClient;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "oauthClient",
            "baseName": "oauth_client",
            "type": "AuthserverOauthClient",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AuthserverCreateOauthClientResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

