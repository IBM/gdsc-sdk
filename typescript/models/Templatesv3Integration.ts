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
* Integration type is the target integration for the template.
*/
export enum Templatesv3Integration {
    UndefinedIntegration = 'UNDEFINED_INTEGRATION',
    Smtp = 'SMTP',
    Snmp = 'SNMP',
    Syslog = 'SYSLOG',
    Cases = 'CASES',
    ServiceNow = 'SERVICE_NOW',
    Resilient = 'RESILIENT',
    Soar = 'SOAR',
    Webhook = 'WEBHOOK',
    Slack = 'SLACK',
    Teams = 'TEAMS',
    Sms = 'SMS',
    Jira = 'JIRA'
}
