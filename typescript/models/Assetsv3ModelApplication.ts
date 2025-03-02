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

export class Assetsv3ModelApplication {
    'applicationName'?: string;
    'lastUsed'?: string;
    'serviceType'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "applicationName",
            "baseName": "application_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "lastUsed",
            "baseName": "last_used",
            "type": "string",
            "format": ""
        },
        {
            "name": "serviceType",
            "baseName": "service_type",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3ModelApplication.attributeTypeMap;
    }

    public constructor() {
    }
}

