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

export class GetJiraIntegrationParameters200Response {
    'companyDomainName': string;
    'issueType'?: string;
    'projectId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "companyDomainName",
            "baseName": "companyDomainName",
            "type": "string",
            "format": ""
        },
        {
            "name": "issueType",
            "baseName": "issueType",
            "type": "string",
            "format": ""
        },
        {
            "name": "projectId",
            "baseName": "projectId",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return GetJiraIntegrationParameters200Response.attributeTypeMap;
    }

    public constructor() {
    }
}

