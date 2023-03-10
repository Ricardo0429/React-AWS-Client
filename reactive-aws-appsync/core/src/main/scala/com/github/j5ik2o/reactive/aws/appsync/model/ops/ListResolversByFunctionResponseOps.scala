// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListResolversByFunctionResponseBuilderOps(val self: ListResolversByFunctionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resolversAsScala(value: Option[Seq[Resolver]]): ListResolversByFunctionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resolvers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListResolversByFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListResolversByFunctionResponseOps(val self: ListResolversByFunctionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resolversAsScala: Option[Seq[Resolver]] = Option(self.resolvers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListResolversByFunctionResponseOps {

  implicit def toListResolversByFunctionResponseBuilderOps(
      v: ListResolversByFunctionResponse.Builder
  ): ListResolversByFunctionResponseBuilderOps = new ListResolversByFunctionResponseBuilderOps(v)

  implicit def toListResolversByFunctionResponseOps(
      v: ListResolversByFunctionResponse
  ): ListResolversByFunctionResponseOps = new ListResolversByFunctionResponseOps(v)

}
