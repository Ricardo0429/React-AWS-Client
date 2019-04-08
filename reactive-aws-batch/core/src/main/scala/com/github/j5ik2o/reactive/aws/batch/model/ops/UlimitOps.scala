// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class UlimitBuilderOps(val self: Ulimit.Builder) extends AnyVal {

  final def hardLimitAsScala(value: Option[Int]): Ulimit.Builder = {
    value.fold(self) { v =>
      self.hardLimit(v)
    }
  } // Int

  final def nameAsScala(value: Option[String]): Ulimit.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def softLimitAsScala(value: Option[Int]): Ulimit.Builder = {
    value.fold(self) { v =>
      self.softLimit(v)
    }
  } // Int

}

final class UlimitOps(val self: Ulimit) extends AnyVal {

  final def hardLimitAsScala: Option[Int] = Option(self.hardLimit) // Int

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def softLimitAsScala: Option[Int] = Option(self.softLimit) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUlimitOps {

  implicit def toUlimitBuilderOps(v: Ulimit.Builder): UlimitBuilderOps = new UlimitBuilderOps(v)

  implicit def toUlimitOps(v: Ulimit): UlimitOps = new UlimitOps(v)

}
