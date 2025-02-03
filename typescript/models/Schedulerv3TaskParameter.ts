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

import { Schedulerv3IntegrationParameter } from '../models/Schedulerv3IntegrationParameter';
import { Schedulerv3ReportParameter } from '../models/Schedulerv3ReportParameter';
import { HttpFile } from '../http/http';

/**
* TaskParameter includes all the parameters needed to run a job, add different job runtime parameters here.
*/
export class Schedulerv3TaskParameter {
    'dataImportParameter'?: Schedulerv3IntegrationParameter;
    'reportParameter'?: Schedulerv3ReportParameter;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "dataImportParameter",
            "baseName": "data_import_parameter",
            "type": "Schedulerv3IntegrationParameter",
            "format": ""
        },
        {
            "name": "reportParameter",
            "baseName": "report_parameter",
            "type": "Schedulerv3ReportParameter",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Schedulerv3TaskParameter.attributeTypeMap;
    }

    public constructor() {
    }
}

