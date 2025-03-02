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
* Configure datamart streaming for Managed Units.
*/
export class Guardiumconnectorv3ConfigureStreamingRequest {
    /**
    * Enable/disable.
    */
    'action'?: string;
    /**
    * Central Manager ID.
    */
    'centralManagerId'?: string;
    /**
    * Flag to either skip or include historical datamarts as part of configure streaming API.
    */
    'skipHistoricalDatamarts'?: boolean;
    /**
    * List of managed units that will be configured for datamart streaming.
    */
    'units'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "action",
            "baseName": "action",
            "type": "string",
            "format": ""
        },
        {
            "name": "centralManagerId",
            "baseName": "central_manager_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "skipHistoricalDatamarts",
            "baseName": "skip_historical_datamarts",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "units",
            "baseName": "units",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Guardiumconnectorv3ConfigureStreamingRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

