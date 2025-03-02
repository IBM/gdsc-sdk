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

import { Healthcollectorv3InspectionEngineDetails } from '../models/Healthcollectorv3InspectionEngineDetails';
import { Healthcollectorv3StapDetailsObject } from '../models/Healthcollectorv3StapDetailsObject';
import { HttpFile } from '../http/http';

/**
* StapObject gets information about monitoring agents.
*/
export class Healthcollectorv3StapObject {
    /**
    * Host name of Guardium Data Protection system.
    */
    'collectorHostname'?: string;
    /**
    * Connectivity status.
    */
    'connectivity'?: number;
    'details'?: Healthcollectorv3StapDetailsObject;
    /**
    * Count of inspection engines.
    */
    'ieCount'?: number;
    /**
    * Details about inspection engines.
    */
    'ieDetails'?: Array<Healthcollectorv3InspectionEngineDetails>;
    /**
    * K-TAP status.
    */
    'ktap'?: number;
    /**
    * Name of the S-TAP.
    */
    'name'?: string;
    /**
    * Operating system.
    */
    'osType'?: string;
    /**
    * Overall status of inspection engines.
    */
    'overallIeStatus'?: number;
    /**
    * Revision.
    */
    'revision'?: string;
    /**
    * IP address.
    */
    'stapIp'?: string;
    /**
    * Overall status.
    */
    'status'?: number;
    /**
    * Traffic status.
    */
    'traffic'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "collectorHostname",
            "baseName": "collector_hostname",
            "type": "string",
            "format": ""
        },
        {
            "name": "connectivity",
            "baseName": "connectivity",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "details",
            "baseName": "details",
            "type": "Healthcollectorv3StapDetailsObject",
            "format": ""
        },
        {
            "name": "ieCount",
            "baseName": "ie_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "ieDetails",
            "baseName": "ie_details",
            "type": "Array<Healthcollectorv3InspectionEngineDetails>",
            "format": ""
        },
        {
            "name": "ktap",
            "baseName": "ktap",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "osType",
            "baseName": "os_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "overallIeStatus",
            "baseName": "overall_ie_status",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "revision",
            "baseName": "revision",
            "type": "string",
            "format": ""
        },
        {
            "name": "stapIp",
            "baseName": "stap_ip",
            "type": "string",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "traffic",
            "baseName": "traffic",
            "type": "number",
            "format": "int32"
        }    ];

    static getAttributeTypeMap() {
        return Healthcollectorv3StapObject.attributeTypeMap;
    }

    public constructor() {
    }
}

