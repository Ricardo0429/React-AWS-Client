// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class OutputSerializationBuilderOps(val self: OutputSerialization.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def csvAsScala(value: Option[CSVOutput]): OutputSerialization.Builder = {
    value.fold(self) { v =>
      self.csv(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jsonAsScala(value: Option[JSONOutput]): OutputSerialization.Builder = {
    value.fold(self) { v =>
      self.json(v)
    }
  }

}

final class OutputSerializationOps(val self: OutputSerialization) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def csvAsScala: Option[CSVOutput] = Option(self.csv)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jsonAsScala: Option[JSONOutput] = Option(self.json)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOutputSerializationOps {

  implicit def toOutputSerializationBuilderOps(v: OutputSerialization.Builder): OutputSerializationBuilderOps =
    new OutputSerializationBuilderOps(v)

  implicit def toOutputSerializationOps(v: OutputSerialization): OutputSerializationOps = new OutputSerializationOps(v)

}
