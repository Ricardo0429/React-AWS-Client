// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PrefixListBuilderOps(val self: PrefixList.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrsAsScala(value: Option[Seq[String]]): PrefixList.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.cidrs(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala(value: Option[String]): PrefixList.Builder = {
    value.fold(self) { v =>
      self.prefixListId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListNameAsScala(value: Option[String]): PrefixList.Builder = {
    value.fold(self) { v =>
      self.prefixListName(v)
    }
  }

}

final class PrefixListOps(val self: PrefixList) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrsAsScala: Option[Seq[String]] = Option(self.cidrs).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala: Option[String] = Option(self.prefixListId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListNameAsScala: Option[String] = Option(self.prefixListName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPrefixListOps {

  implicit def toPrefixListBuilderOps(v: PrefixList.Builder): PrefixListBuilderOps = new PrefixListBuilderOps(v)

  implicit def toPrefixListOps(v: PrefixList): PrefixListOps = new PrefixListOps(v)

}
