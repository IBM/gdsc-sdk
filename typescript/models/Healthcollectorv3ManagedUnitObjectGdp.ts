/**
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization\'s Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Healthcollectorv3MUDetailsObjGdp } from '../models/Healthcollectorv3MUDetailsObjGdp';
import { HttpFile } from '../http/http';

/**
* Guardium Data Protection systems.
*/
export class Healthcollectorv3ManagedUnitObjectGdp {
    /**
    * Aggregation health status.
    */
    'aggHealthStatus'?: number;
    /**
    * Connectivity status.
    */
    'connectivity'?: number;
    'details'?: Healthcollectorv3MUDetailsObjGdp;
    /**
    * Aggregator the collector exports data to.
    */
    'exportsTo'?: Array<string>;
    /**
    * Id of the managed unit.
    */
    'id'?: number;
    /**
    * Collectors the aggregator imports data from.
    */
    'importsFrom'?: Array<string>;
    /**
    * Overall status of S-TAPs for the system.
    */
    'musStapsHealthStatus'?: number;
    /**
    * Name of the Guardium Data Protection system.
    */
    'name'?: string;
    /**
    * Operating system version.
    */
    'osVersion'?: string;
    /**
    * Patch number.
    */
    'patch'?: string;
    /**
    * Overall system status.
    */
    'status'?: number;
    /**
    * Unit type.
    */
    'type'?: string;
    /**
    * IP address.
    */
    'unitHostIp'?: string;
    /**
    * Unit utilization status.
    */
    'unitUtilizationHealthStatus'?: number;
    /**
    * Guardium Data Protection version.
    */
    'version'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "aggHealthStatus",
            "baseName": "agg_health_status",
            "type": "number",
            "format": "int32"
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
            "type": "Healthcollectorv3MUDetailsObjGdp",
            "format": ""
        },
        {
            "name": "exportsTo",
            "baseName": "exports_to",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "importsFrom",
            "baseName": "imports_from",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "musStapsHealthStatus",
            "baseName": "mus_staps_health_status",
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
            "name": "osVersion",
            "baseName": "os_version",
            "type": "string",
            "format": ""
        },
        {
            "name": "patch",
            "baseName": "patch",
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
            "name": "type",
            "baseName": "type",
            "type": "string",
            "format": ""
        },
        {
            "name": "unitHostIp",
            "baseName": "unit_host_ip",
            "type": "string",
            "format": ""
        },
        {
            "name": "unitUtilizationHealthStatus",
            "baseName": "unit_utilization_health_status",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "version",
            "baseName": "version",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Healthcollectorv3ManagedUnitObjectGdp.attributeTypeMap;
    }

    public constructor() {
    }
}

