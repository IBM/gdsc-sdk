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
* Collector configuration.
*/
export class Guardiumconnectorv3CollectorConfig {
    /**
    * Datamart start date.
    */
    'datamartStartDateCollector'?: string;
    /**
    * Hostname of collector.
    */
    'host'?: string;
    /**
    * Unit type.
    */
    'unitType'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "datamartStartDateCollector",
            "baseName": "datamart_start_date_collector",
            "type": "string",
            "format": ""
        },
        {
            "name": "host",
            "baseName": "host",
            "type": "string",
            "format": ""
        },
        {
            "name": "unitType",
            "baseName": "unit_type",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Guardiumconnectorv3CollectorConfig.attributeTypeMap;
    }

    public constructor() {
    }
}

