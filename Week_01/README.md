学习笔记

时间复杂度分析：
只有在同一块代码在不同情况下执行时间有不同的量级差距，才会使用这三种复杂度分析

1.最好情况时间复杂度：最理想情况下的时间复杂度；

2.最坏情况时间复杂度：最糟糕情况下的时间复杂度；

3.平均情况时间复杂度：加权平均时间复杂度，期望时间复杂度；

4.均摊时间复杂度：其实就是一种特殊的平均时间复杂度

	分析方法：摊还分析
	
	适用情况：特殊情况的复杂度相比其他大部分情况的复杂度高一两个量级的情况下，而且这些操作之间有连贯的时序性（例：执行一次高复杂度之后，连续执行n次低复杂度，循环往复），就可以把特殊情况的复杂度分摊到其他情况的复杂度
	

算法的关键：找到最小重复单元
