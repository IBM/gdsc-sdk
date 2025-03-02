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

import { Environment } from '../models/Environment';
import { HttpFile } from '../http/http';

export class AddCloudAccountsRequestCloudAccountsInner {
    'cloudAccountId': string;
    'cloudAccountName': string;
    'environment'?: Environment;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "cloudAccountId",
            "baseName": "cloudAccountId",
            "type": "string",
            "format": ""
        },
        {
            "name": "cloudAccountName",
            "baseName": "cloudAccountName",
            "type": "string",
            "format": ""
        },
        {
            "name": "environment",
            "baseName": "environment",
            "type": "Environment",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AddCloudAccountsRequestCloudAccountsInner.attributeTypeMap;
    }

    public constructor() {
    }
}



