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
* AggregationDetailsObject gets additional information about aggregation.
*/
export class Healthcollectorv3AggregationDetailsObject {
    /**
    * Aggregation action error.
    */
    'aggregationActionError'?: string;
    /**
    * Aggregation health status.
    */
    'aggregationActionHealthStatus'?: number;
    /**
    * Aggregation type.
    */
    'aggregationType'?: string;
    /**
    * Error code for the aggregator.
    */
    'error'?: number;
    /**
    * Aggregator host name or IP address.
    */
    'unit'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "aggregationActionError",
            "baseName": "aggregation_action_error",
            "type": "string",
            "format": ""
        },
        {
            "name": "aggregationActionHealthStatus",
            "baseName": "aggregation_action_health_status",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "aggregationType",
            "baseName": "aggregation_type",
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
        return Healthcollectorv3AggregationDetailsObject.attributeTypeMap;
    }

    public constructor() {
    }
}

