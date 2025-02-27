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

import { DataResource } from '../models/DataResource';
import { HttpFile } from '../http/http';

export class ListDataResources200Response {
    'results'?: Array<DataResource>;
    'nextToken'?: string | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "results",
            "baseName": "results",
            "type": "Array<DataResource>",
            "format": ""
        },
        {
            "name": "nextToken",
            "baseName": "nextToken",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ListDataResources200Response.attributeTypeMap;
    }

    public constructor() {
    }
}

