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

/**
* DMExtractionLogsRequest request object.
*/
export class Datamartprocessorv3DMExtractionLogsRequest {
    /**
    * Report data.
    */
    'data'?: string;
    /**
    * Request id which co-relates to request.
    */
    'requestId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "string",
            "format": ""
        },
        {
            "name": "requestId",
            "baseName": "request_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Datamartprocessorv3DMExtractionLogsRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

