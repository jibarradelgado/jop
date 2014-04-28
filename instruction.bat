set param1=test
set param2=wcet
set param3=ManyLoops
set param4=loop
make java_app wcet -e P1="%param1%" P2="%param2%" P3="%param3%" WCET_METHOD="%param4%" WCET_DFA=yes

cd java\target\wcet\%param2%_%param3%_%param4%\report
make 
PAUSE