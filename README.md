# Zero-Jacoco
Zero-Jacoco
# 1. 概述
## 1.1. 简介
> JaCoCo，即 Java Code Coverage，是一款开源的 Java 代码覆盖率统计工具。支持 Ant 、Maven、Gradle 等构建工具，
> 支持 Jenkins、Sonar 等持续集成工具，支持 Java Agent 技术远程监控 Java 程序运行情况，支持Eclipse、IDEA等IDE，
> 提供HTML，CSV 等格式的报表导出，轻量级实现，对外部库和系统资源的依赖性小，性能开销小。 JaCoCo 支持从 JDK1.0 版本到 JDK1.8 版本 的 Java 类文件。
> 但是，JaCoCo 工具所需的JRE 版本最小为 1.5。另外，1.6及以上版本的测试中的类文件必须包含有效的堆栈映射帧。

## 1.2. 特性：
> 1. 指令（C0）、分支（C1）、行、方法、类型和圈复杂度的覆盖分析。 
> 2. 基于 Java 字节码，因此也可以在没有源文件的情况下工作。 
> 3. 通过基于实时检测的Java 代理进行简单集成。通过 API 可以实现其他集成场景，例如自定义类加载器。 
> 4. 与框架无关：基于 Java VM 的应用程序都可以顺利集成，例如普通 Java 程序、OSGi 框架、Web 容器或 EJB 服务器。 
> 5. 与所有已发布的 Java 类文件版本兼容。 
> 6. 支持不同 JVM 语言。 
> 7. 多种报告格式（HTML、XML、CSV）。 
> 8. 在任何时间点，可以使用远程协议和 JMX 控制从覆盖代理请求执行数据转储。 
> 9. 用于收集和管理执行数据并创建结构化覆盖率报告的Ant 任务。 
> 10. Maven 插件，用于收集覆盖信息并在 Maven 构建中创建报告。

## 1.3. 非功能特性：
> 1. 简单的使用和与现有构建脚本和工具的集成。 
> 2. 良好的性能，最小的运行时开销，尤其是对于大型项目。 
> 3. 对外部库和系统资源的依赖最小的轻量级实现。 
> 4. 综合文档。 
> 5. 完整的API文档（JavaDoc）和 其他工具集成的示例。 
> 6. 基于JUnit 测试用例的完整功能测试覆盖的回归测试。

# 2. 环境

# 3. 使用
## 3.1. 测试
> 执行mvn clean test 会自动在项目目录：target/site/jacoco/index.html 即可查看到图形化的测试报告
> <br/>点击链接，你可以查看每个类的代码覆盖情况

## 3.2. 总结
> 本文简单介绍 JaCoCo 最基本使用和上手，希望你可以通过官网探索更多的高级功能,关于覆盖率给你一些建议： 
> 1. 覆盖率指标大多数情况下仅作为参考，不要用它作为考核指标 
> 2. 不要过于追求覆盖率指标，100% 的覆盖率也不能代表你的项目没有 BUG

# 4. 其他

# 5. 参考