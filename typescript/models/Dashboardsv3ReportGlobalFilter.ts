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

import { Dashboardsv3ReportOperator } from '../models/Dashboardsv3ReportOperator';
import { HttpFile } from '../http/http';

export class Dashboardsv3ReportGlobalFilter {
    'caseInsensitive'?: boolean;
    'filterItemType'?: string;
    'groupName'?: string;
    'headerId'?: string;
    'headerType'?: string;
    'id'?: string;
    'name'?: string;
    'operator'?: string;
    'operatorKey'?: string;
    'reportOperator'?: Array<Dashboardsv3ReportOperator>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "caseInsensitive",
            "baseName": "case_insensitive",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "filterItemType",
            "baseName": "filter_item_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "groupName",
            "baseName": "group_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "headerId",
            "baseName": "header_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "headerType",
            "baseName": "header_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "operator",
            "baseName": "operator",
            "type": "string",
            "format": ""
        },
        {
            "name": "operatorKey",
            "baseName": "operator_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "reportOperator",
            "baseName": "report_operator",
            "type": "Array<Dashboardsv3ReportOperator>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Dashboardsv3ReportGlobalFilter.attributeTypeMap;
    }

    public constructor() {
    }
}

