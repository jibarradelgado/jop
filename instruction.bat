set param1=test
set param2=wcet/mrtc
set param3=SimultaneousLinearEquations
set param4=run
make java_app wcet -e P1="%param1%" P2="%param2%" P3="%param3%" WCET_METHOD="%param4%" WCET_DFA=yes

set param2=%param2:/=_%

if exist "java\target\wcet\%param2%_%param3%_%param4%\report" (
	echo Directory exists
	cd "java\target\wcet\%param2%_%param3%_%param4%\report"
	make
	index.html
	pause
	exit
) else (
	echo There was an error with the path
	pause
	exit
) 

