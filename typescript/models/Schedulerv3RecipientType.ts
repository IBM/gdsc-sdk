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
* RecipientType is for email receivers either use user name or email address.
*/
export enum Schedulerv3RecipientType {
    UndefinedRectype = 'UNDEFINED_RECTYPE',
    Email = 'EMAIL',
    User = 'USER',
    Role = 'ROLE',
    Ticket = 'TICKET',
    Syslog = 'SYSLOG',
    Snmp = 'SNMP',
    Sftp = 'SFTP',
    Smb = 'SMB',
    Webhook = 'WEBHOOK',
    Distribution = 'DISTRIBUTION',
    Slack = 'SLACK',
    Teams = 'TEAMS',
    Sms = 'SMS',
    Group = 'GROUP'
}
