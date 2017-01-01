#What is this?

Just a playground for testing some SpringBoot stuff like integration testing.

See also: https://spring.io/blog/2016/04/15/testing-improvements-in-spring-boot-1-4

Tests using a mock service implementation when doing an integration test with `MockMvc`. 
See `ExampleIntegrationTest` and how it references `TestConfiguration` which uses `@Primary` 
to override the service implementation. The assertion in the test expects a different value 
than the real service implementation returns.

See https://groups.google.com/forum/#!topic/wildfly-swarm/1jV82wtjs0Y
