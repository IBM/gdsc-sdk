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

import { Workflowv3Comment } from '../models/Workflowv3Comment';
import { Workflowv3Entity } from '../models/Workflowv3Entity';
import { Workflowv3Origin } from '../models/Workflowv3Origin';
import { Workflowv3Priority } from '../models/Workflowv3Priority';
import { Workflowv3Status } from '../models/Workflowv3Status';
import { Workflowv3Task } from '../models/Workflowv3Task';
import { HttpFile } from '../http/http';

/**
* Top-level task (case).
*/
export class Workflowv3Case {
    /**
    * Alternate Unique ID.
    */
    'altId'?: string;
    /**
    * Array of artifact URLs, i.e. a URL to a report result.
    */
    'artifacts'?: Array<string>;
    /**
    * Entities that the case is assigned to.
    */
    'assignments'?: Array<Workflowv3Entity>;
    /**
    * Unique ID.
    */
    'caseId'?: string;
    /**
    * Comments - who, when, what.
    */
    'comments'?: Array<Workflowv3Comment>;
    /**
    * Date created (Scheduled job queue time).
    */
    'dateCreated'?: Date;
    /**
    * Date due (Scheduled job next run).
    */
    'dateDue'?: Date;
    /**
    * Date of last update.
    */
    'dateModified'?: Date;
    /**
    * Multiline description of the case.
    */
    'description'?: string;
    /**
    * Access level.
    */
    'fullAccess'?: boolean;
    'origin'?: Workflowv3Origin;
    'priority'?: Workflowv3Priority;
    'status'?: Workflowv3Status;
    /**
    * Sub-tasks that the current user has access to.
    */
    'tasks'?: Array<Workflowv3Task>;
    /**
    * Case title (subject).
    */
    'title'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "altId",
            "baseName": "alt_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "artifacts",
            "baseName": "artifacts",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "assignments",
            "baseName": "assignments",
            "type": "Array<Workflowv3Entity>",
            "format": ""
        },
        {
            "name": "caseId",
            "baseName": "case_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "comments",
            "baseName": "comments",
            "type": "Array<Workflowv3Comment>",
            "format": ""
        },
        {
            "name": "dateCreated",
            "baseName": "date_created",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "dateDue",
            "baseName": "date_due",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "dateModified",
            "baseName": "date_modified",
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
            "name": "fullAccess",
            "baseName": "full_access",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "origin",
            "baseName": "origin",
            "type": "Workflowv3Origin",
            "format": ""
        },
        {
            "name": "priority",
            "baseName": "priority",
            "type": "Workflowv3Priority",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "Workflowv3Status",
            "format": ""
        },
        {
            "name": "tasks",
            "baseName": "tasks",
            "type": "Array<Workflowv3Task>",
            "format": ""
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Workflowv3Case.attributeTypeMap;
    }

    public constructor() {
    }
}



