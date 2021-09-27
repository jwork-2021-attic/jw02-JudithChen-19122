### task1

##### `example`的类图：其中`Position`是`Gourd`的内部类

![](https://github.com/JudithChen-19122/Pictures/blob/main/pictures-for-java/project2/class-diagram-1.png?raw=true)

##### `example`的`Scene`中`main`方法执行过程中的对象时序图:

![](https://github.com/JudithChen-19122/Pictures/blob/main/pictures-for-java/project2/timeline-1.png?raw=true)

##### `example`的设计理念:

`example`的设计中，将功能模块进行了很好的划分和封装，将排序的功能作为一个独立的sorter类来进行设计，这有助于通过排序功能的通用设计，实现代码的复用。本次设计中比较独特的地方是将获得排序方案的过程与真正的排序过程分割开，通过geezer对队列信息进行处理后，以一个通用的排序模型，调用sorter来实现排序方案的提前设计，并存在log中，后续再通过对log的处理，依据已经设计好的方案一步步排序和打印，从而减少不必要的代码的混用，给排序带来麻烦，对应于解题场景，也就是老爷爷先在脑子里想好了总体方案，再进行一步步的交换排序。值得关注的是，在`example`的设计中，将`Position`作为内部类来设计，在排序过程中先由葫芦娃调用`Position`把位置上的内容设置成自己，同时`Position`将葫芦娃对应的位置设置成this`position`，从而实现数据的统一。

通过对关联数据的封装，来保护数据，减少复杂度，与现实解题场景有很好的对应，比如将位置信息，颜色信息等封装在`Gourd`类中，这方便了后续的打印过程，以自然的逻辑来实现功能，能够减少代码的错误与遗漏；同时运用接口，便于实现代码的复用和相关功能函数的调用，使得结构更加清楚，避免了一些不必要的错误。内部类提供了可以继承多个具体的或者抽象的类的能力，“每个内部类都能独立地继承一个（接口的）实现，所以无论外围类是否已经继承了某个（接口的）实现，对于内部类都没有影响”，使用内部类大大的方便了我们对接口的使用，从而减少了不必要的错误。比如在`example`中，内部类的使用，有利于协调好`Position` 、`Gourd`、`Linable`的关系。`example`是一个非常完整的设计，其对排序方案与排序过程的分割处理还有内部类的使用很有启示意义，同时过程相对比较繁复，代码对于初学者而言，阅读可能有一定困难，也许可以加以一定的简化，将模块划分得更加清晰。

### task2

（注意直接运行只有一种排序，在main函数中注释中可以选择另一种排序）

##### task2的类图：

![](https://github.com/JudithChen-19122/Pictures/blob/main/pictures-for-java/project2/class-diagram-2.png?raw=true)

##### task2的视频地址：

1. quicksort：https://asciinema.org/a/tv9orjDQKRF2mz3mwQxMSDtZd

2. selectsort:   https://asciinema.org/a/Hc8k031ByHo010ZdE7v7qUwOh

### task3

（注意直接运行只有一种排序，在main函数中注释中可以选择另一种排序）

##### task3的类图：

![](https://github.com/JudithChen-19122/Pictures/blob/main/pictures-for-java/project2/class-diagram-3.png?raw=true)

##### task3的视频地址：

1. quicksort：https://asciinema.org/a/4L9UmslAMdy0XszuNVRRq3yCV

2. selectsort:  https://asciinema.org/a/ucU6rUdA2RCMtnG82MCq2K7BF











