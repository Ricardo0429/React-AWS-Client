// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TransactGetItemsRequestBuilderOps(val self: TransactGetItemsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transactItemsAsScala(value: Option[Seq[TransactGetItem]]): TransactGetItemsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.transactItems(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): TransactGetItemsRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  }

}

final class TransactGetItemsRequestOps(val self: TransactGetItemsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transactItemsAsScala: Option[Seq[TransactGetItem]] = Option(self.transactItems).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] = Option(self.returnConsumedCapacity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransactGetItemsRequestOps {

  implicit def toTransactGetItemsRequestBuilderOps(
      v: TransactGetItemsRequest.Builder
  ): TransactGetItemsRequestBuilderOps = new TransactGetItemsRequestBuilderOps(v)

  implicit def toTransactGetItemsRequestOps(v: TransactGetItemsRequest): TransactGetItemsRequestOps =
    new TransactGetItemsRequestOps(v)

}
