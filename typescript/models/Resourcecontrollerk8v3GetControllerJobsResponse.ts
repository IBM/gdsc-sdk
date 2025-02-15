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

import { Resourcecontrollerk8v3Job } from '../models/Resourcecontrollerk8v3Job';
import { HttpFile } from '../http/http';

export class Resourcecontrollerk8v3GetControllerJobsResponse {
    /**
    * The ID of the controller to get jobs for.
    */
    'controllerId'?: string;
    /**
    * The controllers for the tenant.
    */
    'jobs'?: Array<Resourcecontrollerk8v3Job>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "controllerId",
            "baseName": "controller_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "jobs",
            "baseName": "jobs",
            "type": "Array<Resourcecontrollerk8v3Job>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Resourcecontrollerk8v3GetControllerJobsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

