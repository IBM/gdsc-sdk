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

import { HttpFile } from '../http/http';

export class Resourcecontrollerk8v3CreateControllerRequest {
    /**
    * Optional: The description of the controller.
    */
    'description'?: string;
    /**
    * The name of the controller.
    */
    'name'?: string;
    'tenantId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "tenantId",
            "baseName": "tenant_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Resourcecontrollerk8v3CreateControllerRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

