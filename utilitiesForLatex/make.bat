@echo off
latex -src R-intro_cn.tex
makeindex f.idx 
makeindex c.idx
java Hyperpage f.ind
java Hyperpage c.ind
latex -src R-intro_cn.tex
latex -src R-intro_cn.tex
dvipdfmx R-intro_cn.dvi
del *.aux
del *.toc
del *.lof
del *.lot
del *.ilg
del *.idx
del *.ind
del *.out
del *.log
del *.exa
del *.bak
@echo on