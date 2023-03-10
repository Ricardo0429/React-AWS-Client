// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmsForMetricResponseBuilderOps(val self: DescribeAlarmsForMetricResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricAlarmsAsScala(value: Option[Seq[MetricAlarm]]): DescribeAlarmsForMetricResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.metricAlarms(v.asJava)
    }
  }

}

final class DescribeAlarmsForMetricResponseOps(val self: DescribeAlarmsForMetricResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricAlarmsAsScala: Option[Seq[MetricAlarm]] = Option(self.metricAlarms).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAlarmsForMetricResponseOps {

  implicit def toDescribeAlarmsForMetricResponseBuilderOps(
      v: DescribeAlarmsForMetricResponse.Builder
  ): DescribeAlarmsForMetricResponseBuilderOps = new DescribeAlarmsForMetricResponseBuilderOps(v)

  implicit def toDescribeAlarmsForMetricResponseOps(
      v: DescribeAlarmsForMetricResponse
  ): DescribeAlarmsForMetricResponseOps = new DescribeAlarmsForMetricResponseOps(v)

}
