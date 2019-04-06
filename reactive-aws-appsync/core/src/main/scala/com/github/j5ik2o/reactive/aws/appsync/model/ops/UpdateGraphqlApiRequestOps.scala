// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateGraphqlApiRequestBuilderOps(val self: UpdateGraphqlApiRequest.Builder) extends AnyVal {

  final def withApiIdAsScala(value: Option[String]): UpdateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def withNameAsScala(value: Option[String]): UpdateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def withLogConfigAsScala(value: Option[LogConfig]): UpdateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.logConfig(v)
    }
  } // LogConfig

  final def withAuthenticationTypeAsScala(value: Option[AuthenticationType]): UpdateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.authenticationType(v)
    }
  } // String

  final def withUserPoolConfigAsScala(value: Option[UserPoolConfig]): UpdateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.userPoolConfig(v)
    }
  } // UserPoolConfig

  final def withOpenIDConnectConfigAsScala(value: Option[OpenIDConnectConfig]): UpdateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.openIDConnectConfig(v)
    }
  } // OpenIDConnectConfig

}

final class UpdateGraphqlApiRequestOps(val self: UpdateGraphqlApiRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def logConfigAsScala: Option[LogConfig] = Option(self.logConfig) // LogConfig

  final def authenticationTypeAsScala: Option[AuthenticationType] = Option(self.authenticationType) // String

  final def userPoolConfigAsScala: Option[UserPoolConfig] = Option(self.userPoolConfig) // UserPoolConfig

  final def openIDConnectConfigAsScala: Option[OpenIDConnectConfig] =
    Option(self.openIDConnectConfig) // OpenIDConnectConfig

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateGraphqlApiRequestOps {

  implicit def toUpdateGraphqlApiRequestBuilderOps(
      v: UpdateGraphqlApiRequest.Builder
  ): UpdateGraphqlApiRequestBuilderOps = new UpdateGraphqlApiRequestBuilderOps(v)

  implicit def toUpdateGraphqlApiRequestOps(v: UpdateGraphqlApiRequest): UpdateGraphqlApiRequestOps =
    new UpdateGraphqlApiRequestOps(v)

}
