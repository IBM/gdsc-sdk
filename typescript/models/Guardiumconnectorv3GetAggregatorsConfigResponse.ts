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

import { Guardiumconnectorv3AggregatorConfig } from '../models/Guardiumconnectorv3AggregatorConfig';
import { HttpFile } from '../http/http';

export class Guardiumconnectorv3GetAggregatorsConfigResponse {
    /**
    * List of aggregator configurations from tenant database.
    */
    'managedUnitsConfig'?: Array<Guardiumconnectorv3AggregatorConfig>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "managedUnitsConfig",
            "baseName": "managed_units_config",
            "type": "Array<Guardiumconnectorv3AggregatorConfig>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Guardiumconnectorv3GetAggregatorsConfigResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

