// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class SecretBuilderOps(val self: Secret.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): Secret.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def valueFromAsScala(value: Option[String]): Secret.Builder = {
    value.fold(self) { v =>
      self.valueFrom(v)
    }
  }

}

final class SecretOps(val self: Secret) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def valueFromAsScala: Option[String] = Option(self.valueFrom)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSecretOps {

  implicit def toSecretBuilderOps(v: Secret.Builder): SecretBuilderOps = new SecretBuilderOps(v)

  implicit def toSecretOps(v: Secret): SecretOps = new SecretOps(v)

}
