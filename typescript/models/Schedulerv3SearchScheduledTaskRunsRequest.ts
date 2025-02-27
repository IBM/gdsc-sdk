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

export class Schedulerv3SearchScheduledTaskRunsRequest {
    /**
    * Optional: the max amount of rows to return for pagination.
    */
    'limit'?: number;
    /**
    * Optional: the amount to offset the rows by for pagination.
    */
    'offset'?: number;
    /**
    * Optional: specicified ScheduledJobs.
    */
    'scheduledJobId'?: Array<string>;
    /**
    * Optional: whether return latest runs for ScheduledJobs.
    */
    'withLatest'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "limit",
            "baseName": "limit",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "offset",
            "baseName": "offset",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "scheduledJobId",
            "baseName": "scheduled_job_id",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "withLatest",
            "baseName": "with_latest",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Schedulerv3SearchScheduledTaskRunsRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

