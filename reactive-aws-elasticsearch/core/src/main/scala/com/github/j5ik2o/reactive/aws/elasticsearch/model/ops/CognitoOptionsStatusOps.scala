// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CognitoOptionsStatusBuilderOps(val self: CognitoOptionsStatus.Builder) extends AnyVal {

  final def withOptionsAsScala(value: Option[CognitoOptions]): CognitoOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  } // CognitoOptions

  final def withStatusAsScala(value: Option[OptionStatus]): CognitoOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // OptionStatus

}

final class CognitoOptionsStatusOps(val self: CognitoOptionsStatus) extends AnyVal {

  final def optionsAsScala: Option[CognitoOptions] = Option(self.options) // CognitoOptions

  final def statusAsScala: Option[OptionStatus] = Option(self.status) // OptionStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCognitoOptionsStatusOps {

  implicit def toCognitoOptionsStatusBuilderOps(v: CognitoOptionsStatus.Builder): CognitoOptionsStatusBuilderOps =
    new CognitoOptionsStatusBuilderOps(v)

  implicit def toCognitoOptionsStatusOps(v: CognitoOptionsStatus): CognitoOptionsStatusOps =
    new CognitoOptionsStatusOps(v)

}
