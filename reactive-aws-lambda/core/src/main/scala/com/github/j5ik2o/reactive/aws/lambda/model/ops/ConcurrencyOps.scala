// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ConcurrencyBuilderOps(val self: Concurrency.Builder) extends AnyVal {

  final def reservedConcurrentExecutionsAsScala(value: Option[Int]): Concurrency.Builder = {
    value.fold(self) { v =>
      self.reservedConcurrentExecutions(v)
    }
  } // Int

}

final class ConcurrencyOps(val self: Concurrency) extends AnyVal {

  final def reservedConcurrentExecutionsAsScala: Option[Int] = Option(self.reservedConcurrentExecutions) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConcurrencyOps {

  implicit def toConcurrencyBuilderOps(v: Concurrency.Builder): ConcurrencyBuilderOps = new ConcurrencyBuilderOps(v)

  implicit def toConcurrencyOps(v: Concurrency): ConcurrencyOps = new ConcurrencyOps(v)

}
