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
* Information about aggregation.
*/
export class Guardiumconnectorv3AggregationViewListObject {
    /**
    * Aggregation action error.
    */
    'aggActionError'?: string;
    /**
    * Aggregation health status.
    */
    'aggActionHealthStatus'?: number;
    /**
    * Aggregation type.
    */
    'aggType'?: string;
    /**
    * Error code.
    */
    'error'?: number;
    /**
    * Aggregator host name or IP address.
    */
    'unit'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "aggActionError",
            "baseName": "agg_action_error",
            "type": "string",
            "format": ""
        },
        {
            "name": "aggActionHealthStatus",
            "baseName": "agg_action_health_status",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "aggType",
            "baseName": "agg_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "error",
            "baseName": "error",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "unit",
            "baseName": "unit",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Guardiumconnectorv3AggregationViewListObject.attributeTypeMap;
    }

    public constructor() {
    }
}

