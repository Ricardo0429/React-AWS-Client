// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutResourcePolicyResponseBuilderOps(val self: PutResourcePolicyResponse.Builder) extends AnyVal {

  final def resourcePolicyAsScala(value: Option[ResourcePolicy]): PutResourcePolicyResponse.Builder = {
    value.fold(self) { v =>
      self.resourcePolicy(v)
    }
  } // ResourcePolicy

}

final class PutResourcePolicyResponseOps(val self: PutResourcePolicyResponse) extends AnyVal {

  final def resourcePolicyAsScala: Option[ResourcePolicy] = Option(self.resourcePolicy) // ResourcePolicy

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutResourcePolicyResponseOps {

  implicit def toPutResourcePolicyResponseBuilderOps(
      v: PutResourcePolicyResponse.Builder
  ): PutResourcePolicyResponseBuilderOps = new PutResourcePolicyResponseBuilderOps(v)

  implicit def toPutResourcePolicyResponseOps(v: PutResourcePolicyResponse): PutResourcePolicyResponseOps =
    new PutResourcePolicyResponseOps(v)

}
