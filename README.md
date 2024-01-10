# micronaut-spring-no-bean-of-type-applicationeventpublisher-exists

Reproduce of `io.micronaut.context.exceptions.NoSuchBeanException: No bean of type [io.micronaut.context.event.ApplicationEventPublisher<io.micronaut.context.event.StartupEvent>] exists`.

```
Exception in thread "main" java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:119)
	at java.base/java.lang.reflect.Method.invoke(Method.java:578)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:91)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:53)
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:58)
Caused by: io.micronaut.context.exceptions.NoSuchBeanException: No bean of type [io.micronaut.context.event.ApplicationEventPublisher<io.micronaut.context.event.StartupEvent>] exists. Make sure the bean is not disabled by bean requirements (enable trace logging for 'io.micronaut.context.condition' to check) and if the bean is enabled then ensure the class is declared a bean and annotation processing is enabled (for Java and Kotlin the 'micronaut-inject-java' dependency should be configured as an annotation processor).
	at io.micronaut.context.DefaultBeanContext.newNoSuchBeanException(DefaultBeanContext.java:2773)
	at io.micronaut.context.DefaultApplicationContext.newNoSuchBeanException(DefaultApplicationContext.java:304)
	at io.micronaut.context.DefaultBeanContext.resolveBeanRegistration(DefaultBeanContext.java:2735)
	at io.micronaut.context.DefaultBeanContext.getBean(DefaultBeanContext.java:1729)
	at io.micronaut.context.DefaultBeanContext.getBean(DefaultBeanContext.java:856)
	at io.micronaut.context.BeanLocator.getBean(BeanLocator.java:96)
	at io.micronaut.context.DefaultBeanContext.publishEvent(DefaultBeanContext.java:1815)
	at io.micronaut.context.DefaultBeanContext.start(DefaultBeanContext.java:376)
	at io.micronaut.context.DefaultApplicationContext.start(DefaultApplicationContext.java:199)
	at io.micronaut.spring.context.MicronautApplicationContext.start(MicronautApplicationContext.java:458)
	at com.example.demo.DemoApplication.main(DemoApplication.java:14)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	... 4 more
```
