// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class HostBuilderOps(val self: Host.Builder) extends AnyVal {

  final def sourcePathAsScala(value: Option[String]): Host.Builder = {
    value.fold(self) { v =>
      self.sourcePath(v)
    }
  } // String

}

final class HostOps(val self: Host) extends AnyVal {

  final def sourcePathAsScala: Option[String] = Option(self.sourcePath) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHostOps {

  implicit def toHostBuilderOps(v: Host.Builder): HostBuilderOps = new HostBuilderOps(v)

  implicit def toHostOps(v: Host): HostOps = new HostOps(v)

}
