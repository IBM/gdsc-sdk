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
* Details if inspection engine are present at start and end.
*/
export class Healthcollectorv3InspectionEnginePresentDetails {
    /**
    * Name of the inspection engine.
    */
    'inspectionEngine'?: string;
    /**
    * Inspection engine present at end time.
    */
    'presentAtEnd'?: boolean;
    /**
    * Inspection engine present at start time.
    */
    'presentAtStart'?: boolean;
    /**
    * Protocol of the ie.
    */
    'protocol'?: string;
    /**
    * Version of the ie.
    */
    'version'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "inspectionEngine",
            "baseName": "inspection_engine",
            "type": "string",
            "format": ""
        },
        {
            "name": "presentAtEnd",
            "baseName": "present_at_end",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "presentAtStart",
            "baseName": "present_at_start",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "protocol",
            "baseName": "protocol",
            "type": "string",
            "format": ""
        },
        {
            "name": "version",
            "baseName": "version",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Healthcollectorv3InspectionEnginePresentDetails.attributeTypeMap;
    }

    public constructor() {
    }
}

