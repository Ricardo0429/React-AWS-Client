// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class InputSerializationBuilderOps(val self: InputSerialization.Builder) extends AnyVal {

  final def csvAsScala(value: Option[CSVInput]): InputSerialization.Builder = {
    value.fold(self) { v =>
      self.csv(v)
    }
  } // CSVInput

  final def compressionTypeAsScala(value: Option[CompressionType]): InputSerialization.Builder = {
    value.fold(self) { v =>
      self.compressionType(v)
    }
  } // CompressionType

  final def jsonAsScala(value: Option[JSONInput]): InputSerialization.Builder = {
    value.fold(self) { v =>
      self.json(v)
    }
  } // JSONInput

  final def parquetAsScala(value: Option[ParquetInput]): InputSerialization.Builder = {
    value.fold(self) { v =>
      self.parquet(v)
    }
  } // ParquetInput

}

final class InputSerializationOps(val self: InputSerialization) extends AnyVal {

  final def csvAsScala: Option[CSVInput] = Option(self.csv) // CSVInput

  final def compressionTypeAsScala: Option[CompressionType] = Option(self.compressionType) // CompressionType

  final def jsonAsScala: Option[JSONInput] = Option(self.json) // JSONInput

  final def parquetAsScala: Option[ParquetInput] = Option(self.parquet) // ParquetInput

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInputSerializationOps {

  implicit def toInputSerializationBuilderOps(v: InputSerialization.Builder): InputSerializationBuilderOps =
    new InputSerializationBuilderOps(v)

  implicit def toInputSerializationOps(v: InputSerialization): InputSerializationOps = new InputSerializationOps(v)

}
