// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmHistoryResponseBuilderOps(val self: DescribeAlarmHistoryResponse.Builder) extends AnyVal {

  final def alarmHistoryItemsAsScala(value: Option[Seq[AlarmHistoryItem]]): DescribeAlarmHistoryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.alarmHistoryItems(v.asJava)
    } // Seq[AlarmHistoryItem]
  }

  final def nextTokenAsScala(value: Option[String]): DescribeAlarmHistoryResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeAlarmHistoryResponseOps(val self: DescribeAlarmHistoryResponse) extends AnyVal {

  final def alarmHistoryItemsAsScala: Option[Seq[AlarmHistoryItem]] = Option(self.alarmHistoryItems).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[AlarmHistoryItem]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAlarmHistoryResponseOps {

  implicit def toDescribeAlarmHistoryResponseBuilderOps(
      v: DescribeAlarmHistoryResponse.Builder
  ): DescribeAlarmHistoryResponseBuilderOps = new DescribeAlarmHistoryResponseBuilderOps(v)

  implicit def toDescribeAlarmHistoryResponseOps(v: DescribeAlarmHistoryResponse): DescribeAlarmHistoryResponseOps =
    new DescribeAlarmHistoryResponseOps(v)

}
