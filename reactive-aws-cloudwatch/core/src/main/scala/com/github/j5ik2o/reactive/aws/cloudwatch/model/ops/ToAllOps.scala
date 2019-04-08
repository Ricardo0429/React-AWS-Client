package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import com.github.j5ik2o.reactive.aws.utils.ToOptionSupport

trait ToAllOps
    extends ToOptionSupport
    with ToAlarmHistoryItemOps
    with ToDashboardEntryOps
    with ToDashboardValidationMessageOps
    with ToDatapointOps
    with ToDeleteAlarmsRequestOps
    with ToDeleteDashboardsRequestOps
    with ToDescribeAlarmHistoryRequestOps
    with ToDescribeAlarmHistoryResponseOps
    with ToDescribeAlarmsForMetricRequestOps
    with ToDescribeAlarmsForMetricResponseOps
    with ToDescribeAlarmsRequestOps
    with ToDescribeAlarmsResponseOps
    with ToDimensionFilterOps
    with ToDimensionOps
    with ToDisableAlarmActionsRequestOps
    with ToEnableAlarmActionsRequestOps
    with ToGetDashboardRequestOps
    with ToGetDashboardResponseOps
    with ToGetMetricDataRequestOps
    with ToGetMetricDataResponseOps
    with ToGetMetricStatisticsRequestOps
    with ToGetMetricStatisticsResponseOps
    with ToGetMetricWidgetImageRequestOps
    with ToGetMetricWidgetImageResponseOps
    with ToListDashboardsRequestOps
    with ToListDashboardsResponseOps
    with ToListMetricsRequestOps
    with ToListMetricsResponseOps
    with ToMessageDataOps
    with ToMetricAlarmOps
    with ToMetricDataQueryOps
    with ToMetricDataResultOps
    with ToMetricDatumOps
    with ToMetricOps
    with ToMetricStatOps
    with ToPutDashboardRequestOps
    with ToPutDashboardResponseOps
    with ToPutMetricAlarmRequestOps
    with ToPutMetricDataRequestOps
    with ToSetAlarmStateRequestOps
    with ToStatisticSetOps
