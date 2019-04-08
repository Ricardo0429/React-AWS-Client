// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class PlatformFrameworkBuilderOps(val self: PlatformFramework.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): PlatformFramework.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def versionAsScala(value: Option[String]): PlatformFramework.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

}

final class PlatformFrameworkOps(val self: PlatformFramework) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def versionAsScala: Option[String] = Option(self.version)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlatformFrameworkOps {

  implicit def toPlatformFrameworkBuilderOps(v: PlatformFramework.Builder): PlatformFrameworkBuilderOps =
    new PlatformFrameworkBuilderOps(v)

  implicit def toPlatformFrameworkOps(v: PlatformFramework): PlatformFrameworkOps = new PlatformFrameworkOps(v)

}
