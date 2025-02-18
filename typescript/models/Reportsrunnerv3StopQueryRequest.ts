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
* StopQueryRequest is the argument type of the StopQuery API.
*/
export class Reportsrunnerv3StopQueryRequest {
    /**
    * Token that identifies the query.
    */
    'queryIds'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "queryIds",
            "baseName": "query_ids",
            "type": "Array<string>",
            "format": "uint64"
        }    ];

    static getAttributeTypeMap() {
        return Reportsrunnerv3StopQueryRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

