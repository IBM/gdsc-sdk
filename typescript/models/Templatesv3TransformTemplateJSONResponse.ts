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
import { HttpFile } from '../http/http';

/**
* Returns the results of the template databeing transformed or empty string (with error) when not able to process.
*/
export class Templatesv3TransformTemplateJSONResponse {
    /**
    * Content is a fully formatted transformation of the template content based on supplied data; empty string on error.
    */
    'content'?: string;
    'status'?: RpcStatus;
    /**
    * Title is a fully formatted transformation of the template title based on supplied data; empty string on error.
    */
    'title'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "content",
            "baseName": "content",
            "type": "string",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "RpcStatus",
            "format": ""
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Templatesv3TransformTemplateJSONResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

