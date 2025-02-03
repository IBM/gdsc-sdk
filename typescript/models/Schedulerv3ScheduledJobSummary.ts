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

import { Schedulerv3Frequency } from '../models/Schedulerv3Frequency';
import { Schedulerv3Recipient } from '../models/Schedulerv3Recipient';
import { Schedulerv3ScheduledTaskSummary } from '../models/Schedulerv3ScheduledTaskSummary';
import { HttpFile } from '../http/http';

/**
* ScheduledJobSummary returns enough details for list view.
*/
export class Schedulerv3ScheduledJobSummary {
    /**
    * Optional: Timestamp when the scheduled job was created.
    */
    'creationTime'?: Date;
    /**
    * Optional: Description for the scheduledJob.
    */
    'description'?: string;
    /**
    * Enabled or disable the schedule.
    */
    'enabled'?: boolean;
    /**
    * Optional: If this schedule is expired or continues forever.
    */
    'expired'?: boolean;
    'frequency'?: Schedulerv3Frequency;
    /**
    * Optional: Timestamp for the last time the scheduled job was modified.
    */
    'lastModifiedTime'?: Date;
    /**
    * Optional: Duration of the previous run.
    */
    'lastRunDuration'?: number;
    /**
    * Optional: Timestamp for the previous run.
    */
    'lastRunStart'?: Date;
    /**
    * Schedule name.
    */
    'name'?: string;
    /**
    * Optional: Timestamp for the next jobrun.
    */
    'nextRun'?: Date;
    'recipient'?: Schedulerv3Recipient;
    'recipients'?: Array<Schedulerv3Recipient>;
    /**
    * Optional: Reports run by this scheduled job.
    */
    'reportNames'?: Array<string>;
    /**
    * ID for this record. It is automatically created by the database.
    */
    'scheduleId'?: string;
    /**
    * Optional: Tags to use.
    */
    'tags'?: Array<string>;
    'tasks'?: Array<Schedulerv3ScheduledTaskSummary>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "creationTime",
            "baseName": "creation_time",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "enabled",
            "baseName": "enabled",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "expired",
            "baseName": "expired",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "frequency",
            "baseName": "frequency",
            "type": "Schedulerv3Frequency",
            "format": ""
        },
        {
            "name": "lastModifiedTime",
            "baseName": "last_modified_time",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "lastRunDuration",
            "baseName": "last_run_duration",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "lastRunStart",
            "baseName": "last_run_start",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "nextRun",
            "baseName": "next_run",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "recipient",
            "baseName": "recipient",
            "type": "Schedulerv3Recipient",
            "format": ""
        },
        {
            "name": "recipients",
            "baseName": "recipients",
            "type": "Array<Schedulerv3Recipient>",
            "format": ""
        },
        {
            "name": "reportNames",
            "baseName": "report_names",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "scheduleId",
            "baseName": "schedule_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "tasks",
            "baseName": "tasks",
            "type": "Array<Schedulerv3ScheduledTaskSummary>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Schedulerv3ScheduledJobSummary.attributeTypeMap;
    }

    public constructor() {
    }
}



