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

import { AddCloudAccountsRequestCloudAccountsInner } from '../models/AddCloudAccountsRequestCloudAccountsInner';
import { CloudServiceProvider } from '../models/CloudServiceProvider';
import { HttpFile } from '../http/http';

export class AddCloudAccountsRequest {
    'cloudProvider': CloudServiceProvider;
    'cloudAccounts': Array<AddCloudAccountsRequestCloudAccountsInner>;
    'mainAccountId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "cloudProvider",
            "baseName": "cloudProvider",
            "type": "CloudServiceProvider",
            "format": ""
        },
        {
            "name": "cloudAccounts",
            "baseName": "cloudAccounts",
            "type": "Array<AddCloudAccountsRequestCloudAccountsInner>",
            "format": ""
        },
        {
            "name": "mainAccountId",
            "baseName": "mainAccountId",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AddCloudAccountsRequest.attributeTypeMap;
    }

    public constructor() {
    }
}



