// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class AliasListEntryBuilderOps(val self: AliasListEntry.Builder) extends AnyVal {

  final def aliasNameAsScala(value: Option[String]): AliasListEntry.Builder = {
    value.fold(self) { v =>
      self.aliasName(v)
    }
  }

  final def aliasArnAsScala(value: Option[String]): AliasListEntry.Builder = {
    value.fold(self) { v =>
      self.aliasArn(v)
    }
  }

  final def targetKeyIdAsScala(value: Option[String]): AliasListEntry.Builder = {
    value.fold(self) { v =>
      self.targetKeyId(v)
    }
  }

}

final class AliasListEntryOps(val self: AliasListEntry) extends AnyVal {

  final def aliasNameAsScala: Option[String] = Option(self.aliasName)

  final def aliasArnAsScala: Option[String] = Option(self.aliasArn)

  final def targetKeyIdAsScala: Option[String] = Option(self.targetKeyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAliasListEntryOps {

  implicit def toAliasListEntryBuilderOps(v: AliasListEntry.Builder): AliasListEntryBuilderOps =
    new AliasListEntryBuilderOps(v)

  implicit def toAliasListEntryOps(v: AliasListEntry): AliasListEntryOps = new AliasListEntryOps(v)

}
