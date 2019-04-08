// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ElasticsearchDomainStatusBuilderOps(val self: ElasticsearchDomainStatus.Builder) extends AnyVal {

  final def domainIdAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.domainId(v)
    }
  } // String

  final def domainNameAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  } // String

  final def arnAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  } // String

  final def createdAsScala(value: Option[Boolean]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.created(v)
    }
  } // Boolean

  final def deletedAsScala(value: Option[Boolean]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.deleted(v)
    }
  } // Boolean

  final def endpointAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  } // String

  final def endpointsAsScala(value: Option[Map[String, String]]): ElasticsearchDomainStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.endpoints(v.asJava)
    } // Map[String, String]
  }

  final def processingAsScala(value: Option[Boolean]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.processing(v)
    }
  } // Boolean

  final def upgradeProcessingAsScala(value: Option[Boolean]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.upgradeProcessing(v)
    }
  } // Boolean

  final def elasticsearchVersionAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.elasticsearchVersion(v)
    }
  } // String

  final def elasticsearchClusterConfigAsScala(
      value: Option[ElasticsearchClusterConfig]
  ): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.elasticsearchClusterConfig(v)
    }
  } // ElasticsearchClusterConfig

  final def ebsOptionsAsScala(value: Option[EBSOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.ebsOptions(v)
    }
  } // EBSOptions

  final def accessPoliciesAsScala(value: Option[String]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.accessPolicies(v)
    }
  } // String

  final def snapshotOptionsAsScala(value: Option[SnapshotOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.snapshotOptions(v)
    }
  } // SnapshotOptions

  final def vpcOptionsAsScala(value: Option[VPCDerivedInfo]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.vpcOptions(v)
    }
  } // VPCDerivedInfo

  final def cognitoOptionsAsScala(value: Option[CognitoOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.cognitoOptions(v)
    }
  } // CognitoOptions

  final def encryptionAtRestOptionsAsScala(
      value: Option[EncryptionAtRestOptions]
  ): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.encryptionAtRestOptions(v)
    }
  } // EncryptionAtRestOptions

  final def nodeToNodeEncryptionOptionsAsScala(
      value: Option[NodeToNodeEncryptionOptions]
  ): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.nodeToNodeEncryptionOptions(v)
    }
  } // NodeToNodeEncryptionOptions

  final def advancedOptionsAsScala(value: Option[Map[String, String]]): ElasticsearchDomainStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.advancedOptions(v.asJava)
    } // Map[String, String]
  }

  final def logPublishingOptionsAsScala(
      value: Option[Map[LogType, LogPublishingOption]]
  ): ElasticsearchDomainStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.logPublishingOptions(v.asJava)
    } // Map[String, LogPublishingOption]
  }

  final def serviceSoftwareOptionsAsScala(value: Option[ServiceSoftwareOptions]): ElasticsearchDomainStatus.Builder = {
    value.fold(self) { v =>
      self.serviceSoftwareOptions(v)
    }
  } // ServiceSoftwareOptions

}

final class ElasticsearchDomainStatusOps(val self: ElasticsearchDomainStatus) extends AnyVal {

  final def domainIdAsScala: Option[String] = Option(self.domainId) // String

  final def domainNameAsScala: Option[String] = Option(self.domainName) // String

  final def arnAsScala: Option[String] = Option(self.arn) // String

  final def createdAsScala: Option[Boolean] = Option(self.created) // Boolean

  final def deletedAsScala: Option[Boolean] = Option(self.deleted) // Boolean

  final def endpointAsScala: Option[String] = Option(self.endpoint) // String

  final def endpointsAsScala: Option[Map[String, String]] = Option(self.endpoints).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def processingAsScala: Option[Boolean] = Option(self.processing) // Boolean

  final def upgradeProcessingAsScala: Option[Boolean] = Option(self.upgradeProcessing) // Boolean

  final def elasticsearchVersionAsScala: Option[String] = Option(self.elasticsearchVersion) // String

  final def elasticsearchClusterConfigAsScala: Option[ElasticsearchClusterConfig] =
    Option(self.elasticsearchClusterConfig) // ElasticsearchClusterConfig

  final def ebsOptionsAsScala: Option[EBSOptions] = Option(self.ebsOptions) // EBSOptions

  final def accessPoliciesAsScala: Option[String] = Option(self.accessPolicies) // String

  final def snapshotOptionsAsScala: Option[SnapshotOptions] = Option(self.snapshotOptions) // SnapshotOptions

  final def vpcOptionsAsScala: Option[VPCDerivedInfo] = Option(self.vpcOptions) // VPCDerivedInfo

  final def cognitoOptionsAsScala: Option[CognitoOptions] = Option(self.cognitoOptions) // CognitoOptions

  final def encryptionAtRestOptionsAsScala: Option[EncryptionAtRestOptions] =
    Option(self.encryptionAtRestOptions) // EncryptionAtRestOptions

  final def nodeToNodeEncryptionOptionsAsScala: Option[NodeToNodeEncryptionOptions] =
    Option(self.nodeToNodeEncryptionOptions) // NodeToNodeEncryptionOptions

  final def advancedOptionsAsScala: Option[Map[String, String]] = Option(self.advancedOptions).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def logPublishingOptionsAsScala: Option[Map[LogType, LogPublishingOption]] =
    Option(self.logPublishingOptions).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
    } // Map[String, LogPublishingOption]

  final def serviceSoftwareOptionsAsScala: Option[ServiceSoftwareOptions] =
    Option(self.serviceSoftwareOptions) // ServiceSoftwareOptions

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticsearchDomainStatusOps {

  implicit def toElasticsearchDomainStatusBuilderOps(
      v: ElasticsearchDomainStatus.Builder
  ): ElasticsearchDomainStatusBuilderOps = new ElasticsearchDomainStatusBuilderOps(v)

  implicit def toElasticsearchDomainStatusOps(v: ElasticsearchDomainStatus): ElasticsearchDomainStatusOps =
    new ElasticsearchDomainStatusOps(v)

}
