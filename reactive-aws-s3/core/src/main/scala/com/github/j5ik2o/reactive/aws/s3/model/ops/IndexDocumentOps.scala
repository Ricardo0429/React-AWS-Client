// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class IndexDocumentBuilderOps(val self: IndexDocument.Builder) extends AnyVal {

  final def suffixAsScala(value: Option[String]): IndexDocument.Builder = {
    value.fold(self) { v =>
      self.suffix(v)
    }
  } // String

}

final class IndexDocumentOps(val self: IndexDocument) extends AnyVal {

  final def suffixAsScala: Option[String] = Option(self.suffix) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIndexDocumentOps {

  implicit def toIndexDocumentBuilderOps(v: IndexDocument.Builder): IndexDocumentBuilderOps =
    new IndexDocumentBuilderOps(v)

  implicit def toIndexDocumentOps(v: IndexDocument): IndexDocumentOps = new IndexDocumentOps(v)

}
