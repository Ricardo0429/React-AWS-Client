// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class EnableEnhancedMonitoringRequestBuilderOps(val self: EnableEnhancedMonitoringRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala(value: Option[String]): EnableEnhancedMonitoringRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardLevelMetricsAsScala(value: Option[Seq[MetricsName]]): EnableEnhancedMonitoringRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.shardLevelMetrics(v.asJava)
    }
  }

}

final class EnableEnhancedMonitoringRequestOps(val self: EnableEnhancedMonitoringRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala: Option[String] = Option(self.streamName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardLevelMetricsAsScala: Option[Seq[MetricsName]] = Option(self.shardLevelMetrics).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableEnhancedMonitoringRequestOps {

  implicit def toEnableEnhancedMonitoringRequestBuilderOps(
      v: EnableEnhancedMonitoringRequest.Builder
  ): EnableEnhancedMonitoringRequestBuilderOps = new EnableEnhancedMonitoringRequestBuilderOps(v)

  implicit def toEnableEnhancedMonitoringRequestOps(
      v: EnableEnhancedMonitoringRequest
  ): EnableEnhancedMonitoringRequestOps = new EnableEnhancedMonitoringRequestOps(v)

}
