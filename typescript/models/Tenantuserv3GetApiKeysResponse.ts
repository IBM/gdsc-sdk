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

import { Tenantuserv3Apikey } from '../models/Tenantuserv3Apikey';
import { HttpFile } from '../http/http';

/**
* GetApiKeysResponse message for Get APIKeys api.
*/
export class Tenantuserv3GetApiKeysResponse {
    'apikeys'?: Array<Tenantuserv3Apikey>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "apikeys",
            "baseName": "apikeys",
            "type": "Array<Tenantuserv3Apikey>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Tenantuserv3GetApiKeysResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

