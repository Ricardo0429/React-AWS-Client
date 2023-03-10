// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GlacierJobParametersBuilderOps(val self: GlacierJobParameters.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tierAsScala(value: Option[Tier]): GlacierJobParameters.Builder = {
    value.fold(self) { v =>
      self.tier(v)
    }
  }

}

final class GlacierJobParametersOps(val self: GlacierJobParameters) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tierAsScala: Option[Tier] = Option(self.tier)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGlacierJobParametersOps {

  implicit def toGlacierJobParametersBuilderOps(v: GlacierJobParameters.Builder): GlacierJobParametersBuilderOps =
    new GlacierJobParametersBuilderOps(v)

  implicit def toGlacierJobParametersOps(v: GlacierJobParameters): GlacierJobParametersOps =
    new GlacierJobParametersOps(v)

}
