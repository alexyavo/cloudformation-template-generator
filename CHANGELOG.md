# Change Log

All notable changes to this project will be documented in this file.
This project adheres to [Semantic Versioning](http://semver.org/).

## [3.11] 2022-03-29
  - Scala 2.13 compatability.

## [3.10.3] 2021-05-21
  - IMPORTANT: With this release, we move to publishing to Maven Central instead of Bintray (since it is gone), and renamed the group ID in Maven Central to `com.bayer`.  But the Scala/Java package names are still monsanto.
  - Added tags to IAM (see [#280](https://github.com/MonsantoCo/cloudformation-template-generator/pull/280))

## [3.10.2] 2021-05-20
  - Changes to add Nodejs14.x runtime (see [#281](https://github.com/MonsantoCo/cloudformation-template-generator/pull/281))
  - Sonotype switch (see [#282](https://github.com/MonsantoCo/cloudformation-template-generator/pull/282))
  - NOTE: this was a short lived release...skip along to the next one.

## [3.10.1] 2020-02-14 (<3)
  - Added automation features to SSM Documents (see [#279](https://github.com/MonsantoCo/cloudformation-template-generator/pull/279))
  - Added new lambda runtimes for Node 10 and Python 3.7 (see [#277](https://github.com/MonsantoCo/cloudformation-template-generator/pull/277))


## [3.10.0] 2019-07-22
  - Added Kinesis Firehose Delivery Stream S3 support (see [#270](https://github.com/MonsantoCo/cloudformation-template-generator/pull/270))
  - Added Kinesis Stream Encryption support (see [#270](https://github.com/MonsantoCo/cloudformation-template-generator/pull/270))
  - Add support for AWS::EC2::VPCEndpoint (see [#255](https://github.com/MonsantoCo/cloudformation-template-generator/pull/255))
  - add dynamodb SSESpecification (see [#256](https://github.com/MonsantoCo/cloudformation-template-generator/pull/256))
  - Adds support for TargetTrackingScalingPolicyConfiguration (see [#257](https://github.com/MonsantoCo/cloudformation-template-generator/pull/257))
  - Adds support for PointInTimeRecoverySpecification and Tags (see [#258](https://github.com/MonsantoCo/cloudformation-template-generator/pull/258))
  - Fix errors in ApplicationAutoScaling models (see [#259](https://github.com/MonsantoCo/cloudformation-template-generator/pull/259))
  - Added Description fields. Changed fields to Token[...] (see [#261](https://github.com/MonsantoCo/cloudformation-template-generator/pull/261))
  - Add EKS support and unit test. (see [#263](https://github.com/MonsantoCo/cloudformation-template-generator/pull/263))
  - Add GroupName support for security group. (see [#264](https://github.com/MonsantoCo/cloudformation-template-generator/pull/264))
  - Add AssociatePublicIpAddress field to LaunchConfiguration. (see [#265](https://github.com/MonsantoCo/cloudformation-template-generator/pull/265))
  - added billing mode (see [#266](https://github.com/MonsantoCo/cloudformation-template-generator/pull/266))
  - BillingMode PAY_PER_REQUEST validation also for GlobalSecondaryIndexes (see [#269](https://github.com/MonsantoCo/cloudformation-template-generator/pull/269))
  - Add secrets manager (see [#271](https://github.com/MonsantoCo/cloudformation-template-generator/pull/271))
  - Fill out more code build stuff. (see [#272](https://github.com/MonsantoCo/cloudformation-template-generator/pull/272))
  - Added PermissionsBoundary for Role (see [#273](https://github.com/MonsantoCo/cloudformation-template-generator/pull/273))
  - Added UNSAFEFunctionCallToken to represent cloudformation functions (see [#274](https://github.com/MonsantoCo/cloudformation-template-generator/pull/274))
  - Update travis to openjdk8 and bump minor Scala versions (see [#276](https://github.com/MonsantoCo/cloudformation-template-generator/pull/276))
  - Added automation features to SSM Documents (see [#275](https://github.com/MonsantoCo/cloudformation-template-generator/pull/275))

## [3.9.1] - 2018-06-08
  - Added Node 8.10 as a lambda runtime option (see [#254](https://github.com/MonsantoCo/cloudformation-template-generator/pull/254))
  - Added the tags field to Lambda Functions (see [#254](https://github.com/MonsantoCo/cloudformation-template-generator/pull/254))

## [3.9.0] - 2018-06-01

**This release contains a change to the fromName builder that is code compatible, but will result in your templates having a different name format for resources if you were using the fromName builder**

 - Handle template addition for Description and AWSTemplateFormatVersion (see [#251](https://github.com/MonsantoCo/cloudformation-template-generator/pull/251))
 - Amiid deprecation (see [#252](https://github.com/MonsantoCo/cloudformation-template-generator/pull/252))
 - Switched fromName tag generator to put the stack name first. (see [#253](https://github.com/MonsantoCo/cloudformation-template-generator/pull/253))



## [3.8.2] - 2018-04-26
 - Add support for custom CF resource calls (see [#250](https://github.com/MonsantoCo/cloudformation-template-generator/pull/250))
 - Add support for TimeToLiveSpecification (see [#248](https://github.com/MonsantoCo/cloudformation-template-generator/pull/248))
 - Update sample usage template documentation and add some ami images for asia regions (see [#249](https://github.com/MonsantoCo/cloudformation-template-generator/pull/249))


## [3.8.1] - 2018-2-23
 - Make TracingConfig an enum (see [#234](https://github.com/MonsantoCo/cloudformation-template-generator/pull/234))
 - Add CodeBuild cache (see [#235](https://github.com/MonsantoCo/cloudformation-template-generator/pull/235))
 - Add default None to SNS resources. (see [#237](https://github.com/MonsantoCo/cloudformation-template-generator/pull/237))
 - Change Events::Rule target Input to Token[String] (see [#238](https://github.com/MonsantoCo/cloudformation-template-generator/pull/238))
 - Add default values to optional EMR configurations (see [#239](https://github.com/MonsantoCo/cloudformation-template-generator/pull/239))
 - Fix IAM Policies (see [#241](https://github.com/MonsantoCo/cloudformation-template-generator/pull/241))
 - upgrade to sbt 1.1 (see [#242](https://github.com/MonsantoCo/cloudformation-template-generator/pull/242))
 - add VpcRef ADT to allow VPC ID to be set more flexibly (see [#243](https://github.com/MonsantoCo/cloudformation-template-generator/pull/243))
 - Add missing arguments to ApiGateway ApiKey (see [#244](https://github.com/MonsantoCo/cloudformation-template-generator/pull/244))
 - Update simple template documentation example so it compiles and runs (see [#245](https://github.com/MonsantoCo/cloudformation-template-generator/pull/245))
 - Upgrade/extend `AWS::Elasticsearch::Domain` to support VPCOptions (see [#246](https://github.com/MonsantoCo/cloudformation-template-generator/pull/246))
 - Add ApplicationAutoScaling (see [#247](https://github.com/MonsantoCo/cloudformation-template-generator/pull/247))



## [3.8.0] - 2017-12-18


**Note: This contains a breaking change to Template and default parameters in some other minor classes.**

- Make Template match documentation (see [#221](https://github.com/MonsantoCo/cloudformation-template-generator/pull/221))
- Add missing AWS::Lambda::Function parameters (see [#230](https://github.com/MonsantoCo/cloudformation-template-generator/pull/230))
- Add full support for latest AWS::Events::Rule (see [#228](https://github.com/MonsantoCo/cloudformation-template-generator/pull/228))
- Add CodePipeline attribute Fns (see [#224](https://github.com/MonsantoCo/cloudformation-template-generator/pull/224))
- Other minor improvements

## [3.7.1] - 2017-11-12

- Add support for AWS Batch (see [#203](https://github.com/MonsantoCo/cloudformation-template-generator/pull/203))
- Add support for EFS  (see [#208](https://github.com/MonsantoCo/cloudformation-template-generator/pull/208))
- Add support for DependsOn in many classes (see[#205](https://github.com/MonsantoCo/cloudformation-template-generator/pull/205))
- Add support for RetentionPeriodHours to AWS::Kinesis::Stream(see [#211](https://github.com/MonsantoCo/cloudformation-template-generator/pull/211))
- Closed [#166](https://github.com/MonsantoCo/cloudformation-template-generator/issues/166) and [#160](https://github.com/MonsantoCo/cloudformation-template-generator/issues/160)
- Add support for new lambda runtimes (see[#201](https://github.com/MonsantoCo/cloudformation-template-generator/pull/201))
- Other minor improvements

## [3.7.0] - 2017-10-04

**Note: This contains a breaking change to `AWS::AutoScaling::AutoScalingGroup` to make DesiredCapacity an optional field. See [#196](https://github.com/MonsantoCo/cloudformation-template-generator/pull/196) for more details.**

- Add support for AWS EC2 Systems Manager (SSM) (see [#195](https://github.com/MonsantoCo/cloudformation-template-generator/pull/195))
- Add support for AWS::CodeCommit::Repository  (see [#200](https://github.com/MonsantoCo/cloudformation-template-generator/pull/200))
- Add support for TreatMissingData parameter of AWS::CloudWatch::Alarm  (see [#197](https://github.com/MonsantoCo/cloudformation-template-generator/pull/197))
- Add support for AWS::ApiGateway::{UsagePlan,UsagePlanKey}  (see [#187](https://github.com/MonsantoCo/cloudformation-template-generator/pull/187))

## [3.6.3] - 2017-07-19
- Add support for custom namespace in cloudwatch (see [#178](https://github.com/MonsantoCo/cloudformation-template-generator/pull/178))
- Make RuleCondition accept Option[Seq[Token[String]]] (see [#182](https://github.com/MonsantoCo/cloudformation-template-generator/pull/182))
- Add DependsOn attribute to ElasticLoadBalancingV2 resources (see [#183](https://github.com/MonsantoCo/cloudformation-template-generator/pull/183))
- Align managed policy arns parameter types (see [#179](https://github.com/MonsantoCo/cloudformation-template-generator/pull/179))

## [3.6.2] - 2017-06-29

- Add InstanceProfileName (see [#168](https://github.com/MonsantoCo/cloudformation-template-generator/pull/168))
- Add AWS::SNS::Subscription (see [#170](https://github.com/MonsantoCo/cloudformation-template-generator/pull/170))
- Add support for ContainerDefinition MountPoints (see [#164](https://github.com/MonsantoCo/cloudformation-template-generator/pull/164))
- Cache the ivy cache, compiled compiler interface, etc. (see [#175](https://github.com/MonsantoCo/cloudformation-template-generator/pull/175))
- Add `host-header` RuleCondition builder method (see [#176](https://github.com/MonsantoCo/cloudformation-template-generator/pull/176))
- Improve has template (see [#169](https://github.com/MonsantoCo/cloudformation-template-generator/pull/169))
- Make AllocatedStorage optional for non-NewRds instances (see [#174](https://github.com/MonsantoCo/cloudformation-template-generator/pull/174))
- Cloudwatch dimension general token (see [#177](https://github.com/MonsantoCo/cloudformation-template-generator/pull/177))

## [3.6.1] - 2017-05-22

- Add accountId to managed policies (see [#135](https://github.com/MonsantoCo/cloudformation-template-generator/pull/135))

## [3.6.0] - 2017-04-19

**Note: This contains a small change to `AWS::IAM::ManagedPolicy` that may not be backwards compatible if you were relying on the implicit conversion from `T` to `Option[T]`.  If you were already specifying your `Path` as `Some("blah")`, you're fine.  Otherwise, it should be a simple change in your code to update it.  See [#149](https://github.com/MonsantoCo/cloudformation-template-generator/pull/149) for more details.**

- Implement support for ElasticLoadBalancingV2 (see [#147](https://github.com/MonsantoCo/cloudformation-template-generator/pull/147))
- Change `Path` type in IAM resources to be `Token[String]` (see [#149](https://github.com/MonsantoCo/cloudformation-template-generator/pull/149))
- Change `AWS::RDS::DBInstance`'s `Option[A]`s to `Option[Token[A]]` (see [#152](https://github.com/MonsantoCo/cloudformation-template-generator/pull/152))
- Add DependsOn parameter to AWS::ECS::Service and AWS::ECS::Cluster (see [#153](https://github.com/MonsantoCo/cloudformation-template-generator/pull/153))
- Add AWS::Events::Rule (see [#155](https://github.com/MonsantoCo/cloudformation-template-generator/pull/155))
- Allow creation of alias records by hosted zone ID (see [#157](https://github.com/MonsantoCo/cloudformation-template-generator/pull/157))
- Add ProviderArns to `AWS::ApiGateway::Authorizer` (see [#158](https://github.com/MonsantoCo/cloudformation-template-generator/pull/158))
- Add support for AWS::Logs::*  (see [#159](https://github.com/MonsantoCo/cloudformation-template-generator/pull/159))

## [3.5.5] - 2017-03-13

- Added BooleanParameter (see [#144](https://github.com/MonsantoCo/cloudformation-template-generator/pull/144))
- Added ElasticsearchVersion (see [#145](https://github.com/MonsantoCo/cloudformation-template-generator/pull/145))

## [3.5.4] - 2017-03-03

- Update IAM Policy Statements to support multiple resources (see [#143](https://github.com/MonsantoCo/cloudformation-template-generator/pull/143))
- Add support for ECS Task Definitions, Services, and Clusters (see [#142](https://github.com/MonsantoCo/cloudformation-template-generator/pull/142))

## [3.5.3] - 2017-02-16

-  Add support for Id and Sid to IAM policies and statements (see [#139](https://github.com/MonsantoCo/cloudformation-template-generator/pull/139))
-  Add support for Fn::Split (see [#141](https://github.com/MonsantoCo/cloudformation-template-generator/pull/141))
-  Add RedrivePolicy for SQS (see [#137](https://github.com/MonsantoCo/cloudformation-template-generator/pull/137))

## [3.5.2] - 2017-01-03

-   Add `AWS::EMR::Step` support (see [#129](https://github.com/MonsantoCo/cloudformation-template-generator/pull/129))

-   Fixed a type bug in `AWS::IAM::Role` (see [#131](https://github.com/MonsantoCo/cloudformation-template-generator/pull/131))

-   Changed `TableName` in `AWS::DynamoDB::Table` to be optional in accordance with the AWS docs (see [#133](https://github.com/MonsantoCo/cloudformation-template-generator/pull/133))

-   Add `AWS::Lambda::Alias` and `AWS::Lambda::Version` support (see [#96](https://github.com/MonsantoCo/cloudformation-template-generator/pull/96))

## [3.5.1] - 2016-12-05

-   Added `Environment`, `KmsKeyArn`, and `VpcConfig` as optional parameters for `AWS::Lambda::Function`.  They are defaulted to `None`, thus the change will be backwards compatible.  (see [#117](https://github.com/MonsantoCo/cloudformation-template-generator/pull/127))

## [3.5.0] - 2016-11-30

-   Support for AWS's new features supporting [cross template references](https://aws.amazon.com/blogs/aws/aws-cloudformation-update-yaml-cross-stack-references-simplified-substitution/)  (see [#119](https://github.com/MonsantoCo/cloudformation-template-generator/pull/119))

-   Support for [Fn::Sub](https://aws.amazon.com/blogs/aws/aws-cloudformation-update-yaml-cross-stack-references-simplified-substitution/), which provides a cleaner alternative to `Fn::Join` and `Fn::GetAtt`  (see [#119](https://github.com/MonsantoCo/cloudformation-template-generator/pull/119))

-   Add TemplateBase to auto discover template components (see [#120](https://github.com/MonsantoCo/cloudformation-template-generator/pull/120))

-   Add `AWS::EMR::Cluster` support (see [#121](https://github.com/MonsantoCo/cloudformation-template-generator/pull/121))

-   Add KMS support (see [#125](https://github.com/MonsantoCo/cloudformation-template-generator/pull/125))

-   Add support for Scala 2.12 (see [#122](https://github.com/MonsantoCo/cloudformation-template-generator/pull/122))

-   Fixed `AWS::ApiGateway::Deployment`, changing `Token[Token[String]]` to just `Token[String]` (see [#123](https://github.com/MonsantoCo/cloudformation-template-generator/pull/123/files))

-   Changed nested stack parameters to take `Map[String, Token[String]]` (see [#126](https://github.com/MonsantoCo/cloudformation-template-generator/pull/126))

## [3.4.0] - 2016-11-07

### Added

-   Support for AWS::CloudFormation::Stack (see [#100](https://github.com/MonsantoCo/cloudformation-template-generator/pull/100))

-   Change Description property of Function to Option[Token[String]] so it can contain CloudFormation expressions  (see [#97](https://github.com/MonsantoCo/cloudformation-template-generator/issues/97))

-   Ports in Security groups can now be parameterized (see [#101](https://github.com/MonsantoCo/cloudformation-template-generator/pull/101))

-   Add stream specification for DynamoDB (see [#94](https://github.com/MonsantoCo/cloudformation-template-generator/pull/94))

-   Add support for built-in AWS policies (see [#108](https://github.com/MonsantoCo/cloudformation-template-generator/pull/108))

-   Add deletion policy to AWS::DynamoDB::Table (see [#109](https://github.com/MonsantoCo/cloudformation-template-generator/pull/109))

-   Added the following resources: (see [#111](https://github.com/MonsantoCo/cloudformation-template-generator/pull/111))
    - AWS::EC2::SubnetNetworkAclAssociation
    - AWS::ElastiCache::CacheCluser
    - AWS::ElastiCache::SubnetGroup
    - AWS::ECR::Repository

-   Added all supported database engines to `AWS::RDS::DBInstance::Engine` (see [#111](https://github.com/MonsantoCo/cloudformation-template-generator/pull/111))

-   Added all supported disk types to `AWS::EC2::Volume` (see [#111](https://github.com/MonsantoCo/cloudformation-template-generator/pull/111))

-   Add Kinesis support (see [#112](https://github.com/MonsantoCo/cloudformation-template-generator/pull/112))

-   Add "DependsOn" to AWS::DynamoDb::Table (see [#115](https://github.com/MonsantoCo/cloudformation-template-generator/pull/115))


## [3.3.4] - 2016-05-06

**Note: This breaks backwards compatibility for some people using ApiGateways.**

### Changed

-   Datatypes for ApiGateway (see [#93](https://github.com/MonsantoCo/cloudformation-template-generator/pull/93))


## [3.3.3] - 2016-04-29

### Added

-   Support for AWS::CloudFront:Distribution (see [#71](https://github.com/MonsantoCo/cloudformation-template-generator/pull/71))

-   Support for tokens in an output (see [#74](https://github.com/MonsantoCo/cloudformation-template-generator/pull/74))

-   AWS/Lambda CloudWatch Alarm Namespace (see [#87](https://github.com/MonsantoCo/cloudformation-template-generator/pull/87))

-   Support for NodeJs4.3 as a Lambda rutime (see [#88](https://github.com/MonsantoCo/cloudformation-template-generator/pull/88))

-   Support for AWS::ApiGateway (see [#89](https://github.com/MonsantoCo/cloudformation-template-generator/pull/89))

-   Support for IAMPolicyVersions (see [#90](https://github.com/MonsantoCo/cloudformation-template-generator/pull/90))

## [3.3.2] - 2016-04-08

### Added

-   Support for AWS::CloudTrail::Trail

-   Support for AWS::DataPipeline::Pipeline

-   Ability to use DBSubnet parameters for RDS

-   Ability to use Subnet parameters for EC2 (see [#81](https://github.com/MonsantoCo/cloudformation-template-generator/issues/81))


## [3.3.1] - 2016-03-30

### Changed

-   Modified Fn::Not to be a NestableAmazonFunctionCall to support using the function within an Fn::And block

## [3.3.0] - 2016-03-18

**Note: This breaks backwards compatibility for anyone using custom NAT Gateways.**

### Added

-   Added support for AWS::Elasticsearch::Domain and the related types (see [#73](https://github.com/MonsantoCo/cloudformation-template-generator/issues/73))

### Changed

-   Removed the custom NAT gateway support in favor of the official CloudFormation mechanism (see [#72](https://github.com/MonsantoCo/cloudformation-template-generator/issues/72))


## [3.2.0] - 2016-03-02

**Note: Minor breaks in backwards compatibility on `AWS::EC2::Subnet`.  If you use the `Builder` wrappers, the change is backwards compatible.**

### Added

-   Added custom type to remotely manage Route 53 entries in another account (see [#75](https://github.com/MonsantoCo/cloudformation-template-generator/pull/75)).

### Changed

-   AvailabilityZone is optional for Subnet (see [#69](https://github.com/MonsantoCo/cloudformation-template-generator/pull/69))
-   Fixed an issue in the NAT Gateway custom type that can cause an unrecoverable failure if the gateway was manually deleted.


## [3.1.2] - 2016-02-08

### Added

-   Added resources to support ElasticBeanstalk (see [#64](https://github.com/MonsantoCo/cloudformation-template-generator/pull/64))

## [3.1.1] - 2016-02-02

### Changed

-   Rolled back the Token changes for functions (see [#60](https://github.com/MonsantoCo/cloudformation-template-generator/issues/60))

## [3.1.0] - 2016-01-26

**Note: Minor breaks in backwards compatibility**

### Added

-   Added the ability to work with NAT gateways.  Requires a custom Lambda function.  See README.md.

-   Added `AWS::CloudFormation::WaitCondition` and `AWS::CloudFormation::WaitConditionHandle` to support pausing
        for resources to do things.

-   Added support for the `Fn::GetAZs` function

-   Added in VPN support

### Changed

-   Improved EIP model to better handle VPC vs Classic EIPs.  Changes are backwards compatible, but
        existing methods are now deprecated.

-   Most functions updated to use `Token[ConditionRef]` instead of `Token[String]`

-   Changed how implicits are handle in creating `AWS::EC2::Route` to simplify the code

## [3.0.6] - 2016-01-19

### Added

-   Support `AWS::EC2::EIPAssociation` (closes [#43](https://github.com/MonsantoCo/cloudformation-template-generator/issues/43))

-   Custom type for IPAddress

-   Support `AWS::EC2::VPCPeeringConnection` in routes (closes [#47](https://github.com/MonsantoCo/cloudformation-template-generator/issues/47))

-   Support `PrivateIP` on EC2 instances (closes [#49](https://github.com/MonsantoCo/cloudformation-template-generator/issues/49))

-   Support `MapPublicIpOnLaunch` on subnets (closes [#51](https://github.com/MonsantoCo/cloudformation-template-generator/issues/51))

-   Support `AWS::EC2::CustomerGateway`

### Changed

-   Have predictable order in the output JSON (fixes [#45](https://github.com/MonsantoCo/cloudformation-template-generator/issues/45))

## [3.0.5] - 2016-01-07

### Added

-   Basic Lambda support


## [3.0.4] - 2015-11-30

### Changed

-   Minor updates to README.md, CHANGELOG.md and MAINTAINERS

## [3.0.3] - 2015-11-30

The "tylersouthwick" release!

### Added

-   CHANGELOG.md

-   SQS and DynamoDB support

-   Support for IAM Policy Conditions

-   aws triple-quoted string interpolation

## [3.0.2] - 2015-10-27

### Changed

-   Made names of auto-generated SecurityGroup and SecurityGroupIngress
    resources deterministic, i.e., removed the UUID part of the name,
    and easier to read.

## [3.0.1] - 2015-10-21

### Added

-   Add mechanism to make a SecurityGroupRoutable from a DBInstance.

## [3.0.0] - 2015-02-17

### Added

-   Provide builder for RDS DBInstances

### Deprecated

-   Create AWS::RDS::DBInstance from default case class constructor.
