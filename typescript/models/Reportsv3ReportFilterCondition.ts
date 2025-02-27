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

import { Reportsv3DateRange } from '../models/Reportsv3DateRange';
import { Reportsv3HeaderType } from '../models/Reportsv3HeaderType';
import { Reportsv3OperatorType } from '../models/Reportsv3OperatorType';
import { Reportsv3ParameterType } from '../models/Reportsv3ParameterType';
import { HttpFile } from '../http/http';

/**
* ReportFilterCondition represents a report filter condition.
*/
export class Reportsv3ReportFilterCondition {
    /**
    * Case Insensitive - Whether the condition is case insensitive or case sensitive.
    */
    'caseInsensitive'?: boolean;
    'fieldNlsTranslationKey'?: string;
    'filterId'?: number;
    'groupTypeId'?: number;
    'headerId'?: string;
    'headerName'?: string;
    'headerType'?: Reportsv3HeaderType;
    'inReportDateRange'?: Reportsv3DateRange;
    'inReportFieldNlsKey'?: string;
    'inReportHeaderId'?: string;
    'inReportHeaderName'?: string;
    'inReportId'?: string;
    'inReportName'?: string;
    'inReportTableName'?: string;
    'isTuple'?: boolean;
    'operatorType'?: Reportsv3OperatorType;
    'parameterType'?: Reportsv3ParameterType;
    'schemaName'?: string;
    'sequence'?: number;
    'tableName'?: string;
    'tupleType'?: string;
    'values'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "caseInsensitive",
            "baseName": "case_insensitive",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "fieldNlsTranslationKey",
            "baseName": "field_nls_translation_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "filterId",
            "baseName": "filter_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "groupTypeId",
            "baseName": "group_type_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "headerId",
            "baseName": "header_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "headerName",
            "baseName": "header_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "headerType",
            "baseName": "header_type",
            "type": "Reportsv3HeaderType",
            "format": ""
        },
        {
            "name": "inReportDateRange",
            "baseName": "in_report_date_range",
            "type": "Reportsv3DateRange",
            "format": ""
        },
        {
            "name": "inReportFieldNlsKey",
            "baseName": "in_report_field_nls_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "inReportHeaderId",
            "baseName": "in_report_header_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "inReportHeaderName",
            "baseName": "in_report_header_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "inReportId",
            "baseName": "in_report_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "inReportName",
            "baseName": "in_report_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "inReportTableName",
            "baseName": "in_report_table_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "isTuple",
            "baseName": "is_tuple",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "operatorType",
            "baseName": "operator_type",
            "type": "Reportsv3OperatorType",
            "format": ""
        },
        {
            "name": "parameterType",
            "baseName": "parameter_type",
            "type": "Reportsv3ParameterType",
            "format": ""
        },
        {
            "name": "schemaName",
            "baseName": "schema_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "sequence",
            "baseName": "sequence",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "tableName",
            "baseName": "table_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "tupleType",
            "baseName": "tuple_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "values",
            "baseName": "values",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3ReportFilterCondition.attributeTypeMap;
    }

    public constructor() {
    }
}



