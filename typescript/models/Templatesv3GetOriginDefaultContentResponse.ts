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

import { RpcStatus } from '../models/RpcStatus';
import { Templatesv3DefaultContent } from '../models/Templatesv3DefaultContent';
import { HttpFile } from '../http/http';

/**
* The default template content for the specified origin.
*/
export class Templatesv3GetOriginDefaultContentResponse {
    /**
    * Default contents associated with the origin and MIME type specified; empty string not available.
    */
    'defaultContents'?: Array<Templatesv3DefaultContent>;
    'status'?: RpcStatus;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "defaultContents",
            "baseName": "default_contents",
            "type": "Array<Templatesv3DefaultContent>",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "RpcStatus",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Templatesv3GetOriginDefaultContentResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

