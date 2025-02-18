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

import { Vendor } from '../models/Vendor';
import { HttpFile } from '../http/http';

export class LinkedVendor {
    'vendor': Vendor;
    'totalAccounts': number;
    'isSensitive': boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "vendor",
            "baseName": "vendor",
            "type": "Vendor",
            "format": ""
        },
        {
            "name": "totalAccounts",
            "baseName": "totalAccounts",
            "type": "number",
            "format": ""
        },
        {
            "name": "isSensitive",
            "baseName": "isSensitive",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return LinkedVendor.attributeTypeMap;
    }

    public constructor() {
    }
}

