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

import { Reportsrunnerv3JobType } from '../models/Reportsrunnerv3JobType';
import { Reportsv3DateRange } from '../models/Reportsv3DateRange';
import { Reportsv3ModelType } from '../models/Reportsv3ModelType';
import { Reportsv3ReportDefinition } from '../models/Reportsv3ReportDefinition';
import { Reportsv3RunTimeParameter } from '../models/Reportsv3RunTimeParameter';
import { HttpFile } from '../http/http';

/**
* RunReportRequest is the argument of RunReport API.
*/
export class Reportsrunnerv3RunReportRequest {
    /**
    * Whether or not to calculate facets.
    */
    'calculateFacets'?: boolean;
    'dateRange'?: Reportsv3DateRange;
    /**
    * Optional: if report has chart -send  default_chart_expanded be saved in user settings collection per report and user.
    */
    'defaultChartExpanded'?: boolean;
    /**
    * The max amount of rows to return for pagination. Required if report query uses offset and fetch_size parameters.
    */
    'fetchSize'?: number;
    'jobType'?: Reportsrunnerv3JobType;
    'modelType'?: Reportsv3ModelType;
    /**
    * The amount to offset the rows by for pagination. Required if report query uses offset and fetch_size parameters.
    */
    'offset'?: number;
    /**
    * Optional: query_id is used to uniquely identify a query. It can be later used to stop the same query.
    */
    'queryId'?: string;
    'reportDefinition'?: Reportsv3ReportDefinition;
    /**
    * Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905).
    */
    'reportId'?: string;
    /**
    * List of runtime parameter if needed.
    */
    'runtimeParameterList'?: Array<Reportsv3RunTimeParameter>;
    /**
    * Optional: time zone.
    */
    'timeZone'?: string;
    /**
    * Whether or not to calculate count.
    */
    'useQuickFacets'?: boolean;
    /**
    * Whether or not to limit the results.
    */
    'withoutLimit'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "calculateFacets",
            "baseName": "calculate_facets",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "dateRange",
            "baseName": "date_range",
            "type": "Reportsv3DateRange",
            "format": ""
        },
        {
            "name": "defaultChartExpanded",
            "baseName": "default_chart_expanded",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "fetchSize",
            "baseName": "fetch_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "jobType",
            "baseName": "job_type",
            "type": "Reportsrunnerv3JobType",
            "format": ""
        },
        {
            "name": "modelType",
            "baseName": "model_type",
            "type": "Reportsv3ModelType",
            "format": ""
        },
        {
            "name": "offset",
            "baseName": "offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "queryId",
            "baseName": "query_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "reportDefinition",
            "baseName": "report_definition",
            "type": "Reportsv3ReportDefinition",
            "format": ""
        },
        {
            "name": "reportId",
            "baseName": "report_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "runtimeParameterList",
            "baseName": "runtime_parameter_list",
            "type": "Array<Reportsv3RunTimeParameter>",
            "format": ""
        },
        {
            "name": "timeZone",
            "baseName": "time_zone",
            "type": "string",
            "format": ""
        },
        {
            "name": "useQuickFacets",
            "baseName": "use_quick_facets",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "withoutLimit",
            "baseName": "without_limit",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsrunnerv3RunReportRequest.attributeTypeMap;
    }

    public constructor() {
    }
}



