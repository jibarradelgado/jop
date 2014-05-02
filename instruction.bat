set param1=test/wcet/test/src
set param2=test
set param3=IfElseTest
set param4=measure6
make java_app wcet -e P1="%param1%" P2="%param2%" P3="%param3%" WCET_METHOD="%param4%" WCET_DFA=yes


if exist "java\target\wcet\%param2%_%param3%_%param4%\report" (
	echo Directory exists
	cd "java\target\wcet\%param2%_%param3%_%param4%\report"
	make
	index.html
	exit
) else (
	echo There was an error with the path
	pause
	exit
) 


