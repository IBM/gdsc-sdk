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

/**
* AggregationType - possible aggregation types.
*/
export enum Reportsv3AggregationType {
    UndefinedAggType = 'UNDEFINED_AGG_TYPE',
    Max = 'MAX',
    Min = 'MIN',
    Avg = 'AVG',
    Count = 'COUNT',
    Sum = 'SUM',
    Value = 'VALUE',
    Distinct = 'DISTINCT',
    ScalarHour = 'SCALAR_HOUR',
    ScalarDay = 'SCALAR_DAY',
    ScalarWeek = 'SCALAR_WEEK',
    ScalarMonth = 'SCALAR_MONTH',
    ScalarYear = 'SCALAR_YEAR',
    ScalarDate = 'SCALAR_DATE'
}
