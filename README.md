# chaos-monkey-demo

### To see bean creation error from proxying BeanPostProcessor implementation:
run application as is

### To see stack overflow error from infinite loop caused by proxying ApplicationListener implementation:
remove ```@Component``` annotation from ```BeanPostProcessorComponent``` class and then run application