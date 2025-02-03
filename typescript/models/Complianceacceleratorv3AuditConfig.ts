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

import { Complianceacceleratorv3AuditScheduler } from '../models/Complianceacceleratorv3AuditScheduler';
import { Schedulerv3Recipient } from '../models/Schedulerv3Recipient';
import { Schedulerv3ScheduledTask } from '../models/Schedulerv3ScheduledTask';
import { HttpFile } from '../http/http';

/**
* Audit scheduling configuration.
*/
export class Complianceacceleratorv3AuditConfig {
    /**
    * Audit description.
    */
    'description'?: string;
    /**
    * If audit is enabled to run.
    */
    'enabled'?: boolean;
    /**
    * Audit id.
    */
    'id'?: string;
    /**
    * Audit instructions.
    */
    'instructions'?: string;
    /**
    * Delete flag.
    */
    'isDeletion'?: boolean;
    /**
    * Audit name.
    */
    'name'?: string;
    'owner'?: Schedulerv3Recipient;
    /**
    * Recepients.
    */
    'recipients'?: Array<Schedulerv3Recipient>;
    /**
    * Which reports set will be used.
    */
    'reportKey'?: string;
    /**
    * Flag if run once right away.
    */
    'runOnceNow'?: boolean;
    'scheduler'?: Complianceacceleratorv3AuditScheduler;
    /**
    * Array of tasks.
    */
    'tasks'?: Array<Schedulerv3ScheduledTask>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
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
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "instructions",
            "baseName": "instructions",
            "type": "string",
            "format": ""
        },
        {
            "name": "isDeletion",
            "baseName": "is_deletion",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "owner",
            "baseName": "owner",
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
            "name": "reportKey",
            "baseName": "report_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "runOnceNow",
            "baseName": "run_once_now",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "scheduler",
            "baseName": "scheduler",
            "type": "Complianceacceleratorv3AuditScheduler",
            "format": ""
        },
        {
            "name": "tasks",
            "baseName": "tasks",
            "type": "Array<Schedulerv3ScheduledTask>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Complianceacceleratorv3AuditConfig.attributeTypeMap;
    }

    public constructor() {
    }
}

