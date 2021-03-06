# SortAlgorithms
一系列常用的排序算法。A series of commonly used sorting algorithms.
该开源代码通过策略模式封装排序算法，并通过工厂模式实例化对象，可以非常容易的扩展功能或进行单元测试。

## 说明：
该开源代码默认已经提供17种常用排序算法，包括“珠排序，猴子排序，冒泡排序，桶排序，鸡尾酒排序，梳排序，计数排序，地精排序，堆排序，插入排序，内省排序，归并排序，快速排序，基数排序，选择排序，希尔排序，希尔排序”。但是只实现了“冒泡排序，插入排序，选择排序等”最简单的几个，其余部分会慢慢完善。
> **Note:** 所有排序算法实现完成后，会进行测评从而寻找“最优”。

## 编译及运行方式：
$ `cd sort`<br/>
$ `mkdir output`<br/>
$ `javac -d output *.java`<br/>
$ `cd output`<br/>
$ `java pers.wady.sort.Main`<br/>
