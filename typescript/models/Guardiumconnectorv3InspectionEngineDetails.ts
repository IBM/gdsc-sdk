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
* Additional information for an inspection engine.
*/
export class Guardiumconnectorv3InspectionEngineDetails {
    /**
    * Inspection engine.
    */
    'ie'?: string;
    /**
    * Port.
    */
    'port'?: string;
    /**
    * Protocol.
    */
    'protocol'?: string;
    /**
    * S -TAP name.
    */
    'stap'?: string;
    /**
    * Verfication health.
    */
    'verificationHealth'?: number;
    /**
    * Verfication results.
    */
    'verificationResult'?: string;
    /**
    * Verfication state.
    */
    'verificationState'?: string;
    /**
    * Version.
    */
    'version'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "ie",
            "baseName": "ie",
            "type": "string",
            "format": ""
        },
        {
            "name": "port",
            "baseName": "port",
            "type": "string",
            "format": ""
        },
        {
            "name": "protocol",
            "baseName": "protocol",
            "type": "string",
            "format": ""
        },
        {
            "name": "stap",
            "baseName": "stap",
            "type": "string",
            "format": ""
        },
        {
            "name": "verificationHealth",
            "baseName": "verification_health",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "verificationResult",
            "baseName": "verification_result",
            "type": "string",
            "format": ""
        },
        {
            "name": "verificationState",
            "baseName": "verification_state",
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
        return Guardiumconnectorv3InspectionEngineDetails.attributeTypeMap;
    }

    public constructor() {
    }
}

