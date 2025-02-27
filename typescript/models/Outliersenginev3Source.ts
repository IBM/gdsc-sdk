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

export class Outliersenginev3Source {
    'databaseName'?: string;
    'dbUser'?: string;
    'serverIp'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "databaseName",
            "baseName": "database_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "dbUser",
            "baseName": "db_user",
            "type": "string",
            "format": ""
        },
        {
            "name": "serverIp",
            "baseName": "server_ip",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Outliersenginev3Source.attributeTypeMap;
    }

    public constructor() {
    }
}

