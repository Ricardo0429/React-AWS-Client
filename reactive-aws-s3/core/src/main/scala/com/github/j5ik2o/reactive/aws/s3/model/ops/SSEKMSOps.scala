// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class SSEKMSBuilderOps(val self: SSEKMS.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): SSEKMS.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  } // String

}

final class SSEKMSOps(val self: SSEKMS) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSSEKMSOps {

  implicit def toSSEKMSBuilderOps(v: SSEKMS.Builder): SSEKMSBuilderOps = new SSEKMSBuilderOps(v)

  implicit def toSSEKMSOps(v: SSEKMS): SSEKMSOps = new SSEKMSOps(v)

}
