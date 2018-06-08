# CheckUtils
校验工具类🔧 支持Lambda表达式传入异常 并进行处理



### 使用方法

- 检查布尔型表达式并抛出异常

```
CheckUtils.checkArgument(1 != 0, () -> new IllegalArgumentException("Invalid expression!"));
```

- 检查表达式是否为空并抛出异常

```
CheckUtils.checkNotNull(null, () -> new IllegalArgumentException("Null expression!"));
```



