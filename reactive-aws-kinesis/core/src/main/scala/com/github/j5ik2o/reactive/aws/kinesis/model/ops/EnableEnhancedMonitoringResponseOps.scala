// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class EnableEnhancedMonitoringResponseBuilderOps(val self: EnableEnhancedMonitoringResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala(value: Option[String]): EnableEnhancedMonitoringResponse.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentShardLevelMetricsAsScala(
      value: Option[Seq[MetricsName]]
  ): EnableEnhancedMonitoringResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.currentShardLevelMetrics(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredShardLevelMetricsAsScala(
      value: Option[Seq[MetricsName]]
  ): EnableEnhancedMonitoringResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.desiredShardLevelMetrics(v.asJava)
    }
  }

}

final class EnableEnhancedMonitoringResponseOps(val self: EnableEnhancedMonitoringResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala: Option[String] = Option(self.streamName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentShardLevelMetricsAsScala: Option[Seq[MetricsName]] = Option(self.currentShardLevelMetrics).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredShardLevelMetricsAsScala: Option[Seq[MetricsName]] = Option(self.desiredShardLevelMetrics).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableEnhancedMonitoringResponseOps {

  implicit def toEnableEnhancedMonitoringResponseBuilderOps(
      v: EnableEnhancedMonitoringResponse.Builder
  ): EnableEnhancedMonitoringResponseBuilderOps = new EnableEnhancedMonitoringResponseBuilderOps(v)

  implicit def toEnableEnhancedMonitoringResponseOps(
      v: EnableEnhancedMonitoringResponse
  ): EnableEnhancedMonitoringResponseOps = new EnableEnhancedMonitoringResponseOps(v)

}
