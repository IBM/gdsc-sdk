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

export class Reportsrunnerv3ActiveQuery {
    'canStop'?: boolean;
    'detail'?: string;
    'elapsedTime'?: number;
    'name'?: string;
    'queryId'?: string;
    'startTime'?: Date;
    'status'?: string;
    'type'?: string;
    'user'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "canStop",
            "baseName": "can_stop",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "detail",
            "baseName": "detail",
            "type": "string",
            "format": ""
        },
        {
            "name": "elapsedTime",
            "baseName": "elapsed_time",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "queryId",
            "baseName": "query_id",
            "type": "string",
            "format": "uint64"
        },
        {
            "name": "startTime",
            "baseName": "start_time",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string",
            "format": ""
        },
        {
            "name": "user",
            "baseName": "user",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsrunnerv3ActiveQuery.attributeTypeMap;
    }

    public constructor() {
    }
}

