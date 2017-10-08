"# R-intro-cn" 

### 原始说明
最早的版本的是texinfo版本（2004~2005年左右，可能是国内最早系统介绍R语言的文档了），后来考虑做成PDF版本的（当时Texinfo中文转化很多坑），就用Latex重新写了一遍。以下是2006年原始稿子的备注说明。

> 
> 1. 要在f/c.ind文件中对索引排序(可以用Excel手工做，如排序，加\hyperpage），同时把页码如下转换一下，然后运行Latex：
> 如  
> 1 --〉\hyperpage{1}
> 
> 同时在f/c.ind里面将所有内容放在下面的环境中：  
> \begin{multicols}{2}  
> \end{multicols}  
> 
> 2. 在每一章节后面加上  
> \hlabel{章节的英文名字}  
> 章节之间的关联直接用英文名字。  
> 
> 3. 增加一节附录讨论R术语的中文命名  
> 
> 4. R 手册的统一命名  
> R-faq_cn.pdf
> 
> 5. 使用自己定义的\hlink和\hlabel作连接。具体见R-intro_cn.tex里面的定义。  
> 
> 6. 自己定义的命令\findex, \cindex里面不能输入特殊字符，此时用下面的方法解决：  
> \index{f}{\verb.&.}
> 
> 7. @math --> \rmath 其他没有什么特别定义。  
> 
> 8. 进度说明：
> 
> 	“矩阵部分”校正完。可能需要xxx看一下（6月23日）。
> 

### 2017年说明  
原来文件放在 http://www.biosino.org/R/R-doc 。但现在链接出问题了，经常有人找我要PDF版本的。现在没有时间整理，就把底稿公开出来（陆续还包括其它R文档的中文版本）。期望可以和开源社区可以一起整理，有兴趣者可以直接Email我：ghding@gmail.com。

新版需要改写成Markdown格式，以GitBook的方式发布。
