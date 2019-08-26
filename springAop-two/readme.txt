Spring AOP(面向方面编程)框架，用于在模块化方面的横切关注点。简单得说，它只是一个拦截器拦截一些过程，
例如，当一个方法执行，Spring AOP 可以劫持一个执行的方法，在方法执行之前或之后添加额外的功能。
在Spring AOP中，有 4 种类型通知(advices)的支持：
通知(Advice)之前 - 该方法执行前运行
通知(Advice)返回之后 – 运行后，该方法返回一个结果
通知(Advice)抛出之后 – 运行方法抛出异常后，
环绕通知 – 环绕方法执行运行，结合以上这三个通知。
下面的例子显示Spring AOP 通知如何工作。
在 bean 配置文件(applicationContext.xml)，创建一个 bean 的 HijackBeforeMethod 类，并命名为“customerServiceProxy” 作为一个新的代理对象。
‘target’ – 定义你想拦截的bean。
‘interceptorNames’ – 定义要应用这个代理/目标对象的类(通知)。