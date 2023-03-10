// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DiscoverPollEndpointResponseBuilderOps(val self: DiscoverPollEndpointResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointAsScala(value: Option[String]): DiscoverPollEndpointResponse.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def telemetryEndpointAsScala(value: Option[String]): DiscoverPollEndpointResponse.Builder = {
    value.fold(self) { v =>
      self.telemetryEndpoint(v)
    }
  }

}

final class DiscoverPollEndpointResponseOps(val self: DiscoverPollEndpointResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointAsScala: Option[String] = Option(self.endpoint)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def telemetryEndpointAsScala: Option[String] = Option(self.telemetryEndpoint)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDiscoverPollEndpointResponseOps {

  implicit def toDiscoverPollEndpointResponseBuilderOps(
      v: DiscoverPollEndpointResponse.Builder
  ): DiscoverPollEndpointResponseBuilderOps = new DiscoverPollEndpointResponseBuilderOps(v)

  implicit def toDiscoverPollEndpointResponseOps(v: DiscoverPollEndpointResponse): DiscoverPollEndpointResponseOps =
    new DiscoverPollEndpointResponseOps(v)

}
